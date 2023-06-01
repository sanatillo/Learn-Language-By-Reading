package uz.siyovush.learnlanguagebyreading.data.database;

import java.lang.System;

@androidx.room.Database(entities = {uz.siyovush.learnlanguagebyreading.data.database.entity.WordTranslation.class, uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity.class}, version = 2)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Luz/siyovush/learnlanguagebyreading/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getBookDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/BookDao;", "getWordDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/WordDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao getWordDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao getBookDao();
}