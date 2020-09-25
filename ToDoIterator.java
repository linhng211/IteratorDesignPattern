import java.util.Iterator;
/**
 * Iterator
 * @author Linh Nguyen
 *
 */
public class ToDoIterator implements Iterator {
	private ToDo[] todos;
	private int position = 0;
	/**
	 * accept an array of ToDo items
	 * @param todos
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	/**
	 * This method return the next ToDo, if it has one 
	 * @return toDo
	 */
	public ToDo next() {
		ToDo toDo = todos[position];
		position = position+1;
		return toDo;
	}
	/**
	 * This method returns true if there more item to iterate over, otherwise return false
	 * @return boolean
	 */
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null){
			return false;
		}
		else {
			return true;
		}
	}
}
