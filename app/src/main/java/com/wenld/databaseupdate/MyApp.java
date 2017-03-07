package com.wenld.databaseupdate;

import android.app.Application;

import com.wenld.databaseupdate.db.DBOpenHelper;
import com.wenld.databaseupdate.db.DaoMaster;

/**
 * Created by wenld on 2017/1/10.
 */
public class MyApp extends Application {
    DBOpenHelper helper;
    private DaoMaster daoMaster;
    @Override
    public void onCreate() {
        super.onCreate();
//        AbstractDatabaseManager.initOpenHelper(this);

        DBOpenHelper helper = new DBOpenHelper(this, "test.db",
                null,DaoMaster.SCHEMA_VERSION);
        daoMaster = new DaoMaster(helper.getWritableDatabase());

//        new FileInfoDB().insert(new FileInfo("1", 0, "1", "1", "1", 0, "1", true, "1", false));
    }
}
