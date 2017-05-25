package iCooking;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Cookbook Manager provides methods for user to get recipe by the name of
 * recipe, edit specific recipe, delete specific recipe, add new recipe.
 * 
 * @author Xu Chen
 * 
 * @version 1.0
 *
 */

public class CookBook implements Serializable {

	private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
	private String cookBookName = null;

	/**
	 * Constructor of cookbook containing the name of the cookbook
	 * 
	 * @param name
	 *            the name of the cookbook
	 */
	public CookBook(String name) {
		this.cookBookName = name;
	}

	/**
	 * Gets the name of the cookbook
	 * 
	 * @return the name of the cookbook
	 */
	public String getCookBookName() {
		return cookBookName;
	}

	/**
	 * Overrides toString method
	 * 
	 * @return new format of CookBook
	 */
	public String toString() {
		return "CookBook [recipeList=" + recipeList + ", cookBookName=" + cookBookName + "]";
	}

	/**
	 * Sets the name of the cookbook
	 * 
	 * @param cookBookName
	 *            name of the cookbook to set
	 */
	public void setCookBookName(String cookBookName) {
		this.cookBookName = cookBookName;
	}

	/**
	 * Searches the recipe(s) based on specific name
	 * 
	 * @param name
	 *            the name of the recipe to search
	 * @return the recipe of the name
	 */
	public Recipe getRecipe(String name) {
		Recipe recipeResult = null;
		for (int i = 0; i < recipeList.size(); i++) {
			if (recipeList.get(i).getRecipeName().equals(name)) {
				recipeResult = recipeList.get(i);
			}
		}
		return recipeResult;
	}

	/**
	 * Edits parts of the recipe
	 * 
	 * @param recipe
	 *            the recipe to be edited
	 */
	public void edit(Recipe recipe) {

	}

	/**
	 * Deletes specific recipe from database
	 * 
	 * @param recipe
	 *            the recipe to be deleted
	 */
	public void delete(Recipe recipe) {
		recipeList.remove(recipe);
	}

	/**
	 * Adds new recipe to database
	 * 
	 * @param recipe
	 *            the recipe to be added
	 */
	public void add(Recipe recipe) {
		recipeList.add(recipe);
	}

	/**
	 * Searches recipe(s) through filter
	 */
	public void filter() {
		// get id through filter
		// recipelist.get(ID);
	}

	/**
	 * Recalculates the ingredient amounts, preparation time and cooking time of
	 * the specific recipe, according to the request serving amount
	 * 
	 * @param recipe
	 *            the chosen recipe
	 * @param serving
	 *            the aim serve amount
	 */
	public void recalculateServings(String recipe, int serving) {
		double temp = getRecipe(recipe).getServing();
		getRecipe(recipe).setServing(serving);
		int tempPreparationTime = getRecipe(recipe).getPreparationTime();
		int tempCookingTime = getRecipe(recipe).getCookingTime();
		for (int i = 0; i <= getRecipe(recipe).getIngredientList().size() - 1; i++) {
			double tempAmount = getRecipe(recipe).getIngredientList().get(i).getIngredientAmount();
			getRecipe(recipe).getIngredientList().get(i).setIngredientAmount(tempAmount * serving / temp);
		}
		getRecipe(recipe).setPreparationTime((int) (tempPreparationTime * serving / temp));
		getRecipe(recipe).setCookingTime((int) (tempCookingTime * serving / temp));

	}

}
