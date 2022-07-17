package com.example.radiobutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.answer);
        Button button = findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<radioGroup.getChildCount();i++){
                    RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
                    //alt+回车  快捷键自动改错
                    if(radioButton.isChecked()){
                        if(radioButton.getText().equals("B:2")){
                            Toast.makeText(MainActivity.this,"回答正确",Toast.LENGTH_SHORT).show();
                        }else{
                            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                            builder.setMessage("1+1=2");
                            builder.setPositiveButton("确定",null).show();
                        }
                        break;
                    }
                }
            }
        });

    }
}