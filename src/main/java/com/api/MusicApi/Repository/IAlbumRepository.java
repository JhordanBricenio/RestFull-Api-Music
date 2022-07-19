package com.api.MusicApi.Repository;

import com.api.MusicApi.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlbumRepository extends JpaRepository<Album, Integer> {

}

