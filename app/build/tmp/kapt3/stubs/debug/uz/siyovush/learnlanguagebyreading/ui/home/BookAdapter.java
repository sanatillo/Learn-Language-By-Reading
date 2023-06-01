package uz.siyovush.learnlanguagebyreading.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\f2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0014\u0010\u001d\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006!"}, d2 = {"Luz/siyovush/learnlanguagebyreading/ui/home/BookAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Luz/siyovush/learnlanguagebyreading/ui/home/BookAdapter$BookViewHolder;", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Luz/siyovush/learnlanguagebyreading/data/database/entity/BookEntity;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "onClick", "Lkotlin/Function1;", "", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "onLongClick", "getOnLongClick", "setOnLongClick", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submit", "list", "", "BookViewHolder", "app_debug"})
public final class BookAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<uz.siyovush.learnlanguagebyreading.ui.home.BookAdapter.BookViewHolder> {
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity> diffCallback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity> differ = null;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity, kotlin.Unit> onClick;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity, kotlin.Unit> onLongClick;
    
    public BookAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity, kotlin.Unit> getOnClick() {
        return null;
    }
    
    public final void setOnClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity, kotlin.Unit> getOnLongClick() {
        return null;
    }
    
    public final void setOnLongClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity, kotlin.Unit> p0) {
    }
    
    public final void submit(@org.jetbrains.annotations.NotNull
    java.util.List<uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity> list) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public uz.siyovush.learnlanguagebyreading.ui.home.BookAdapter.BookViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    uz.siyovush.learnlanguagebyreading.ui.home.BookAdapter.BookViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Luz/siyovush/learnlanguagebyreading/ui/home/BookAdapter$BookViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/siyovush/learnlanguagebyreading/databinding/BookItemBinding;", "(Luz/siyovush/learnlanguagebyreading/ui/home/BookAdapter;Luz/siyovush/learnlanguagebyreading/databinding/BookItemBinding;)V", "bind", "", "book", "Luz/siyovush/learnlanguagebyreading/data/database/entity/BookEntity;", "app_debug"})
    public final class BookViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final uz.siyovush.learnlanguagebyreading.databinding.BookItemBinding binding = null;
        
        public BookViewHolder(@org.jetbrains.annotations.NotNull
        uz.siyovush.learnlanguagebyreading.databinding.BookItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        uz.siyovush.learnlanguagebyreading.data.database.entity.BookEntity book) {
        }
    }
}