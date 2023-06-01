package uz.siyovush.learnlanguagebyreading.ui.add_book;

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
public final class AddBookViewModel_Factory implements Factory<AddBookViewModel> {
  private final Provider<BookDao> bookDaoProvider;

  public AddBookViewModel_Factory(Provider<BookDao> bookDaoProvider) {
    this.bookDaoProvider = bookDaoProvider;
  }

  @Override
  public AddBookViewModel get() {
    return newInstance(bookDaoProvider.get());
  }

  public static AddBookViewModel_Factory create(Provider<BookDao> bookDaoProvider) {
    return new AddBookViewModel_Factory(bookDaoProvider);
  }

  public static AddBookViewModel newInstance(BookDao bookDao) {
    return new AddBookViewModel(bookDao);
  }
}
