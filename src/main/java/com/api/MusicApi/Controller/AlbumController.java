package com.api.MusicApi.Controller;

import com.api.MusicApi.Model.Album;
import com.api.MusicApi.Service.IAlbumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumController {

    private IAlbumService albumService;
    public AlbumController(IAlbumService albumService) {
        this.albumService = albumService;
    }
    @GetMapping("/albums")
    public List<Album> buscarTodos(){
        return albumService.getAllAlbums();
    }

    @PostMapping("/albums")
    public Album guardar(@RequestBody Album album){
        albumService.saveAlbum(album);
        return album;
    }

    @PutMapping("/albums")
    public Album actualizar(@RequestBody Album album){
        albumService.saveAlbum(album);
        return album;
    }

    @DeleteMapping("/albums/{id}")
    public String eliminar(@PathVariable("id") int id){
        albumService.delete(id);
        return "Registro Eliminado";
    }
}
