package com.tensquare.dao;

import com.tensquare.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @创建者 Administrator
 * @创时间 2019/10/13 21:08
 * @描述
 * @版本 tensquare_parent
 * @更新者 com.tensquare.dao
 * @更新时间 2019/10/13
 * @更新描述 TODO
 */
public interface LabelDao extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {
}
