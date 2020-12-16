package com.example.broadcastreceivers;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(broadcastCharge);
    }

    BroadcastCharge broadcastCharge;
    @Override
    protected void onResume() {
        super.onResume();
        broadcastCharge =new BroadcastCharge();
        IntentFilter intentFilter=new IntentFilter();
       intentFilter.addAction(Intent.ACTION_POWER_CONNECTED);
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        registerReceiver(broadcastCharge,intentFilter);
    }
}