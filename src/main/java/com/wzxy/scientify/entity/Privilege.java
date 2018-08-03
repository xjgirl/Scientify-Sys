package com.wzxy.scientify.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_privilege", schema = "sciencedb", catalog = "")
public class Privilege {
    private int id;
    private String module;
    private String oprator;
    private Integer parentId;
    private String privName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "module")
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Basic
    @Column(name = "oprator")
    public String getOprator() {
        return oprator;
    }

    public void setOprator(String oprator) {
        this.oprator = oprator;
    }

    @Basic
    @Column(name = "parentId")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "privName")
    public String getPrivName() {
        return privName;
    }

    public void setPrivName(String privName) {
        this.privName = privName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Privilege privilege = (Privilege) o;
        return id == privilege.id &&
                Objects.equals(module, privilege.module) &&
                Objects.equals(oprator, privilege.oprator) &&
                Objects.equals(parentId, privilege.parentId) &&
                Objects.equals(privName, privilege.privName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, module, oprator, parentId, privName);
    }
}
