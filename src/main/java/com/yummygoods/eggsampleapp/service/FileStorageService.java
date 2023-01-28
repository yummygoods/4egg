package com.yummygoods.eggsampleapp.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface FileStorageService {

    public void init();
     public void save(MultipartFile file);
 public Resource loadAsResource(String filename);

   public void deleteAll();
   public  Stream<Path> loadAll();

    Path load(String filename);

}