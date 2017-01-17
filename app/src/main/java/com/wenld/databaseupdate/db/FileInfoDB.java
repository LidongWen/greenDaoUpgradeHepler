package com.wenld.databaseupdate.db;


import com.wenld.databaseupdate.bean.FileInfo;

import de.greenrobot.dao.AbstractDao;

/**
 * Created by wenld on 2017/1/1.
 */
public class FileInfoDB extends AbstractDatabaseManager<FileInfo, String> {
    @Override
    AbstractDao<FileInfo, String> getAbstractDao() {
        return daoSession.getFileInfoDao();
    }
}
