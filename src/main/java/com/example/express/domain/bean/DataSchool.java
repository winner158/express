package com.example.express.domain.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 高校数据
 * @author xiangsheng.wu
 * @date 2019年04月21日 12:40
 */
@Data
public class DataSchool implements Serializable {
    @TableId
    private Integer id;
    /**
     * 学校名称
     */
    private String name;
    /**
     * 省份ID
     */
    private Integer provinceId;
    /**
     * 学校级别
     */
    private String level;
    /**
     * 学校网址
     */
    private String website;
    /**
     * 学校简称
     */
    private String abbreviation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}

