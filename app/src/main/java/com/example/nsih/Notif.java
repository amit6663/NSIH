package com.example.nsih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Notif extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif);

        tv=findViewById(R.id.noti);

        String message=getIntent().getStringExtra("message");
        tv.setText(message);
    }
}
