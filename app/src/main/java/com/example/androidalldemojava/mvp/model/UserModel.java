package com.example.androidalldemojava.mvp.model;

import com.example.androidalldemojava.mvp.interfaces.IUserModel;

public class UserModel implements IUserModel {

    String name;
    String passwd;

    public UserModel(String name, String passwd)
    {
        this.name = name;
        this.passwd = passwd;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPasswd() {
        return passwd;
    }

    @Override
    public int checkUserValidity(String name, String passwd)
    {
        if (name==null||passwd==null||!name.equals(getName())||!passwd.equals(getPasswd()))
        {
            return -1;
        }
        return 0;
    }
}
