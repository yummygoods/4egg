package com.yummygoods.eggsampleapp.service;

import com.yummygoods.eggsampleapp.model.Track;
import com.yummygoods.eggsampleapp.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TrackService {

    private final TrackRepository trackRepository;

    public TrackService(@Autowired TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    public Track save(Track track) {
        return trackRepository.save(track);
    }

    public void delete(Integer id) {
        trackRepository.deleteById(id);
    }

    public List<Track> getAll() {
        return trackRepository.findAll();
    }

    public Track findById(Integer id) {
        Optional<Track> track = trackRepository.findById(id);
        boolean isPresent = track.isPresent();
        if (isPresent) {
            return track.get();
        } else {
            return null;
        }
    }
}

