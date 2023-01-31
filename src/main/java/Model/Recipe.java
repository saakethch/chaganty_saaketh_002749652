/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 15512
 */
public class Recipe {
    String recipeName;
    String category;
    String description;
    int numOfItems;
    int servingSize;
    Double difficulty;
    String recipeImage;
    Boolean glutenFree;
    Chef chefDetails;
    public Recipe(){
        
    }
    public String getRecipeName() {
        return recipeName;
    }
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getNumOfItems() {
        return numOfItems;
    }
    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }
    public int getServingSize() {
        return servingSize;
    }
    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }
    public Double getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }
    public String getRecipeImage() {
        return recipeImage;
    }
    public void setRecipeImage(String recipeImage) {
        this.recipeImage = recipeImage;
    }
    public Boolean getGlutenFree() {
        return glutenFree;
    }
    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
    public Chef getChefDetails() {
        return chefDetails;
    }
    public void setChefDetails(Chef chefDetails) {
        this.chefDetails = chefDetails;
    }
    
    
}
