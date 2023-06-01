package uz.siyovush.learnlanguagebyreading.ui.read;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u0019R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Luz/siyovush/learnlanguagebyreading/ui/read/ReadViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Luz/siyovush/learnlanguagebyreading/data/repository/TranslateRepository;", "wordDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/WordDao;", "(Luz/siyovush/learnlanguagebyreading/data/repository/TranslateRepository;Luz/siyovush/learnlanguagebyreading/data/database/dao/WordDao;)V", "_language", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Luz/siyovush/learnlanguagebyreading/data/model/Language;", "_sentence", "", "_word", "Luz/siyovush/learnlanguagebyreading/data/model/TranslationResult;", "language", "Lkotlinx/coroutines/flow/StateFlow;", "getLanguage", "()Lkotlinx/coroutines/flow/StateFlow;", "sentence", "getSentence", "word", "getWord", "changeLanguage", "", "onClickWord", "Lkotlinx/coroutines/Job;", "text", "updateFavorite", "app_debug"})
public final class ReadViewModel extends androidx.lifecycle.ViewModel {
    private final uz.siyovush.learnlanguagebyreading.data.repository.TranslateRepository repository = null;
    private final uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao wordDao = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.siyovush.learnlanguagebyreading.data.model.TranslationResult> _word = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<uz.siyovush.learnlanguagebyreading.data.model.TranslationResult> word = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _sentence = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> sentence = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.siyovush.learnlanguagebyreading.data.model.Language> _language = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<uz.siyovush.learnlanguagebyreading.data.model.Language> language = null;
    
    @javax.inject.Inject
    public ReadViewModel(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.repository.TranslateRepository repository, @org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao wordDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<uz.siyovush.learnlanguagebyreading.data.model.TranslationResult> getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSentence() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<uz.siyovush.learnlanguagebyreading.data.model.Language> getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onClickWord(@org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    java.lang.String sentence) {
        return null;
    }
    
    public final void changeLanguage(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.model.Language language) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateFavorite() {
        return null;
    }
}