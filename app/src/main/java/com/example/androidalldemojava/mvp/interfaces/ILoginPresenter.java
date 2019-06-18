package com.example.androidalldemojava.mvp.interfaces;

public interface ILoginPresenter {

    void clear();
    void doLogin(String name, String passwd);
    void setProgressBarVisiblity(int visiblity);
}
