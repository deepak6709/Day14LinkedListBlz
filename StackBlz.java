package com.datastructure;

public class StackBlz {

	
		
		    public static void main(String[] args) {
		        Stack<Integer> stack = new Stack<>();
		        stack.push(70);
		        stack.push(30);
		        stack.push(56);
		        stack.print();
		        System.out.println();
		        while(!stack.isEmpty()){
		            System.out.println(stack.peek());
		            stack.pop();
		            stack.print();
		            System.out.println();
		        }
		        Queues<Integer> queue = new Queues<>();
		        queue.enqueu(56);
		        queue.enqueu(30);
		        queue.enqueu(70);
		        queue.print();
		    }
		}
	}

}
