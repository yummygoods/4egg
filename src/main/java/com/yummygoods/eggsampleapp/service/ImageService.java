package com.yummygoods.eggsampleapp.service;

import com.yummygoods.eggsampleapp.model.Image;
import com.yummygoods.eggsampleapp.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public ImageService(@Autowired ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Image save(Image image) {
        return imageRepository.save(image);
    }

    public void delete(Integer id) {
        imageRepository.deleteById(id);
    }

    public List<Image> getAll() {
        return imageRepository.findAll();
    }

    public Image findById(Integer id) {
        Optional<Image> image = imageRepository.findById(id);
        boolean isPresent = image.isPresent();
        if (isPresent) {
            return image.get();
        } else {
            return null;
        }
    }




}
