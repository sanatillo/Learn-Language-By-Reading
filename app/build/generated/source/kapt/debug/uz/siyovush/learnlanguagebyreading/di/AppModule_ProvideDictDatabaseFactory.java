package uz.siyovush.learnlanguagebyreading.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;
import uz.siyovush.learnlanguagebyreading.data.database.DictDatabase;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideDictDatabaseFactory implements Factory<DictDatabase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideDictDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DictDatabase get() {
    return provideDictDatabase(contextProvider.get());
  }

  public static AppModule_ProvideDictDatabaseFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideDictDatabaseFactory(contextProvider);
  }

  public static DictDatabase provideDictDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDictDatabase(context));
  }
}
