package uz.siyovush.learnlanguagebyreading.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004J\u0014\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004J\b\u0010\r\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\t2\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004J \u0010\u000f\u001a\u00020\t2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004J(\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Luz/siyovush/learnlanguagebyreading/util/CustomDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "getSentence", "Lkotlin/Function0;", "Lkotlin/Pair;", "", "getText", "onSave", "", "onSpeak", "save", "func", "onStart", "sentenceChange", "textChange", "updateText", "tvWord", "Landroid/widget/TextView;", "tvSentence", "yopish", "Lcom/google/android/material/button/MaterialButton;", "saqlash", "app_debug"})
public final class CustomDialog extends androidx.fragment.app.DialogFragment {
    private kotlin.jvm.functions.Function0<kotlin.Unit> onSave;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onSpeak;
    private kotlin.jvm.functions.Function0<kotlin.Pair<java.lang.String, java.lang.String>> getText;
    private kotlin.jvm.functions.Function0<kotlin.Pair<java.lang.String, java.lang.String>> getSentence;
    
    public CustomDialog() {
        super();
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    private final void updateText(android.widget.TextView tvWord, android.widget.TextView tvSentence, com.google.android.material.button.MaterialButton yopish, com.google.android.material.button.MaterialButton saqlash) {
    }
    
    public final void onSpeak(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> func) {
    }
    
    public final void onSave(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> save) {
    }
    
    public final void textChange(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Pair<java.lang.String, java.lang.String>> getText) {
    }
    
    public final void sentenceChange(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Pair<java.lang.String, java.lang.String>> getSentence) {
    }
}