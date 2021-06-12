package com.example.myfirsttask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity
{
    Button btn1;
    ImageButton btnEye;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btnEye = findViewById(R.id.btn_eye);
        password = findViewById(R.id.enter_pass);
        int login_color= Color.rgb(156, 156, 14);
        btn1.setBackgroundColor(login_color);
        btn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Activity_2.class)));
        //password.getInputType(P)
        btnEye.setOnClickListener(v -> {
            if (password.getInputType() != InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)
                password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            else
                password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        });
    }
}
