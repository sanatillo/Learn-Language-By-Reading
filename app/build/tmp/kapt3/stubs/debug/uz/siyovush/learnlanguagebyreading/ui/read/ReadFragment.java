package uz.siyovush.learnlanguagebyreading.ui.read;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020,H\u0016J\b\u00100\u001a\u00020,H\u0016J\u001a\u00101\u001a\u00020,2\u0006\u00102\u001a\u0002032\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u00104\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u00105\u001a\u00020,H\u0003R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010\'R\u000e\u0010*\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Luz/siyovush/learnlanguagebyreading/ui/read/ReadFragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "", "allPage", "getAllPage", "()I", "setAllPage", "(I)V", "allPage$delegate", "Lkotlin/properties/ReadWriteProperty;", "binding", "Luz/siyovush/learnlanguagebyreading/databinding/FragmentReadBinding;", "getBinding", "()Luz/siyovush/learnlanguagebyreading/databinding/FragmentReadBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "book", "Luz/siyovush/learnlanguagebyreading/data/database/entity/BookEntity;", "currentPage", "getCurrentPage", "setCurrentPage", "currentPage$delegate", "dialog", "Luz/siyovush/learnlanguagebyreading/util/CustomDialog;", "gestureDetector", "Landroid/view/GestureDetector;", "sentence", "", "sharedPref", "Luz/siyovush/learnlanguagebyreading/util/PrefManager$Companion;", "tts", "Landroid/speech/tts/TextToSpeech;", "ttsInit", "", "viewModel", "Luz/siyovush/learnlanguagebyreading/ui/read/ReadViewModel;", "getViewModel", "()Luz/siyovush/learnlanguagebyreading/ui/read/ReadViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "word", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "setupUI", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ReadFragment extends androidx.fragment.app.Fragment {
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.speech.tts.TextToSpeech tts;
    private boolean ttsInit = false;
    private uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity book;
    private android.view.GestureDetector gestureDetector;
    private java.lang.String word = "";
    private java.lang.String sentence = "";
    private uz.siyovush.learnlanguagebyreading.util.PrefManager.Companion sharedPref;
    private final kotlin.properties.ReadWriteProperty currentPage$delegate = null;
    private final kotlin.properties.ReadWriteProperty allPage$delegate = null;
    private uz.siyovush.learnlanguagebyreading.util.CustomDialog dialog;
    
    public ReadFragment() {
        super();
    }
    
    private final uz.siyovush.learnlanguagebyreading.databinding.FragmentReadBinding getBinding() {
        return null;
    }
    
    private final uz.siyovush.learnlanguagebyreading.ui.read.ReadViewModel getViewModel() {
        return null;
    }
    
    private final int getCurrentPage() {
        return 0;
    }
    
    private final void setCurrentPage(int p0) {
    }
    
    private final int getAllPage() {
        return 0;
    }
    
    private final void setAllPage(int p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility", "SetTextI18n", "ResourceAsColor"})
    private final void setupUI() {
    }
    
    private final void setupObservers(uz.siyovush.learnlanguagebyreading.util.CustomDialog dialog) {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}