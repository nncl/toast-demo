package com.example.rm30917.demotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rm30917.toastlibrary.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showInfo (View v) {
        CustomToast.showInfo(MainActivity.this, "Info");
    }
}
