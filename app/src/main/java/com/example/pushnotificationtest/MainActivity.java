package com.example.pushnotificationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pusher.pushnotifications.PushNotifications;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PushNotifications.start(getApplicationContext(), "b1043e2f-4110-4d74-87fb-28adb284ed05");
        PushNotifications.addDeviceInterest("hello");
    }
}