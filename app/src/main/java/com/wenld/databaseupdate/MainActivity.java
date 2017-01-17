package com.wenld.databaseupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String str = this.getClass().getName();
        setContentView(R.layout.activity_main);
    }
}
