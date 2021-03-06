package org.mushare.tsukuba.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tsukuba_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String uid;

    @Column(nullable = false)
    private Long createAt;

    @Column(nullable = false)
    private String name;

    @Column
    private String avatar;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false, unique = true)
    private String identifier;

    @Column(nullable = false)
    private String credential;

    @Column
    private String contact;

    @Column
    private String address;

    @Column(nullable = false)
    private Integer level;

    @Column(nullable = false)
    private Integer rev;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public User() {
        super();
    }

    public User(Long createAt, String type, String identifier, String credential, String name, Integer level, Integer rev) {
        this.createAt = createAt;
        this.type = type;
        this.identifier = identifier;
        this.credential = credential;
        this.name = name;
        this.level = level;
        this.rev = 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User)obj;
        return this.uid.equals(user.getUid());
    }

}


