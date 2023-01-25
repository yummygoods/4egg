package com.yummygoods.eggsampleapp.repository;

import jakarta.persistence.criteria.Path;
import org.springframework.stereotype.Repository;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

@Repository
class FileSystemRepository {

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