package pairFinder;

public class RunTests {

	public static void main(String[] args) {
						
		test(120);
		test(60);
		test(190);
		test(130);
	}

	private static void test(int sum) {
		
		BST tree = sample1();
		
		BSTPairFinder finder 
			= new BSTPairFinder(tree);
		
		finder.findPair(sum);
		
		System.out.println("-----------------------");
	}
	
	private static BST sample1() {
		
		BST tree = new BST();
		
		tree.insert(70);
		tree.insert(50);
		tree.insert(90);
		tree.insert(30);
		tree.insert(60);
		tree.insert(80);
		tree.insert(100);
		tree.insert(20);
		tree.insert(40);
	
		return tree;
	}
}