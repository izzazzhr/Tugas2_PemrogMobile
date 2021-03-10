package com.example.tugas2_pemrogmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void articleView(View view) {
        Intent a = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(a);
    }


    public void bioView(View view) {
        Intent e = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(e);
    }
}