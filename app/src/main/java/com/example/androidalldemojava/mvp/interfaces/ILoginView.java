package com.example.androidalldemojava.mvp.interfaces;

public interface ILoginView {

    void onClearText();
    void onLoginResult(Boolean result, int code);
    void onSetProgressBarVisibility(int visibility);
}
