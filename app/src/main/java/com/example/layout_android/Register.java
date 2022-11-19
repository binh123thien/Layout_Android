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


public class Register extends AppCompatActivity {
    //Trang đăng kí
    EditText edit_Txt_Username_register,   edit_Txt_email_register,   edit_Txt_pass_register,    edit_Txt_confirm_pass_register;
    Button btn_register;
    TextView btn_login_toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        //Trang đăng kí
        edit_Txt_Username_register=findViewById(R.id.edit_Txt_Username_register);
        edit_Txt_email_register=findViewById(R.id.edit_Txt_email_register);
        edit_Txt_pass_register=findViewById(R.id.edit_Txt_pass_register);
        edit_Txt_confirm_pass_register=findViewById(R.id.edit_Txt_confirm_pass_register);
        btn_register=findViewById(R.id.btn_register);
        btn_login_toggle=findViewById(R.id.btn_login_toggle);


        // nút nhấn  tới giao diện login.xml
        btn_login_toggle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                login_toggle();
            }
        });
    }


    private void login_toggle(){
        Intent intent=new Intent(Register.this,Login.class);
        startActivity(intent);
    }


}
