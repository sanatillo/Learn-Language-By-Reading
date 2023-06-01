package uz.siyovush.learnlanguagebyreading.data.database.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Luz/siyovush/learnlanguagebyreading/data/database/dao/BookDao;", "", "deleteById", "", "bookId", "", "getAllBooksByName", "Lkotlinx/coroutines/flow/Flow;", "", "Luz/siyovush/learnlanguagebyreading/data/database/entity/BookEntity;", "asc", "", "insert", "book", "(Luz/siyovush/learnlanguagebyreading/data/database/entity/BookEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface BookDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity book, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM BookEntity ORDER BY CASE WHEN :asc THEN title END ASC, CASE WHEN NOT :asc THEN title END DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity>> getAllBooksByName(boolean asc);
    
    @androidx.room.Query(value = "DELETE FROM BookEntity WHERE id = :bookId")
    public abstract void deleteById(long bookId);
}