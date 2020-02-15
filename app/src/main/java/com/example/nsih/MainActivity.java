package com.example.nsih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn6,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.pat1);
        btn2=findViewById(R.id.pat2);

        btn3=findViewById(R.id.pat3);
        btn4=findViewById(R.id.pat4);

        btn5=findViewById(R.id.pat5);
        btn6=findViewById(R.id.pat6);






        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intObj = new Intent(MainActivity.this,patient1.class);
                startActivity(intObj);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intObj = new Intent(MainActivity.this,Patient2.class);
                startActivity(intObj);
            }
        });



        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intObj = new Intent(MainActivity.this,Patient2.class);
                startActivity(intObj);
            }
        });



        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intObj = new Intent(MainActivity.this,Patient2.class);
                startActivity(intObj);
            }
        });


        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intObj = new Intent(MainActivity.this,Patient2.class);
                startActivity(intObj);
            }
        });



        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intObj = new Intent(MainActivity.this,Patient2.class);
                startActivity(intObj);
            }
        });





    }
}
