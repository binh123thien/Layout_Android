package com.example.layout_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {
    AlertDialog.Builder builderDiaglog;
    AlertDialog alertDialog;
    ImageView imageliving,imagebed,imagekitchen;
    TextView textliving,textbed,textkitchen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        imageliving = findViewById(R.id.imagelivingroom);
        imagebed = findViewById(R.id.imagebedroom);
        imagekitchen = findViewById(R.id.imagekitchenroom);
        textliving = findViewById(R.id.textlivingroom);
        textbed = findViewById(R.id.textbedroom);
        textkitchen = findViewById(R.id.textkitchenroom);


        // home profile dialog
        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.personaction:
                        // chuyển trang profile
                        profile_page();
                        break;
                }
                return false;
            }

            public void profile_page(){
                Intent intent=new Intent(Dashboard.this,Profile.class);
                startActivity(intent);
            }

        });



        // nút nhấn để chuyển tới giao diện living room
        imageliving.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this, Living_Room.class);
                startActivity(intent);
            }
        });
        textliving.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this,Living_Room.class);
                startActivity(intent);
            }
        });

        //nut nhấn để chuyển tới bedroom
        imagebed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this, Bed_Room.class);
                startActivity(intent);
            }
        });
        textbed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this,Bed_Room.class);
                startActivity(intent);
            }
        });

        //nút nhấn để chuyển tới kitchen room
        imagekitchen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this, Kitchen_Room.class);
                startActivity(intent);
            }
        });
        textkitchen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Dashboard.this,Kitchen_Room.class);
                startActivity(intent);
            }
        });
    }
}
