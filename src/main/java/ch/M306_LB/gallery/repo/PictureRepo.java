package ch.M306_LB.gallery.repo;

import ch.M306_LB.gallery.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PictureRepo extends JpaRepository<Picture, Long> {
    void deletePictureById(Long id);

    Optional<Picture> findPictureById(Long id);
}
