package com.example.niu.databingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.niu.databingtest.bean.User;
import com.example.niu.databingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;
    private ActivityMainBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("张三", "26");
        dataBinding.setUser(user);

        initView();
    }

    private void initView() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    user.setName("花姑娘");
                    user.setAge("20");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();



    }


}
