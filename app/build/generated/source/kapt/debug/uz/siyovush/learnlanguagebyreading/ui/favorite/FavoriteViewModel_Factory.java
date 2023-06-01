package uz.siyovush.learnlanguagebyreading.ui.favorite;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import uz.siyovush.learnlanguagebyreading.data.database.dao.WordDao;

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
public final class FavoriteViewModel_Factory implements Factory<FavoriteViewModel> {
  private final Provider<WordDao> wordDaoProvider;

  public FavoriteViewModel_Factory(Provider<WordDao> wordDaoProvider) {
    this.wordDaoProvider = wordDaoProvider;
  }

  @Override
  public FavoriteViewModel get() {
    return newInstance(wordDaoProvider.get());
  }

  public static FavoriteViewModel_Factory create(Provider<WordDao> wordDaoProvider) {
    return new FavoriteViewModel_Factory(wordDaoProvider);
  }

  public static FavoriteViewModel newInstance(WordDao wordDao) {
    return new FavoriteViewModel(wordDao);
  }
}
