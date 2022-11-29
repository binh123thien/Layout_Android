package com.example.layout_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Living_Room extends AppCompatActivity {
    AlertDialog.Builder builderDiaglog;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.livingroom);
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
                Intent intent=new Intent(Living_Room.this,Profile.class);
                startActivity(intent);

            }
            
        });

    }
}
