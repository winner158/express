package com.example.express.domain.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.example.express.domain.enums.OrderDeleteEnum;
import com.example.express.domain.enums.OrderStatusEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 订单信息
 * @date 2019年04月16日 23:06
 */
@Data
public class OrderInfo {
    @TableId(type = IdType.ID_WORKER_STR)
    private String id;

    private String userId;
    /**
     * 快递单号
     */
    private String odd;
    /**
     * 快递公司ID
     */
    private Integer company;
    /**
     * 收件人
     */
    private String recName;
    /**
     * 收件电话
     */
    private String recTel;
    /**
     * 收货地址
     */
    private String recAddress;
    /**
     * 快递寄达地址
     */
    private String address;
    /**
     * 备注
     */
    private String remark;
    /**
     * 配送员ID
     */
    private String courierId;
    /**
     * 订单状态
     */
    @TableField("status")
    private OrderStatusEnum orderStatus;
    /**
     * 配送员备注
     */
    private String courierRemark;
    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer hasDelete;
    /**
     * 删除原因
     */
    private OrderDeleteEnum deleteType;

    @Version
    private Integer version;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createDate;

    @TableField(fill = FieldFill.UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateDate;

    /**
     * 快递重量
     */
    private double packageWeight;
    /**
     * 快递价格
     */
    private double packagePrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public String getRecTel() {
        return recTel;
    }

    public void setRecTel(String recTel) {
        this.recTel = recTel;
    }

    public String getRecAddress() {
        return recAddress;
    }

    public void setRecAddress(String recAddress) {
        this.recAddress = recAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCourierId() {
        return courierId;
    }

    public void setCourierId(String courierId) {
        this.courierId = courierId;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCourierRemark() {
        return courierRemark;
    }

    public void setCourierRemark(String courierRemark) {
        this.courierRemark = courierRemark;
    }

    public Integer getHasDelete() {
        return hasDelete;
    }

    public void setHasDelete(Integer hasDelete) {
        this.hasDelete = hasDelete;
    }

    public OrderDeleteEnum getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(OrderDeleteEnum deleteType) {
        this.deleteType = deleteType;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }
}
