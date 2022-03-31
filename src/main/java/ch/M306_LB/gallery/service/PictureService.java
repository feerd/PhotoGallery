package ch.M306_LB.gallery.service;

import ch.M306_LB.gallery.exception.UserNotFoundException;
import ch.M306_LB.gallery.model.Picture;
import ch.M306_LB.gallery.repo.PictureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PictureService {
    private final PictureRepo pictureRepo;

    @Autowired
    public PictureService(PictureRepo pictureRepo) {
        this.pictureRepo = pictureRepo;
    }

    public Picture addPicture(Picture picture){
        System.out.println(picture);
        return pictureRepo.save(picture);
    }

    public List<Picture> findAllPictures(){
        return pictureRepo.findAll();
    }

    public Picture updatePicture(Picture picture){
        return pictureRepo.save(picture);
    }

    public Picture findPictureById(Long id){
        System.out.println("hallo");
        return pictureRepo.findPictureById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deletePicture(Long id){
        pictureRepo.deletePictureById(id);
    }
}
