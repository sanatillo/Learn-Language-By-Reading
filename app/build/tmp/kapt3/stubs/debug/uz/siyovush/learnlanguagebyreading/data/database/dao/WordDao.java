package uz.siyovush.learnlanguagebyreading.data.database.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Luz/siyovush/learnlanguagebyreading/data/database/dao/WordDao;", "", "delete", "", "word", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Luz/siyovush/learnlanguagebyreading/data/database/entity/WordTranslation;", "insert", "translation", "(Luz/siyovush/learnlanguagebyreading/data/database/entity/WordTranslation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "", "app_debug"})
public abstract interface WordDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.entity.WordTranslation translation, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM WordTranslation WHERE original = :word")
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    java.lang.String word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT EXISTS(SELECT 1 FROM WordTranslation WHERE original = :word LIMIT 1)")
    public abstract java.lang.Object isFavorite(@org.jetbrains.annotations.NotNull
    java.lang.String word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM WordTranslation")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.WordTranslation>> getAll();
}