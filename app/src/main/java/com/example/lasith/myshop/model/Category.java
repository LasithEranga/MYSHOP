package com.example.lasith.myshop.model;

public class Category {
    Integer id;
    Integer imgUrl;

    public Category(Integer id, Integer imgUrl) {
        this.id = id;
        this.imgUrl = imgUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Integer imgUrl) {
        this.imgUrl = imgUrl;
    }
}

