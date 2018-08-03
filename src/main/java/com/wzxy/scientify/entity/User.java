package com.wzxy.scientify.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.io.Serializable;

@Entity
@Table(name = "t_user", schema = "sciencedb", catalog = "")

public class User implements Serializable{
    private int id;
    private String userId;
    private String userName;
    private String password;
    private Integer userType;
    private Integer userStatus;
    private Timestamp createTime;
    private Timestamp modifyTime;
    private Timestamp loginTime;
    private Integer isDel;
    private Integer authId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "userId")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "userType")
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "userStatus")
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "modifyTime")
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "loginTime")
    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "isDel")
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Basic
    @Column(name = "authId")
    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(userId, user.userId) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password) &&
                Objects.equals(userType, user.userType) &&
                Objects.equals(userStatus, user.userStatus) &&
                Objects.equals(createTime, user.createTime) &&
                Objects.equals(modifyTime, user.modifyTime) &&
                Objects.equals(loginTime, user.loginTime) &&
                Objects.equals(isDel, user.isDel) &&
                Objects.equals(authId, user.authId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, userName, password, userType, userStatus, createTime, modifyTime, loginTime, isDel, authId);
    }
}
