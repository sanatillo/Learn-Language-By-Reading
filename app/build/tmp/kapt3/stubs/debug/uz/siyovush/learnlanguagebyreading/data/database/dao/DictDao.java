package uz.siyovush.learnlanguagebyreading.data.database.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Luz/siyovush/learnlanguagebyreading/data/database/dao/DictDao;", "", "getTranslations", "", "Luz/siyovush/learnlanguagebyreading/data/database/entity/Dict;", "langId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DictDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "\n        SELECT\n          word.name AS word,\n          word.transcription as transcription,\n          GROUP_CONCAT(word2.name) AS translation\n        FROM\n          word\n        JOIN\n          translation\n        ON\n          word.id = translation.idWord\n        JOIN\n          word word2\n        ON\n          word2.id = translation.idTranslation\n        WHERE\n          word.langId = :langId\n        GROUP BY\n          word.name;\n    ")
    public abstract java.lang.Object getTranslations(int langId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.Dict>> continuation);
}