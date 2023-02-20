package com.ecommerce.Backend.DTO;

public class CategoryUpdateDTO {
    private int id;

    private String categoryname;

    private String description;

    private int image;

    public CategoryUpdateDTO(int id, String categoryname, String description, int image) {
        this.id = id;
        this.categoryname = categoryname;
        this.description = description;
        this.image = image;
    }

    public CategoryUpdateDTO() {
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
        return "CategoryDTO{" +
                "id=" + id +
                ", categoryname='" + categoryname + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
    
}
