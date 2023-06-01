package uz.siyovush.learnlanguagebyreading.ui.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import uz.siyovush.learnlanguagebyreading.data.database.dao.BookDao;

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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<BookDao> bookDaoProvider;

  public HomeViewModel_Factory(Provider<BookDao> bookDaoProvider) {
    this.bookDaoProvider = bookDaoProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(bookDaoProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<BookDao> bookDaoProvider) {
    return new HomeViewModel_Factory(bookDaoProvider);
  }

  public static HomeViewModel newInstance(BookDao bookDao) {
    return new HomeViewModel(bookDao);
  }
}
