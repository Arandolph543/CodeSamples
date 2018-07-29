class Node {
	int data;
	Node left;
	Node(int data) {
		this.data = data;
	}
}

class AddNumbersInLinkedList {
	
	static int addLists(Node list1, Node list2) {
		int res = 0;
		StringBuilder num1 = new StringBuilder();
		StringBuilder num2 = new StringBuilder();
		while(list1 != null) {
			num1.append(list1.data);
			list1 = list1.left;
		}
		while(list2 != null) {
			num2.append(list2.data);
			list2 = list2.left;			
		}
		System.out.println("Debug: " + Integer.valueOf(num1.toString()) + Integer.valueOf(num2.toString()));
		res = Integer.valueOf(num1.toString()) + Integer.valueOf(num2.toString());
				
		return res;
	}
	

	public static void main(String[] arg) {
		Node variableConstant1 = new Node(1);
		variableConstant1.left = new Node(9);
		variableConstant1.left.left = new Node(3);
		variableConstant1.left.left.left = new Node(1);
		
		Node variableConstant2 = new Node(2);
		variableConstant2.left = new Node(7);
		variableConstant2.left.left = new Node(3);
		
		System.out.println(addLists(variableConstant1, variableConstant2));
	
	}
}
