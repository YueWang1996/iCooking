package iCooking;

import java.io.Serializable;

/**
 * ...............................
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
	 * ..............................................
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
	 * ......................................
	 * 
	 * @param name
	 * @param amount
	 * @param unit
	 * @param description
	 */
	public Ingredient(String name, double amount, String unit, String description) {
		this.ingredientName = name;
		this.ingredientAmount = amount;
		this.ingredientUnit = unit;
		this.ingredientDescription = description;
	}

	/**
	 * ...........
	 * 
	 * @return
	 */
	public String getIngredientName() {
		return ingredientName;
	}

	/**
	 * .......
	 * 
	 * @param ingredientName
	 */
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	/**
	 * ..................
	 * 
	 * @return
	 */
	public double getIngredientAmount() {
		return ingredientAmount;
	}

	/**
	 * .................
	 * 
	 * @param ingredientAmount
	 */
	public void setIngredientAmount(double ingredientAmount) {
		this.ingredientAmount = ingredientAmount;
	}

	/**
	 * .............
	 * 
	 * @return
	 */
	public String getIngredientDescription() {
		return ingredientDescription;
	}

	/**
	 * .........
	 * 
	 * @param ingredientDescription
	 */
	public void setIngredientDescription(String ingredientDescription) {
		this.ingredientDescription = ingredientDescription;
	}

	/**
	 * ........
	 * 
	 * @return
	 */
	public String getIngredientUnit() {
		return ingredientUnit;
	}

	/**
	 * ..........
	 * 
	 * @param unit
	 */
	public void setIngredientUnit(String unit) {
		this.ingredientUnit = unit;
	}

	/**
	 * ........
	 * 
	 * @return
	 */
	public long getIngredientID() {
		return ingredientID;
	}

	/**
	 * ..........
	 * 
	 * @param ingredientID
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
