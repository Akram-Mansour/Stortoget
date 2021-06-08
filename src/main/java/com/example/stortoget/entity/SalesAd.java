package com.example.stortoget.entity;

import javax.persistence.*;

@Entity
@Table(name ="ads")
public class SalesAd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String item;
    private String description;
    private String category;
    private String userName;
    private int price;
    private String img;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "SalesAd{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", userName='" + userName + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                '}';
    }
}