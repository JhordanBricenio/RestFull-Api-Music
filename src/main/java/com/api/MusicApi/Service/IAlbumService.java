package com.api.MusicApi.Service;

import com.api.MusicApi.Model.Album;

import java.util.List;

public interface IAlbumService {
    List<Album> getAllAlbums();

    void saveAlbum(Album album);

    void delete(int id);


}
