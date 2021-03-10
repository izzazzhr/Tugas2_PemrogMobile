package com.example.tugas2_pemrogmobile;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void homeView2(View view) {
        Intent c = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(c);
    }

    public void articleView2(View view) {
        Intent d = new Intent(Main4Activity.this,MainActivity2.class);
        startActivity(d);
    }
}