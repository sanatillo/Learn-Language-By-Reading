package uz.siyovush.learnlanguagebyreading.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import uz.siyovush.learnlanguagebyreading.data.database.AppDatabase;
import uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideWordDaoFactory implements Factory<WordDao> {
  private final Provider<AppDatabase> databaseProvider;

  public AppModule_ProvideWordDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public WordDao get() {
    return provideWordDao(databaseProvider.get());
  }

  public static AppModule_ProvideWordDaoFactory create(Provider<AppDatabase> databaseProvider) {
    return new AppModule_ProvideWordDaoFactory(databaseProvider);
  }

  public static WordDao provideWordDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideWordDao(database));
  }
}
