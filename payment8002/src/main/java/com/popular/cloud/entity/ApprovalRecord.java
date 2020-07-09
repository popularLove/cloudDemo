package com.popular.cloud.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuhang
 * @since 2020-07-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("meet_approval_record")
public class ApprovalRecord extends Model<ApprovalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;
    /**
     * 需求号
     */
    private String requestId;
    /**
     * 类型
     */
    private String type;
    /**
     * 审批人账号
     */
    private String userCode;
    /**
     * 流程节点名称
     */
    private String request;
    /**
     * 审批人角色
     */
    private String desription;
    /**
     * 审核意见
     */
    private String opinion;
    /**
     * 最后更新人
     */
    private String lastModifiedBy;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 最后更新时间
     */
    private Date gmtModified;
    /**
     * 删除标识：0正常，1删除
     */
    private Integer delFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
