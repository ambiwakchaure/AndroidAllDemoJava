package com.example.androidalldemojava.mvp.interfaces;

public interface IUser {

    String getName();
    String getPasswd();
    int checkUserValidity(String name, String passwd);
}
