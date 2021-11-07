package com.example.counterappwithsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnInc, btnDec, btnReset;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnInc = findViewById(R.id.btn_inc);
        btnInc.setOnClickListener(this);

        btnDec = findViewById(R.id.btn_dec);
        btnDec.setOnClickListener(this);

        btnReset = findViewById(R.id.btn_reset);
        btnReset.setOnClickListener(this);

        textView = findViewById(R.id.editTextNumber);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        int count;
        switch(view.getId()){
            case R.id.btn_inc:
                count = Integer.parseInt(textView.getText().toString());
                count=count+1;
                textView.setText(Integer.toString(count));
                break;
            case R.id.btn_dec:
                count = Integer.parseInt(textView.getText().toString());
                count=count-1;
                textView.setText(Integer.toString(count));
                break;
            case R.id.btn_reset:
                textView.setText("0");
        }
    }
}