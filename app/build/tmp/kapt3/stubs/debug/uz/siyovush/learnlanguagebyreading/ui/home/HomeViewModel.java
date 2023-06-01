package uz.siyovush.learnlanguagebyreading.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Luz/siyovush/learnlanguagebyreading/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "bookDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/BookDao;", "(Luz/siyovush/learnlanguagebyreading/data/database/dao/BookDao;)V", "deleteById", "", "id", "", "getBooks", "Lkotlinx/coroutines/flow/StateFlow;", "", "Luz/siyovush/learnlanguagebyreading/data/database/entity/BookEntity;", "asc", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao bookDao = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao bookDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity>> getBooks(boolean asc) {
        return null;
    }
    
    public final void deleteById(long id) {
    }
}