/*
package com.yummygoods.eggsampleapp.controller;

import com.yummygoods.eggsampleapp.model.Image;
import com.yummygoods.eggsampleapp.repository.ImageDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
//@RequestMapping(value = "/")
@RestController
public class ImageController {

       final ImageDbRepository imageDbRepository;

    public ImageController(ImageDbRepository imageDbRepository) {
        this.imageDbRepository = imageDbRepository;
        //add image service
    }

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

*/
