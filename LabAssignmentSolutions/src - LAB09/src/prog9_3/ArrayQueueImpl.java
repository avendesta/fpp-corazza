package prog9_3;


public class ArrayQueueImpl {
	static final int INITIAL_SIZE = 10;
	private int[] arr = new int[INITIAL_SIZE];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	private void resize() {
		int[] newArr = new int[size*2];
		System.arraycopy(arr, 0, newArr, 0, size);
		this.arr = newArr;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int i) {
		if(rear>=arr.length)
			resize();
		arr[rear] = i;
		size++;
		rear++;
	}
	
	public int dequeue() {
		size--;
		return arr[++front];
	}
	
	public int size() {
		return size;
	}
	public int peek() {
		if(this.isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty!");
		return arr[front+1];
	}
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();

		//uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();

		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

