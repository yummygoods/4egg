package com.yummygoods.eggsampleapp.controller;

import com.yummygoods.eggsampleapp.model.Image;
import com.yummygoods.eggsampleapp.repository.ImageRepository;
import com.yummygoods.eggsampleapp.service.ImageService;
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
@RequestMapping(value = "/")
public class ImageController {

       final ImageRepository imageRepository;
    final ImageService imageService;
    public ImageController(@Autowired ImageRepository imageRepository, ImageService imageService) {
        this.imageRepository = imageRepository;
        this.imageService = imageService;
    }

    @PostMapping
        Integer uploadImage(@RequestParam MultipartFile multipartImage) throws Exception {
        Image dbImage = new Image();
        dbImage.setName(multipartImage.getName());
        dbImage.setContent(multipartImage.getBytes());

        return imageRepository.save(dbImage)
                       .getId();
    }

    @GetMapping(value = "/images/{imageId}", produces = MediaType.IMAGE_JPEG_VALUE)
    Resource downloadImage(@PathVariable Integer imageId) {
        byte[] image = imageRepository.findById(imageId)
                               .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND))
                               .getContent();

        return new ByteArrayResource(image);
    }


    @GetMapping(value = "/images/all")
    public Iterable<Image> getAllImages()
    {
        System.out.println("this should get all images");
        return imageService.getAll();

    }




    }

