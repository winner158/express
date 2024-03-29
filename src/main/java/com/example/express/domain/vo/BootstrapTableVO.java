package com.example.express.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author xiangsheng.wu
 * @date 2019年04月23日 18:11
 */
@Data
public class BootstrapTableVO<T> implements Serializable {
    /**
     * 总记录数
     */
    private Long total;
    /**
     * 记录
     */
    private List<T> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
