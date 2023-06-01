package uz.siyovush.learnlanguagebyreading.ui.dictionary;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Luz/siyovush/learnlanguagebyreading/ui/dictionary/DictionaryViewModel;", "Landroidx/lifecycle/ViewModel;", "dictDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/DictDao;", "(Luz/siyovush/learnlanguagebyreading/data/database/dao/DictDao;)V", "_currentState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Luz/siyovush/learnlanguagebyreading/ui/dictionary/DictState;", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "enToUz", "", "Luz/siyovush/learnlanguagebyreading/data/database/entity/Dict;", "query", "", "uzToEn", "filter", "dict", "loadDict", "Lkotlinx/coroutines/Job;", "toggleState", "", "updateQuery", "app_debug"})
public final class DictionaryViewModel extends androidx.lifecycle.ViewModel {
    private final uz.siyovush.learnlanguagebyreading.data.database.dao.DictDao dictDao = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.siyovush.learnlanguagebyreading.ui.dictionary.DictState> _currentState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<uz.siyovush.learnlanguagebyreading.ui.dictionary.DictState> currentState = null;
    private java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.Dict> enToUz;
    private java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.Dict> uzToEn;
    private java.lang.String query = "";
    
    @javax.inject.Inject
    public DictionaryViewModel(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.dao.DictDao dictDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<uz.siyovush.learnlanguagebyreading.ui.dictionary.DictState> getCurrentState() {
        return null;
    }
    
    public final void toggleState() {
    }
    
    public final void updateQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    private final java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.Dict> filter(java.lang.String query, java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.Dict> dict) {
        return null;
    }
    
    private final kotlinx.coroutines.Job loadDict() {
        return null;
    }
}