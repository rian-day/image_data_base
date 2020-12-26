package hyh.l702.image_data_base.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Operation {
    @Id
    private Long id;
    private String operationName;
    private Date createTime;
    private Date updateTime;
//    @ManyToMany
//    @JoinTable(name = "image_operation",joinColumns ={ @JoinColumn(name="operation_id")},
//            inverseJoinColumns = {@JoinColumn(name = "image_id")})
//    private List<operation> imageList;
//
//    public List<operation> getImageList() {
//        return imageList;
//    }
//
//    public void setImageList(List<operation> imageList) {
//        this.imageList = imageList;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
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
}
