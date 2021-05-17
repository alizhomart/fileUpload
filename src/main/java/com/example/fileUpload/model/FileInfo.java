package com.example.fileUpload.model;

import java.util.ArrayList;
import java.util.List;

public class FileInfo {
    private String filename;
    private String url;
    private List<FileInfo> infoList;

    public FileInfo(String filename, String url) {
        this.filename = filename;
        this.url = url;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public List<FileInfo> getInfoList() {
        return infoList;
    }
}
