package uz.siyovush.learnlanguagebyreading.ui.add_book;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006%"}, d2 = {"Luz/siyovush/learnlanguagebyreading/ui/add_book/AddBookFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Luz/siyovush/learnlanguagebyreading/databinding/FragmentAddBookBinding;", "getBinding", "()Luz/siyovush/learnlanguagebyreading/databinding/FragmentAddBookBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "bitmap", "Landroid/graphics/Bitmap;", "galleryRequest", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "getContent", "", "imagePath", "viewModel", "Luz/siyovush/learnlanguagebyreading/ui/add_book/AddBookViewModel;", "getViewModel", "()Luz/siyovush/learnlanguagebyreading/ui/add_book/AddBookViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getBitmapFromUri", "uri", "Landroid/net/Uri;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "saveBitmapToFile", "context", "Landroid/content/Context;", "setupUi", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AddBookFragment extends androidx.fragment.app.Fragment {
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String imagePath;
    private android.graphics.Bitmap bitmap;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> getContent = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> galleryRequest = null;
    
    public AddBookFragment() {
        super();
    }
    
    private final uz.siyovush.learnlanguagebyreading.databinding.FragmentAddBookBinding getBinding() {
        return null;
    }
    
    private final uz.siyovush.learnlanguagebyreading.ui.add_book.AddBookViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUi() {
    }
    
    private final android.graphics.Bitmap getBitmapFromUri(android.net.Uri uri) {
        return null;
    }
    
    private final java.lang.String saveBitmapToFile(android.content.Context context, android.graphics.Bitmap bitmap) {
        return null;
    }
}