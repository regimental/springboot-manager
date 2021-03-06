package com.company.project.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.company.project.vo.req.PageReqVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 操作日志
 *
 * @author wenbin
 * @version V1.0
 * @date 2020年3月18日
 */
@Data
public class SysLog extends PageReqVO implements Serializable {
    @TableId(type = IdType.UUID)
    private String id;

    private String userId;

    private String username;

    private String operation;

    private Integer time;

    private String method;

    private String params;

    private String ip;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(exist = false)
    private String startTime;

    @TableField(exist = false)
    private String endTime;

}