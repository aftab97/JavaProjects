
public class IntStack {
	private int [] stack;
	private int top;
	private int size;
	public IntStack() {
		top = -1;
		size = 50;
		stack = new int[50];
	}
	
	public IntStack(int size) {
		top = -1;
		size = size;
		stack = new int[this.size];
	}
	
	public boolean push(int item) {
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		}
		else {
			return false;
		}
		
	}
	//decreases index when the top value is removed, pop fetches the most upper value from the stack
	public int pop() {
		return stack[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//checks if we can add specific value to stack or not
	public boolean isFull(){
		//if index matches the length(amount) -1 then the stack is full
		return (top == stack.length -1);
	}
}
