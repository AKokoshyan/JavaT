
public class Stack {

	private int size;
	private int[] stack;
	private int top;

	public Stack(int size) {
		this.size = size;
		this.stack = new int[size];
		this.top = -1;
	}
}
