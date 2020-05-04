package com.xqsight.account.entity;

import java.io.Serializable;
import java.util.Date;

import com.xqsight.common.entity.BaseEntity;
import lombok.Data;

/**
 * sys_area
 * @author 
 */
@Data
public class SysArea extends BaseEntity implements Serializable {
    /**
     * 区域编码
     */
    private String areaCode;

    /**
     * 父级编号
     */
    private String parentCode;

    /**
     * 所有父级编号
     */
    private String parentCodes;

    /**
     * 本级排序号（升序）
     */
    private Long treeSort;

    /**
     * 所有级别排序号
     */
    private String treeSorts;

    /**
     * 是否最末级
     */
    private String treeLeaf;

    /**
     * 层次级别
     */
    private Short treeLevel;

    /**
     * 全节点名
     */
    private String treeNames;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 区域类型
     */
    private String areaType;

    private static final long serialVersionUID = 1L;
}