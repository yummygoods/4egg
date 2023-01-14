package com.repository;

import com.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Integer> {


}
