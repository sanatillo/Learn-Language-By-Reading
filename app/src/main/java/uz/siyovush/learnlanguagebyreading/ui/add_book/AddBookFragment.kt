package uz.siyovush.learnlanguagebyreading.ui.add_book
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.siyovush.learnlanguagebyreading.R
import uz.siyovush.learnlanguagebyreading.databinding.FragmentAddBookBinding
import uz.siyovush.learnlanguagebyreading.util.getFilename
import java.io.File
import java.io.FileOutputStream

@AndroidEntryPoint
class AddBookFragment : Fragment(R.layout.fragment_add_book) {

    private val binding by viewBinding(FragmentAddBookBinding::bind)
    private val viewModel by viewModels<AddBookViewModel>()

    private var selectedImageUri: Uri? = null
    private var selectedPdfUri: Uri? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUi()
        binding.toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun setupUi() {
        // TODO
        binding.apply {
            addBtn.setOnClickListener {
                if (binding.titleField.text.toString().isNotEmpty() && selectedPdfUri != null) {
                    val pdfPath = copySelectedPdfFile()
                    viewModel.addBook(pdfPath, binding.titleField.text.toString(), selectedImageUri.toString())
                    findNavController().popBackStack()
                } else {
                    if (binding.titleField.text.toString().isEmpty()) {
                        binding.titleField.error = "Название книги не должно быть пустым!"
                    }
                    if (selectedPdfUri == null) {
                        Toast.makeText(requireContext(), "Выберите PDF-файл!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            ivImage.setOnClickListener {
                selectImage.launch(arrayOf("image/*"))
            }

            tvBtnSelectFile.setOnClickListener {
                selectPdf.launch(arrayOf("application/pdf"))
            }
        }
    }

    private val selectImage = registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        uri?.let {
            selectedImageUri = it
            // Можно отобразить выбранное изображение на экране, если требуется
            binding.ivImage.setImageURI(it)
        }
    }

    private val selectPdf = registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        uri?.let {
            selectedPdfUri = it
            val fileName = it.getFilename(requireActivity().contentResolver)
            binding.tvFileName.text = "$fileName.pdf" // Отображает имя файла
        }
    }

    private fun copySelectedPdfFile(): String? {
        selectedPdfUri?.let {
            val inputStream = requireActivity().contentResolver.openInputStream(it)
            val fileName = it.getFilename(requireActivity().contentResolver).toString()
            val outputFile = File(requireActivity().filesDir, fileName)
            val outputStream = FileOutputStream(outputFile)
            inputStream?.use { input ->
                outputStream.use { output ->
                    input.copyTo(output)
                }
            }
            return outputFile.path
        }
        return null
    }
}