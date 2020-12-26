package hyh.l702.image_data_base.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Image {
    @Id
    private Long id;
    private String imagePath;
    private String imageName;
    private String remark;
    private Date createTime;
    private Date updateTime;
    private boolean origin;
//    @ManyToMany
//    @JoinTable(name = "image_operation",joinColumns ={ @JoinColumn(name="image_id")},
//            inverseJoinColumns = {@JoinColumn(name = "operation_id")})
//    private List<operation> operationList;
//
//
//    public List<operation> getOperationList() {
//        return operationList;
//    }
//
//    public void setOperationList(List<operation> operationList) {
//        this.operationList = operationList;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public boolean isOrigin() {
        return origin;
    }

    public void setOrigin(boolean origin) {
        this.origin = origin;
    }
}
