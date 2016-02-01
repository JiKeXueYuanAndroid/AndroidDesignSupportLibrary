package com.example.administrator.helloas;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //浮动的圆形按钮
    private FloatingActionButton fab;

    private TextInputLayout til;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab);

        til = (TextInputLayout) findViewById(R.id.textInput);

        til.setHint("请输入用户名");

    }
}
