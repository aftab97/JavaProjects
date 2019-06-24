
public class Main {

	public static void main(String[] args) {
//		IntStack intStack = new IntStack();
//		if (!intStack.isFull()) {
//			intStack.push(2);
//			intStack.push(4);
//			intStack.push(6);
//			intStack.push(9);
//		}
//		System.out.println(intStack.pop());
//		System.out.println(intStack.pop()); //the pop method grabs the second top value which is 6
	
	Person person = new Person("umar", "23");
	Person person2 = new Person("aftab", "32");
	
	PersonStack stack = new PersonStack();
	
	stack.push(person);
	stack.push(person2);
	
	System.out.println(stack.pop().toString());
	System.out.println(stack.pop().toString());
	}

}
