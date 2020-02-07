package com.example.express.domain.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 快递公司数据
 * @author xiangsheng.wu
 * @date 2019年04月24日 14:52
 */
@Data
public class DataCompany implements Serializable {
    @TableId
    private Integer id;

    private String name;

    private String code;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
