package uz.siyovush.learnlanguagebyreading.ui.add_book;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Luz/siyovush/learnlanguagebyreading/ui/add_book/AddBookViewModel;", "Landroidx/lifecycle/ViewModel;", "bookDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/BookDao;", "(Luz/siyovush/learnlanguagebyreading/data/database/dao/BookDao;)V", "addBook", "Lkotlinx/coroutines/Job;", "path", "", "title", "image", "app_debug"})
public final class AddBookViewModel extends androidx.lifecycle.ViewModel {
    private final uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao bookDao = null;
    
    @javax.inject.Inject
    public AddBookViewModel(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao bookDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job addBook(@org.jetbrains.annotations.Nullable
    java.lang.String path, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String image) {
        return null;
    }
}