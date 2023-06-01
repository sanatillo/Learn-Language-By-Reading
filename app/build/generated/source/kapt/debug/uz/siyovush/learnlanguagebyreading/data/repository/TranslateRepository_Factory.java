package uz.siyovush.learnlanguagebyreading.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;

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
public final class TranslateRepository_Factory implements Factory<TranslateRepository> {
  @Override
  public TranslateRepository get() {
    return newInstance();
  }

  public static TranslateRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TranslateRepository newInstance() {
    return new TranslateRepository();
  }

  private static final class InstanceHolder {
    private static final TranslateRepository_Factory INSTANCE = new TranslateRepository_Factory();
  }
}
