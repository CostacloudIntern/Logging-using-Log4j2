package com.logging.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.logging.model.Music;


public interface MusicRepository extends MongoRepository<Music, Long>{

		List<Music> findByUploader(String musicUploader);
}