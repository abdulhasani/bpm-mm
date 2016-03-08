package com.jmat.bpm.support.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by User on 2/27/2016.
 */
@MappedSuperclass
public abstract class AbstractEntity implements IEntity{

    @Id
    @Type(type = "pg-uuid")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy = "uuid2")
    private UUID id;

    @Column(name = "create_at",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Column(name = "update_at",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @PrePersist
    void prePersist(){
        this.createAt=this.updateAt=new Date();
    }

    @PreUpdate
    void preUpdate(){
        this.updateAt=new Date();
    }
}
