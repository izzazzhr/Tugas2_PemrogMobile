package com.example.tugas2_pemrogmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void homeView(View view) {
        Intent b = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(b);
    }


    public void bioView2(View view) {
        Intent f = new Intent(MainActivity2.this, Main4Activity.class);
        startActivity(f);
    }
}