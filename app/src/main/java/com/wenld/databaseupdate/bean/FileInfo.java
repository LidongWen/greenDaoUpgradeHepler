package com.wenld.databaseupdate.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import java.io.Serializable;

/**
 * Entity mapped to table "FILE_INFO".
 */
public class FileInfo implements Serializable {

    private String id;
    private Integer length;
    /** Not-null value. */
    private String url;
    /** Not-null value. */
    private String fileName;
    /** Not-null value. */
    private String md5;
    private Integer finished;
    private String rate;
    private Boolean over;
    private String overtime;
    private boolean isDownload;

    public FileInfo() {
    }

    public FileInfo(String id) {
        this.id = id;
    }

    public FileInfo(String id, Integer length, String url, String fileName, String md5, Integer finished, String rate, Boolean over, String overtime, boolean isDownload) {
        this.id = id;
        this.length = length;
        this.url = url;
        this.fileName = fileName;
        this.md5 = md5;
        this.finished = finished;
        this.rate = rate;
        this.over = over;
        this.overtime = overtime;
        this.isDownload = isDownload;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    /** Not-null value. */
    public String getUrl() {
        return url;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUrl(String url) {
        this.url = url;
    }

    /** Not-null value. */
    public String getFileName() {
        return fileName;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /** Not-null value. */
    public String getMd5() {
        return md5;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Boolean getOver() {
        return over;
    }

    public void setOver(Boolean over) {
        this.over = over;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    public boolean getIsDownload() {
        return isDownload;
    }

    public void setIsDownload(boolean isDownload) {
        this.isDownload = isDownload;
    }

}