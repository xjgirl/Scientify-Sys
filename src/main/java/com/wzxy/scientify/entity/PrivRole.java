package com.wzxy.scientify.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_priv_role", schema = "sciencedb", catalog = "")
public class PrivRole {
    private int id;
    private Integer roleId;
    private Integer privId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "roleId")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "privId")
    public Integer getPrivId() {
        return privId;
    }

    public void setPrivId(Integer privId) {
        this.privId = privId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrivRole privRole = (PrivRole) o;
        return id == privRole.id &&
                Objects.equals(roleId, privRole.roleId) &&
                Objects.equals(privId, privRole.privId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleId, privId);
    }
}
