package com.tensquare.service;

import com.tensquare.dao.LabelDao;
import com.tensquare.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建者 Administrator
 * @创时间 2019/10/13 21:22
 * @描述
 * @版本 tensquare_parent
 * @更新者 com.tensquare.service
 * @更新时间 2019/10/13
 * @更新描述 TODO
 */
@Service
public class LabelService {
    @Autowired
    private LabelDao labelDao;
    public List<Label> findAll() {
        return labelDao.findAll();
    }

    public Label findById(String id) {
        return labelDao.findById(id).get();
    }

    public void add(Label label) {
        labelDao.save(label);
    }

    public void update(Label label) {
        labelDao.save(label);
    }

    public void deleteById(String id) {
        labelDao.deleteById(id);
    }
}
