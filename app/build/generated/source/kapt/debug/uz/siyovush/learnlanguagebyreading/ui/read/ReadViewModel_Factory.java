package uz.siyovush.learnlanguagebyreading.ui.read;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao;
import uz.siyovush.learnlanguagebyreading.data.repository.TranslateRepository;

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
public final class ReadViewModel_Factory implements Factory<ReadViewModel> {
  private final Provider<TranslateRepository> repositoryProvider;

  private final Provider<WordDao> wordDaoProvider;

  public ReadViewModel_Factory(Provider<TranslateRepository> repositoryProvider,
      Provider<WordDao> wordDaoProvider) {
    this.repositoryProvider = repositoryProvider;
    this.wordDaoProvider = wordDaoProvider;
  }

  @Override
  public ReadViewModel get() {
    return newInstance(repositoryProvider.get(), wordDaoProvider.get());
  }

  public static ReadViewModel_Factory create(Provider<TranslateRepository> repositoryProvider,
      Provider<WordDao> wordDaoProvider) {
    return new ReadViewModel_Factory(repositoryProvider, wordDaoProvider);
  }

  public static ReadViewModel newInstance(TranslateRepository repository, WordDao wordDao) {
    return new ReadViewModel(repository, wordDao);
  }
}
