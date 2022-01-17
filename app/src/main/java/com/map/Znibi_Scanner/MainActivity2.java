package com.map.Znibi_Scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000);
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                MainActivity2.this.finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();

    }
}
