package uz.siyovush.learnlanguagebyreading.ui.favorite;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Luz/siyovush/learnlanguagebyreading/ui/favorite/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "wordDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/WordDao;", "(Luz/siyovush/learnlanguagebyreading/data/database/dao/WordDao;)V", "favorites", "Lkotlinx/coroutines/flow/StateFlow;", "", "Luz/siyovush/learnlanguagebyreading/data/database/entity/WordTranslation;", "getFavorites", "()Lkotlinx/coroutines/flow/StateFlow;", "delete", "Lkotlinx/coroutines/Job;", "translation", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    private final uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao wordDao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.WordTranslation>> favorites = null;
    
    @javax.inject.Inject
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao wordDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.WordTranslation>> getFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.entity.WordTranslation translation) {
        return null;
    }
}