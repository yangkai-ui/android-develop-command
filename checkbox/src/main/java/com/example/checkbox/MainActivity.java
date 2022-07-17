package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    CheckBox right1,right2,right3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        right1 = findViewById(R.id.right1);
        right2 = findViewById(R.id.right2);
        right3 = findViewById(R.id.right3);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = "";
                if(right1.isChecked()){
                    txt += right1.getText();
                }
                if(right2.isChecked()){
                    txt += right2.getText();
                }
                if(right3.isChecked()){
                    txt += right3.getText();
                }
                Toast.makeText(MainActivity.this,txt,Toast.LENGTH_LONG).show();
            }
        });

    }
}