package com.example.counterappwithsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnInc, btnDec, btnReset;
    TextView textView;
    public static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, " onCreate Activity Main");
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
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart Activity Main");
    }

    @Override
    protected void onResume() {
        super. onResume();
        Log.d(TAG, " onResume Activity Main");
    }

    @Override
    protected void onPause() {
        super. onPause();
        Log.d(TAG, " onPause Activity Main");
    }

    @Override
    protected void onStop() {
        super. onStop();
        Log.d(TAG, " onStop Activity Main");
    }

    @Override
    protected void onDestroy() {
        super. onDestroy();
        Log.d(TAG, " onDestroy Activity Main");
    }
}