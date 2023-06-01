package uz.siyovush.learnlanguagebyreading.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u0010"}, d2 = {"Luz/siyovush/learnlanguagebyreading/di/AppModule;", "", "()V", "provideAppDatabase", "Luz/siyovush/learnlanguagebyreading/data/database/AppDatabase;", "context", "Landroid/content/Context;", "provideBookDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/BookDao;", "database", "provideDictDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/DictDao;", "Luz/siyovush/learnlanguagebyreading/data/database/DictDatabase;", "provideDictDatabase", "provideWordDao", "Luz/siyovush/learnlanguagebyreading/data/database/dao/WordDao;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final uz.siyovush.learnlanguagebyreading.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final uz.siyovush.learnlanguagebyreading.data.database.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao provideWordDao(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao provideBookDao(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final uz.siyovush.learnlanguagebyreading.data.database.DictDatabase provideDictDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final uz.siyovush.learnlanguagebyreading.data.database.dao.DictDao provideDictDao(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.data.database.DictDatabase database) {
        return null;
    }
}