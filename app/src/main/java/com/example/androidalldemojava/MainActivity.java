package com.example.androidalldemojava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.androidalldemojava.mvp.view.MvpMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMvpDemo(View view) {

        startActivity(new Intent(MainActivity.this, MvpMainActivity.class));
    }
}
