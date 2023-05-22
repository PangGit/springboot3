package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName jbxx_hxx
 */
@TableName(value ="jbxx_hxx")
@Data
public class JbxxHxx implements Serializable {
    /**
     * 
     */
    private String nbhh;

    /**
     * 
     */
    private String hh;

    /**
     * 
     */
    private String hlx;

    /**
     * 
     */
    private String hjdzbm;

    /**
     * 
     */
    private String hjdzssxq;

    /**
     * 
     */
    private String hjdzjlx;

    /**
     * 
     */
    private String hjdzjlxms;

    /**
     * 
     */
    private String hjdmlph;

    /**
     * 
     */
    private String hjdmlphms;

    /**
     * 
     */
    private String hjdmlxz;

    /**
     * 
     */
    private String hjdzxz;

    /**
     * 
     */
    private String hjdz;

    /**
     * 
     */
    private String xzjd;

    /**
     * 
     */
    private String jcwh;

    /**
     * 
     */
    private String pcs;

    /**
     * 
     */
    private String zrq;

    /**
     * 
     */
    private String jhlb;

    /**
     * 
     */
    private String jlsj;

    /**
     * 
     */
    private String chlb;

    /**
     * 
     */
    private String cxsj;

    /**
     * 
     */
    private String gxsj;

    /**
     * 
     */
    private String hhzt;

    /**
     * 
     */
    private Long sjgsdwdm;

    /**
     * 
     */
    private String sjgsdwmc;

    /**
     * 
     */
    private String czdwdm;

    /**
     * 
     */
    private String czdwmc;

    /**
     * 
     */
    private Long czybh;

    /**
     * 
     */
    private String czyxm;

    /**
     * 
     */
    private String czsj;

    /**
     * 
     */
    private String objid;

    /**
     * 
     */
    private Long logid;

    /**
     * 
     */
    private String cxbz;

    /**
     * 
     */
    private String reserve5;

    /**
     * 
     */
    private String reserve2;

    /**
     * 
     */
    private String reserve3;

    /**
     * 
     */
    private String reserve4;

    /**
     * 
     */
    private String reserve1;

    /**
     * 
     */
    private String ischange;

    /**
     * 
     */
    private String sjly;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}