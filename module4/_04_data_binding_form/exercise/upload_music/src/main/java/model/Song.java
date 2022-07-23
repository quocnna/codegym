package model;

import org.springframework.web.multipart.MultipartFile;

public class Song {
    private int id;
    private String name;
    private String artist;
    private String genre;
    private String link;
    private MultipartFile image;

    public Song(int id, String name, String artist, String genre, String link, MultipartFile image) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.link = link;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
