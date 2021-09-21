package LetsCodeItUdemy;

public class AccessModifierDemo {
	private String colour;
	private String model;
	private int no_of_doors;
	public double price;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model == "TATA") {
			this.model = model;
		} else {
			this.model = "hundai";
		}

	}

	public int getNo_of_doors() {
		return no_of_doors;
	}

	public void setNo_of_doors(int no_of_doors) {
		this.no_of_doors = no_of_doors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
