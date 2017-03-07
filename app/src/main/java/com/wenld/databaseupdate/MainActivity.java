package com.wenld.databaseupdate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
//        List<FileInfo> str = new FileInfoDB().loadAll();
//        if (str != null && str.size() > 0) {
//            tv.setText(str.get(0).getUrl());
//        }
    }
}
