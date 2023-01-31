/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class CookBook {

    ArrayList<Recipe> recipeDB = new ArrayList<Recipe>();
    
    public CookBook(){

    }

    public ArrayList<Recipe> getRecipeDB() {
        return recipeDB;
    }

    public void setRecipeDB(ArrayList<Recipe> recipeDB) {
        this.recipeDB = recipeDB;
    }

    public void addToRecipeDB(Recipe recipe) {
        this.recipeDB.add(recipe);
    }

}
