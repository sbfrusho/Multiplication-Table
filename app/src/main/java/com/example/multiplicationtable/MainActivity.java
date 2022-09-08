package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText editText;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextNumberDecimal);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
//        Number1 = Integer.parseInt(Number1.getText().toString());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = editText.getText().toString();
                long n = Integer.parseInt(number);
                String num = "";
                long integerNumber = Integer.parseInt(number);
                for(int i = 1 ; i < 11 ; i++){
                    num += number + " " + "*" + " " + i + " " + "=" + " " + n * i + "\n";
                    textView.setText(num);
                }
                Toast.makeText(MainActivity.this, "Here is your multiplication table for " +n, Toast.LENGTH_SHORT).show();
            }
        });

    }
}