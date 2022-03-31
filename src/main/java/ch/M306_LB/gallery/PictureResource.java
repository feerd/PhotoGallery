package ch.M306_LB.gallery;

import ch.M306_LB.gallery.model.Picture;
import ch.M306_LB.gallery.service.PictureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/picture")
public class PictureResource {
    private final PictureService pictureService;

    public PictureResource(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Picture>> getAllPictures(){
        List<Picture> pictures = pictureService.findAllPictures();
        return new ResponseEntity<>(pictures, HttpStatus.OK);
    }

    @GetMapping("/find{id}")
    public ResponseEntity<Picture> getPictureById(@PathVariable("id") Long id){
        Picture picture = pictureService.findPictureById(id);
        return new ResponseEntity<>(picture, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Picture> addPicture(@RequestBody Picture picture){
        Picture newPicture = pictureService.addPicture(picture);
        return new ResponseEntity<>(newPicture, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Picture> updatePicture(@RequestBody Picture picture){
        Picture updatePicture = pictureService.updatePicture(picture);
        return new ResponseEntity<>(updatePicture, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePicture(@PathVariable("id") Long id){
        pictureService.deletePicture(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
