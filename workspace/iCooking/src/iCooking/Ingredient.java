package iCooking;

import java.io.Serializable;

/**
 * This class implements different ingredients.
 * 
 * @author Guanyu Li
 * @version 1.0
 */
class Ingredient implements Serializable {

	private String ingredientName;
	private double ingredientAmount;
	private String ingredientDescription;
	private String ingredientUnit;
	private long ingredientID;

	/**
	 * Creates an Ingredient object with its name, amount, and description.
	 * 
	 * @param name
	 *            name of the ingredient
	 * @param amount
	 *            amount of the ingredient
	 * @param description
	 *            description of the ingredient
	 */
	public Ingredient(String name, double amount, String description) {
		this.ingredientName = name;
		this.ingredientAmount = amount;
		this.ingredientDescription = description;
	}

	/**
	 * Creates an Ingredient object with its name, amount, unit and description.
	 * 
	 * @param name
	 *            name of the ingredient
	 * @param amount
	 *            amount of the ingredient
	 * @param unit
	 *            unit of the ingredient
	 * @param description
	 *            description of the ingredient
	 */
	public Ingredient(String name, double amount, String unit, String description) {
		this.ingredientName = name;
		this.ingredientAmount = amount;
		this.ingredientUnit = unit;
		this.ingredientDescription = description;
	}

	/**
	 * Gets the name of the ingredient.
	 * 
	 * @return the name of the ingredient
	 */
	public String getIngredientName() {
		return ingredientName;
	}

	/**
	 * Sets the name of the ingredient.
	 * 
	 * @param ingredientName
	 *            the name of the ingredient
	 */
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	/**
	 * Gets the amount of the ingredient.
	 * 
	 * @return the amount of the ingredient
	 */
	public double getIngredientAmount() {
		return ingredientAmount;
	}

	/**
	 * Sets the amount of the ingredient.
	 * 
	 * @param ingredientAmount
	 *            the amount of the ingredient
	 */
	public void setIngredientAmount(double ingredientAmount) {
		this.ingredientAmount = ingredientAmount;
	}

	/**
	 * Gets the description of the ingredient.
	 * 
	 * @return the description of the ingredient
	 */
	public String getIngredientDescription() {
		return ingredientDescription;
	}

	/**
	 * Sets the description of the ingredient.
	 * 
	 * @param ingredientDescription
	 *            the description of the ingredient
	 */
	public void setIngredientDescription(String ingredientDescription) {
		this.ingredientDescription = ingredientDescription;
	}

	/**
	 * Gets the unit of the ingredient.
	 * 
	 * @return the unit of the ingredient
	 */
	public String getIngredientUnit() {
		return ingredientUnit;
	}

	/**
	 * Sets the unit of the ingredient.
	 * 
	 * @param unit
	 *            the unit of the ingredient
	 */
	public void setIngredientUnit(String unit) {
		this.ingredientUnit = unit;
	}

	/**
	 * Gets the ID of the ingredient.
	 * 
	 * @return the ID of the ingredient
	 */
	public long getIngredientID() {
		return ingredientID;
	}

	/**
	 * Sets the ID of the ingredient.
	 * 
	 * @param ingredientID
	 *            the ID of the ingredient
	 */
	public void setIngredientID(long ingredientID) {
		this.ingredientID = ingredientID;
	}

	@Override
	public String toString() {
		return "Ingredient [name=" + ingredientName + ", amount=" + ingredientAmount + ", description="
				+ ingredientDescription + ", unit=" + ingredientUnit + ", ingredientID=" + ingredientID + "]";
	}

}
