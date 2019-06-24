
public class Main {
	public static void main(String[] args) {
		IntQ intq = new IntQ();
		intq.enqueue(3);
		intq.enqueue(4);
		intq.enqueue(6);
		
		System.out.println(intq.dequeue());
		System.out.println(intq.dequeue());
		
		
		intq.enqueue(7);
		
		System.out.println(intq.dequeue());
	}
}
