package hyh.l702.image_data_base.dao;

import hyh.l702.image_data_base.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageDao extends JpaRepository<Image,Long> {
    //Image findById(Long id);
}
