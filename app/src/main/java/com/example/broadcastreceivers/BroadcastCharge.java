package com.example.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastCharge extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)){
    Toast.makeText(context,"phone is charging",Toast.LENGTH_SHORT).show();
}else if(intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED)){
    Toast.makeText(context,"phone is desconnected",Toast.LENGTH_SHORT).show();

}
    }
}
