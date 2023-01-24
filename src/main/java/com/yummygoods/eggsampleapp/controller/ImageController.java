package com.yummygoods.eggsampleapp.controller;

import com.yummygoods.eggsampleapp.model.Image;
import com.yummygoods.eggsampleapp.repository.ImageDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

     {

        @Autowired
        ImageDbRepository imageDbRepository;

        @PostMapping
        Long uploadImage(@RequestParam MultipartFile multipartImage) throws Exception {
            Image dbImage = new Image();
            dbImage.setName(multipartImage.getName());
            dbImage.setContent(multipartImage.getBytes());

            return imageDbRepository.save(dbImage)
                           .getId();
        }
    }
}

