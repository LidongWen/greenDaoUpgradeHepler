package com.wenld.databaseupdate;

import android.app.Application;

import com.wenld.databaseupdate.db.AbstractDatabaseManager;

/**
 * Created by wenld on 2017/1/10.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AbstractDatabaseManager.initOpenHelper(this);
//        new FileInfoDB().insert(new FileInfo("1", 0, "1", "1", "1", 0, "1", true, "1", false));
    }
}
