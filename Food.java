package LunchOrder;

public class Food {
	
	private String price;
	private String fat;
	private String carbs;
	private String fiber;
	private int inputValid;
	
	public Food(String price, String fat, String carbs, String fiber) {
		this.price = price;
		this.fat = fat;
		this.carbs = carbs;
		this.fiber = fiber;
	}
	
	public Food() {
		
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFat() {
		return fat;
	}

	public void setFat(String fat) {
		this.fat = fat;
	}

	public String getCarbs() {
		return carbs;
	}

	public void setCarbs(String carbs) {
		this.carbs = carbs;
	}

	public String getFiber() {
		return fiber;
	}

	public void setFiber(String fiber) {
		this.fiber = fiber;
	}
	public boolean validateNum(String input, int min, int max) {
		boolean result = true;
		if(input == "") {
			System.out.println("Invalid");
			result = false;
		}
		else{
			try {
				int inputValid = Integer.parseInt(input);
				
				if(inputValid<max && inputValid>min) {
					this.inputValid = inputValid;
					result = true;
				}
			}catch(Exception e) {
				result = false;
				System.out.println("Invalid. Try again");
			}
		}
		return result;
	}
	
	public int getValidInput() {
		return inputValid;
	}
}
