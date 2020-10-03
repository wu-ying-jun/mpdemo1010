package com.atguigu.mpdemo1010.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;


@Data
public class User {
    //设置主键策略
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    private String name;
    private Integer age;
    private String email;

    //设置自动填充,插入时操作
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    //设置自动填充,第一次插入时和后续修改时操作
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    //设置乐观锁
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

    //设置逻辑删除
    @TableLogic
    private Integer deleted;


}
