import java.util.ArrayList;
/**
 * A list of work need to do
 * @author Linh Nguyen
 *
 */
public class ContractorToDoList {
	private String address;
	private ToDo[] todos;
	private int count = 0;
	/**
	 * Holds the address of the house the contractor's todo list is for and declare the todos is an array with size of 2
	 * @param address of the house
	 */
	public ContractorToDoList(String address) {
		this.address = address;
		todos = new ToDo[2];
	}
	/**
	 *  This method add the work to the list with the title, description, price, contact, and list of supplies 
	 * @param title of the work
	 * @param description of the work
	 * @param price to complete the work
	 * @param contact of the company 
	 * @param supplies list need to do the work
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo todo = new ToDo(title, description, price, contact, supplies);
		if (count >= 2) {
			todos = growArray(todos);
		}
		todos[count] = todo;
		count++;
	}
	/**
	 * This method return the address of the house
	 * @return String address
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * This method return the summation price by loop through the list of work and add the price
	 * @return double total price of the project
	 */
	public double getTotalCost() {
		double sum = 0;
		for(int i = 0 ; i < count ; i++) {
			sum = sum + todos[i].getPrice();
		}
		return sum;
	}
	/**
	 * This method grow the size of the array contain the list of work by create a new array and copy all the data
	 * @param todos
	 * @return ToDo[] with twice the size with the same data
	 */
	private ToDo[] growArray (ToDo[] todos) {
		ToDo[] newArr = new ToDo[todos.length*2];
		 for (int i = 0; i < count; i++) {
	            newArr[i] = todos[i];
		 }
		 return newArr;
	}
	/**
	 * This method returns a new ToDoIterator
	 * @return ToDoIterator 
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
	}
}
