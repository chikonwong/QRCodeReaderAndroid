package com.example.qrcodereader_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SettingsSlicesContract;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("QRCodeRRR"); // set inside app title
    }
    public void launchSettings (View v){
        // launch a new acrivity

        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
}
