package lab10;

public class Stack {
		
		private int stackSize;
		private char[] stackArr;
		private int top;
		
		public Stack(int size) {
			stackSize = size;
			stackArr = new char[stackSize];
			top = -1;
		}
		
		public void push(char item) {
			stackArr[++top] = item;
		}
		
		public char pop() {
			return stackArr[top--];
		}
		
		public char peek() {
			return stackArr[top];
		}
		
		public boolean isStackEmpty() {
			return (top == -1);
		}
		
		public boolean isStackFull() {
			return (top == stackSize - 1);
		}
	}



