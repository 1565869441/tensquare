package com.tensquare.pojo;

/**
 * @创建者 Administrator
 * @创时间 2019/10/13 21:06
 * @描述
 * @版本 tensquare_parent
 * @更新者 com.tensquare.pojo
 * @更新时间 2019/10/13
 * @更新描述 TODO
 */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 标签实体类
 */
@Entity
@Table(name="tb-label")
@Data
public class Label {
    @Id
    private String id;//
    private String labelname;//标签名称
    private String state;//状态
    private Long count;//使用数量
    private Long fans;//关注数
    private String recommend;//是否推荐
}
