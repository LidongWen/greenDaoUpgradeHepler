# DataBaseUpdate
实现了数据库更新功能，一行代码轻松升级greenDao数据库。

## 引用
```groovy
// 项目引用
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath 'org.greenrobot:greendao-gradle-plugin:3.2.1'
    }
}
apply plugin: 'org.greenrobot.greendao'

allprojects {
    repositories {
        jcenter()
        maven { url "https://www.jitpack.io" }
    }
}
```
## 使用
在数据库更新这边调用

```java
public class DBOpenHelper extends SQLiteOpenHelper {
   .........
    @Override
    public void onCreate(SQLiteDatabase db) {
        ....
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
                DBMigrationHelper migratorHelper = new DBMigrationHelper();
                //判断版本， 设置需要修改得表  我这边设置一个 FileInfo
                if(true) {
                    migratorHelper.onUpgrade(db, FileInfoDao.class);
                }
            } catch (ClassCastException e) {
            }
    }
}
```

## Contact me
blog: [wenld's blog](http://blog.csdn.net/sinat_15877283)
