package hyh.l702.image_data_base.dao;

import hyh.l702.image_data_base.entity.Image;
import hyh.l702.image_data_base.entity.ImageOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ImageOperationDao extends JpaRepository<ImageOperation,Long> {
    List<ImageOperation> findByImageId(Long imageId);

}
