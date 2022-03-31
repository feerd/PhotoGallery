package ch.M306_LB.gallery.model;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String filePath;
    private String fileName;
    private Date fileDateTime;
    private Integer fileSize;
    private String fileMimeTyp;
    private Integer height;
    private Integer width;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getFileDateTime() {
        return fileDateTime;
    }

    public void setFileDateTime(Date fileDateTime) {
        this.fileDateTime = fileDateTime;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileMimeTyp() {
        return fileMimeTyp;
    }

    public void setFileMimeTyp(String fileMimeTyp) {
        this.fileMimeTyp = fileMimeTyp;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }



}
