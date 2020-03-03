package PilhaSequencial;

public class PilhaInt {
	public final int  N = 6;

	int dados[] = new int[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public boolean isFull() {
		if (topo==N)
			return true;
		else 
			return false;
	}
	public void push(int elem) {
		if(!isFull()) {
		dados[topo]=elem;
		topo++;
	}
		else 
			System.out.println("Stack Overflow");
	}

	public int pop() {
		topo--;
		return dados[topo];
	}
}


