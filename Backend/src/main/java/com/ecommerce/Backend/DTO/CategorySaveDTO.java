package com.ecommerce.Backend.DTO;

public class CategorySaveDTO {
 

    private String categoryname;

    private String description;

    private int image;

    public CategorySaveDTO(String categoryname, String description, int image) {
        this.categoryname = categoryname;
        this.description = description;
        this.image = image;
    }
    public CategorySaveDTO() {
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
        return "CategorySaveDTO{" +
                "categoryname='" + categoryname + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }

   
    
}
