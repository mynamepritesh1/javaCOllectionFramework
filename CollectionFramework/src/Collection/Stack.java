package Collection;

public class Stack {

	public static void main(String[] args) {
		java.util.Stack<String> animals = new java.util.Stack<>();
		//add animals
		animals.push("dog");
		animals.push("cat");
		animals.push("tiger");
		
		System.out.println("Stack : " + animals);
		
		//see which animal is first using peek
		System.out.println(animals.peek());
		  
		//using pop we can remove then element
		animals.pop();
		
		System.out.println("Stack : " + animals);
	}

}
