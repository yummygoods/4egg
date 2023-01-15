package com.service;

import com.model.Track;
import com.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TrackService {

    private final TrackRepository trackRepository;
    public TrackService(TrackRepository trackRepository){
        this.trackRepository = trackRepository;
    }

    public Track save(Track track){
        return  trackRepository.save(track);
    }

    public void delete(Integer id){
        trackRepository.deleteById(id);
    }

    public List<Track> getAll() {
        return trackRepository.findAll();
    }
}
