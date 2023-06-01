package uz.siyovush.learnlanguagebyreading.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import uz.siyovush.learnlanguagebyreading.data.database.AppDatabase;
import uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao;

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
public final class AppModule_ProvideBookDaoFactory implements Factory<BookDao> {
  private final Provider<AppDatabase> databaseProvider;

  public AppModule_ProvideBookDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public BookDao get() {
    return provideBookDao(databaseProvider.get());
  }

  public static AppModule_ProvideBookDaoFactory create(Provider<AppDatabase> databaseProvider) {
    return new AppModule_ProvideBookDaoFactory(databaseProvider);
  }

  public static BookDao provideBookDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBookDao(database));
  }
}
