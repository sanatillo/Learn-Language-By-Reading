package uz.siyovush.learnlanguagebyreading.ui.about_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.siyovush.learnlanguagebyreading.R
import uz.siyovush.learnlanguagebyreading.databinding.FragmentAboutAppBinding


class AboutAppFragment : Fragment(R.layout.fragment_about_app) {

    private val binding by viewBinding(FragmentAboutAppBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            ivInstaLogo.setOnClickListener {
                val viewIntent = Intent(
                    "android.intent.action.VIEW",
                    Uri.parse("https://www.instagram.com/a1tech_group/")
                )
                startActivity(viewIntent)
            }
            ivTgLogo.setOnClickListener {
                val viewIntent = Intent(
                    "android.intent.action.VIEW",
                    Uri.parse("https://t.me/Siyovush_Arslonoff_Official")
                )
                startActivity(viewIntent)
            }
            ivA1techLogo.setOnClickListener {
                val viewIntent = Intent(
                    "android.intent.action.VIEW",
                    Uri.parse("https://www.a1tech.uz/")
                )
                startActivity(viewIntent)
            }
        }
    }
}