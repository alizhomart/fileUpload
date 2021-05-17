package com.example.fileUpload;

import com.example.fileUpload.service.FileStorage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class FileUploadApplication implements CommandLineRunner {
	@Resource
	FileStorage fileStorage;

	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		fileStorage.deleteAll();
		fileStorage.init();
	}
}
