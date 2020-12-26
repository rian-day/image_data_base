package hyh.l702.image_data_base.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ImageOperation {
    @Id
    private Long id;
    private Long imageId;
    private Long operationId;
    private Date createTime;
    private Date updateTime;
    private String operatedImagePath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperatedImagePath() {
        return operatedImagePath;
    }

    public void setOperatedImagePath(String operatedImagePath) {
        this.operatedImagePath = operatedImagePath;
    }
}
