package com.example.express.domain.vo.user;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息VO
 * @author xiangsheng.wu
 * @date 2019年04月22日 13:05
 */
@Data
@Builder
public class UserInfoVO implements Serializable {
    private String username;
    /**
     * 性别
     */
    private String sex;
    /**
     * 性别ID
     */
    private String sexId;

    private String tel;
    /**
     * 学校名
     */
    private String school;

    private String studentIdCard;

    private String role;

    private String roleName;

    private String star;

    private String idCard;

    private String realName;
    /**
     * 能否切换角色（普通用户 --> 配送员）
     * 1：可以；0：不可以
     */
    private String canChangeRole;
    /**
     * 能否人脸登录
     * 1：可以；0：不可以
     */
    private String canFace;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSexId() {
        return sexId;
    }

    public void setSexId(String sexId) {
        this.sexId = sexId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStudentIdCard() {
        return studentIdCard;
    }

    public void setStudentIdCard(String studentIdCard) {
        this.studentIdCard = studentIdCard;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCanChangeRole() {
        return canChangeRole;
    }

    public void setCanChangeRole(String canChangeRole) {
        this.canChangeRole = canChangeRole;
    }

    public String getCanFace() {
        return canFace;
    }

    public void setCanFace(String canFace) {
        this.canFace = canFace;
    }
}
