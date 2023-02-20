package com.ecommerce.Backend.model;


import javax.persistence.*;
@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "category_name", length = 50)
    private String categoryname;

    @Column(name = "category_description", length = 50)
    private String description;

    @Column(name = "image", length = 12)
    private int image;

    public Category(int id, String categoryname, String description, int image) {
        this.id = id;
        this.categoryname = categoryname;
        this.description = description;
        this.image = image;
    }

    public Category() {
    }
    


    public Category(String categoryname, String description, int image) {
        this.categoryname = categoryname;
        this.description = description;
        this.image = image;
    }

    public int getCategoryid() {
        return id;
    }

    public void setCategoryid(int id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryname='" + categoryname + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
}

