package hyh.l702.image_data_base.dao;

import hyh.l702.image_data_base.entity.Image;
import hyh.l702.image_data_base.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OperationDao extends JpaRepository<Operation,Long> {

}
