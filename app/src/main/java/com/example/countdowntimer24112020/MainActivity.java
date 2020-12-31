package com.example.countdowntimer24112020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher mImageSwitcher;
    Button mBtnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}