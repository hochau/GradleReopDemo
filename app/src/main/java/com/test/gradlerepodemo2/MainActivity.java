package com.test.gradlerepodemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.test.commonlibrary.CommonTestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CommonTestUtil.log("这是主页面的日志打印");

    }
}