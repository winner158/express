package com.example.express.domain.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.example.express.domain.enums.SexEnum;
import com.example.express.domain.enums.SysRoleEnum;
import com.example.express.domain.enums.ThirdLoginTypeEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Data
@Builder
public class SysUser implements UserDetails, CredentialsContainer {

    @TableId(type = IdType.AUTO)
    private String id;

    private String username;

    private String password;
    /**
     * 人脸唯一标识
     */
    private String faceToken;
    /**
     * 用户角色
     */
    @TableField("role_id")
    @JsonValue
    private SysRoleEnum role;
    /**
     * 性别
     */
    @JsonValue
    private SexEnum sex;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 学生证号
     */
    private String studentIdCard;

    private String tel;
    /**
     * 学校
     */
    private Integer schoolId;
    /**
     * 三方登陆类型
     */
    @TableField("third_login_type")
    @JsonValue
    private ThirdLoginTypeEnum thirdLogin;
    /**
     * 三方登陆ID
     */
    private String thirdLoginId;
    /**
     * 是否启用
     * 1：启用；0：禁用
     */
    private Integer hasEnable;

    @Version
    private Integer version;

    /**
     * 解冻时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lockDate;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createDate;

    @TableField(fill = FieldFill.UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateDate;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<GrantedAuthority>(){{
           add(new SimpleGrantedAuthority(getRole().getName()));
        }};
    }

    /**
     * 是否未冻结
     */
    @Override
    public boolean isAccountNonLocked() {
        if(this.lockDate == null) {
            return true;
        }

        return LocalDateTime.now().isAfter(this.lockDate);
    }
    /**
     * 是否启用
     */
    @Override
    public boolean isEnabled() {
        return this.hasEnable == 1;
    }

    @Override
    public void eraseCredentials() {
        this.password = null;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFaceToken() {
        return faceToken;
    }

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken;
    }

    public SysRoleEnum getRole() {
        return role;
    }

    public void setRole(SysRoleEnum role) {
        this.role = role;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getStudentIdCard() {
        return studentIdCard;
    }

    public void setStudentIdCard(String studentIdCard) {
        this.studentIdCard = studentIdCard;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public ThirdLoginTypeEnum getThirdLogin() {
        return thirdLogin;
    }

    public void setThirdLogin(ThirdLoginTypeEnum thirdLogin) {
        this.thirdLogin = thirdLogin;
    }

    public String getThirdLoginId() {
        return thirdLoginId;
    }

    public void setThirdLoginId(String thirdLoginId) {
        this.thirdLoginId = thirdLoginId;
    }

    public Integer getHasEnable() {
        return hasEnable;
    }

    public void setHasEnable(Integer hasEnable) {
        this.hasEnable = hasEnable;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public LocalDateTime getLockDate() {
        return lockDate;
    }

    public void setLockDate(LocalDateTime lockDate) {
        this.lockDate = lockDate;
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
}
