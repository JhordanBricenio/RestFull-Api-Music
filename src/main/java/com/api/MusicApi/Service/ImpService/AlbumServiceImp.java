package com.api.MusicApi.Service.ImpService;

import com.api.MusicApi.Model.Album;
import com.api.MusicApi.Repository.IAlbumRepository;
import com.api.MusicApi.Service.IAlbumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImp implements IAlbumService {

    private IAlbumRepository albumRepository;

    public AlbumServiceImp(IAlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public void saveAlbum(Album album) {
        albumRepository.save(album);
    }

    @Override
    public void delete(int id) {
        albumRepository.deleteById(id);
    }
}

