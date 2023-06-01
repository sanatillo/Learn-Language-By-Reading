package uz.siyovush.learnlanguagebyreading.ui.dictionary;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
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
public final class DictionaryViewModel_Factory implements Factory<DictionaryViewModel> {
  private final Provider<DictDao> dictDaoProvider;

  public DictionaryViewModel_Factory(Provider<DictDao> dictDaoProvider) {
    this.dictDaoProvider = dictDaoProvider;
  }

  @Override
  public DictionaryViewModel get() {
    return newInstance(dictDaoProvider.get());
  }

  public static DictionaryViewModel_Factory create(Provider<DictDao> dictDaoProvider) {
    return new DictionaryViewModel_Factory(dictDaoProvider);
  }

  public static DictionaryViewModel newInstance(DictDao dictDao) {
    return new DictionaryViewModel(dictDao);
  }
}
