package com.example.gav.weatherapp;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.gav.weatherapp.services.WeatherUpdatesService;

public class BootBroadcastReceiver extends BroadcastReceiver {
    @Override public void onReceive(Context context, Intent intent) {
        Log.d("BootBroadcastReceiver","LOOOG");
        Toast.makeText(context,"We received boot broadcast", Toast.LENGTH_LONG).show();
        Intent startServiceIntent = new Intent(context.getApplicationContext(), WeatherUpdatesService.class);

        context.getApplicationContext()
            .startService(startServiceIntent);
    }
}
