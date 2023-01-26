package com.yummygoods.eggsampleapp.controller;

import com.yummygoods.eggsampleapp.model.Image;
import com.yummygoods.eggsampleapp.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin
@RestController
public class ImageController {

       final ImageRepository imageRepository;

    public ImageController(@Autowired ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
        //add image service
    }

    @PostMapping
        Long uploadImage(@RequestParam MultipartFile multipartImage) throws Exception {
        Image dbImage = new Image();
        dbImage.setName(multipartImage.getName());
        dbImage.setContent(multipartImage.getBytes());

        return imageRepository.save(dbImage)
                       .getId();
    }

    @GetMapping(value = "/image/{imageId}", produces = MediaType.IMAGE_JPEG_VALUE)
    Resource downloadImage(@PathVariable Long imageId) {
        byte[] image = imageRepository.findById(imageId)
                               .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND))
                               .getContent();

        return new ByteArrayResource(image);
    }






    }

