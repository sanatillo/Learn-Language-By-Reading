package uz.siyovush.learnlanguagebyreading.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import uz.siyovush.learnlanguagebyreading.data.database.DictDatabase;
import uz.siyovush.learnlanguagebyreading.data.database.dao.DictDao;

@ScopeMetadata
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
public final class AppModule_ProvideDictDaoFactory implements Factory<DictDao> {
  private final Provider<DictDatabase> databaseProvider;

  public AppModule_ProvideDictDaoFactory(Provider<DictDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public DictDao get() {
    return provideDictDao(databaseProvider.get());
  }

  public static AppModule_ProvideDictDaoFactory create(Provider<DictDatabase> databaseProvider) {
    return new AppModule_ProvideDictDaoFactory(databaseProvider);
  }

  public static DictDao provideDictDao(DictDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDictDao(database));
  }
}
