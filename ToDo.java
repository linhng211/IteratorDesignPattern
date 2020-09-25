import java.util.ArrayList;
/**
 * Hold details of a work need to complete
 * @author Linh Nguyen
 *
 */
public class ToDo {
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	/**
	 * set up the constructor
	 * @param title of the work
	 * @param description of the work
	 * @param price of the work
	 * @param contact information of the company
	 * @param supplies list need to do the work
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	/**
	 * this class return the price to complete the todo work
	 * @return price of each work
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * This method  representation of title, description, contact, supply list, and price
	 * @return String  contain all the details of a work
	 */
	public String toString() {
		String arrListOutput = supplies.toString().replaceAll("(^\\[|\\]$)", "");
		return "\n***** " + this.title + " *****\n"
				+ this.description + "\n"
				+ "Business Contact: " + this.contact + "\n"
				+ "Suppy List: " + arrListOutput + "\n" 
				+ "Price: " + this.price + "\n";
	}
}
