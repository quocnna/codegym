package m4.music_page.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Last Name is mandatory")
    @Size(min = 5, max = 45, message = "Last Name have to length from 5 to 45")
    private String name;
    private String artist;
    private String kind;
    private String link;
    private String path;

    @Transient
    private MultipartFile file;

    public Song() {
    }

    public Song(int id, String name, String artist, String kind, String link, String path, MultipartFile file) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.kind = kind;
        this.link = link;
        this.path = path;
        this.file = file;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
