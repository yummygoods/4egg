package com.yummygoods.eggsampleapp.repository;

import com.yummygoods.eggsampleapp.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TrackRepository extends JpaRepository<Track, Integer> {


}
