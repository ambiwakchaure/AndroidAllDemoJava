package com.example.androidalldemojava.mvp.interfaces;

public interface IUserModel {

    String getName();
    String getPasswd();
    int checkUserValidity(String name, String passwd);
}
