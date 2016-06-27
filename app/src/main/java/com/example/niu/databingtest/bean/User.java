package com.example.niu.databingtest.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.niu.databingtest.BR;

/**
 * Created by niu on 2016/6/27.
 */

public class User extends BaseObservable {
    private String name;
    private String age;

    public User(String name, String age) {

        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);

    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
