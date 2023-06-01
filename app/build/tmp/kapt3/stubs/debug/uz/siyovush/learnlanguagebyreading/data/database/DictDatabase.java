package uz.siyovush.learnlanguagebyreading.data.database;

import java.lang.System;

@androidx.room.Database(entities = {uz.siyovush.learnlanguagebyreading.data.database.entity.Word.class, uz.siyovush.learnlanguagebyreading.data.database.entity.Translation.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Luz/siyovush/learnlanguagebyreading/data/database/DictDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dictDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/DictDao;", "app_debug"})
public abstract class DictDatabase extends androidx.room.RoomDatabase {
    
    public DictDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract uz.siyovush.learnlanguagebyreading.data.database.dao.DictDao dictDao();
}