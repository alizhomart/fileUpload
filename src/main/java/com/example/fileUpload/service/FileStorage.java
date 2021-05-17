package com.example.fileUpload.service;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.core.io.Resource;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface FileStorage {
    public void store(MultipartFile file);

    public Resource loadFile(String filename);

    public void delete(String filename);

    public void deleteAll();

    public void init();

    public Stream<Path> getFiles();
}