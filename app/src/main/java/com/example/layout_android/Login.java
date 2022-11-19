package com.example.layout_android;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    //Trang đăng nhập
    private EditText edit_Txt_Email_login, edit_Txt_Password;
    private TextView btn_register_toggle;
    private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
//        sự kiện nút nhấn đăng nhập
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
//         nút nhấn register tới giao diện register.xml
        btn_register_toggle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                register();
            }
        });
    }
    public void login(){
        Intent intent=new Intent(Login.this,Dashboard.class);
        startActivity(intent);
    }
    public void register(){
        Intent intent=new Intent(Login.this,Register.class);
        startActivity(intent);
    }

    public void AnhXa(){
        //Trang đăng nhập
        edit_Txt_Email_login=findViewById(R.id.edit_Txt_Email_login);
        edit_Txt_Password=findViewById(R.id.edit_Txt_Password);
        btn_login=findViewById(R.id.btn_login);
        btn_register_toggle=findViewById(R.id.btn_register_toogle);
    }
}
