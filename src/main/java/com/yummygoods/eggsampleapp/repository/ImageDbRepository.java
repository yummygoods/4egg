package com.yummygoods.eggsampleapp.repository;

import com.yummygoods.eggsampleapp.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface ImageDbRepository extends JpaRepository<Image, Long> {

}