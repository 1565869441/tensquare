package com.tensquare.controller;

import com.tensquare.pojo.Label;
import com.tensquare.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建者 Administrator
 * @创时间 2019/10/13 21:12
 * @描述
 * @版本 tensquare_parent
 * @更新者 com.tensquare.controller
 * @更新时间 2019/10/13
 * @更新描述 TODO
 */
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;

    @GetMapping
    public Result findAll() {
        return new Result(true, StatusCode.OK, "查询成功", labelService.findAll());
    }

    @GetMapping(value = "/{id}")
    public Result findById(@PathVariable("id") String id) {
        return new Result(true, StatusCode.OK, "查询成功", labelService.findById(id));
    }

    @PostMapping
    public Result add(@RequestBody Label label) {
        labelService.add(label);
        return new Result(true, StatusCode.OK, "添加成功");
    }
    @PostMapping
    public Result update(@PathVariable("id") String id,@RequestBody Label label){
        label.setId(id);
        labelService.update(label);
        return new Result(true, StatusCode.OK, "修改成功");
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable("id") String id){
        labelService.deleteById(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }
}
