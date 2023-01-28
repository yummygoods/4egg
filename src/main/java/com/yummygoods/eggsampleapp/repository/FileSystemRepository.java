package com.yummygoods.eggsampleapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

@Repository
public interface FileSystemRepository extends JpaRepository<FileDB, String>{

    String RESOURCES_DIR = FileSystemRepository.class.getResource("/")
                                   .getPath();

    String save(byte[] content, String imageName) throws Exception {
        Path newFile = (Path) Paths.get(RESOURCES_DIR + new Date().getTime() + "-" + imageName);
        Files.createDirectories(newFile.getParent());

        Files.write(newFile,
                content);

        return newFile.toAbsolutePath()
                       .toString();
    }
}