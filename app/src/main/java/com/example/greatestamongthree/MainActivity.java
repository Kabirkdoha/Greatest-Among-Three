package com.example.greatestamongthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2,input3;
    Button show;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = findViewById(R.id.tv3);
        input1 = findViewById(R.id.etinput);
        input2 = findViewById(R.id.etinput2);
        input3 = findViewById(R.id.etinput3);
        show = findViewById(R.id.button2);
        tv.setText("");

        show.setOnClickListener(view -> {
            int n1 = Integer.parseInt(input1.getText().toString());
            int n2 = Integer.parseInt(input2.getText().toString());
            int n3 = Integer.parseInt(input3.getText().toString());

            if( n1 >= n2 && n1 >= n3)
                tv.setText(String.valueOf(n1));
            else if (n2 >= n1 && n2 >= n3)
                tv.setText(String.valueOf(n2));
            else
                tv.setText(String.valueOf(n3));

        });
    }
}