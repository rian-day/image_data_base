package hyh.l702.image_data_base.controller;

import hyh.l702.image_data_base.dao.ImageDao;
import hyh.l702.image_data_base.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.logging.Logger;

@Controller
@ResponseBody
public class testController {
    @Autowired
    ImageDao imageDao;
    @RequestMapping("/test")
    public String get(){
        return "HelloWorld";

    }

    @RequestMapping("/list")
    public List<Image> imageList(Integer pageNum, Integer pageSize){
        if (pageNum == null)pageNum = 1;
        if (pageSize == null)pageSize=10;

        Pageable pageable=PageRequest.of(pageNum-1,pageSize);
        Page<Image> result = imageDao.findAll(pageable);

        //logger.info("pageNum==" + pageNum);

        return result.getContent();
    }
}
