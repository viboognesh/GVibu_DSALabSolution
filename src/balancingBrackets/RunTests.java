package balancingBrackets;

public class RunTests {

	public static void main(String[] args) {
		test("{[()]}");
		
		test("{}");

		
//		test("[]");
//		test("[{}]");
//		test("[<>]");
//		test("[<<]");
//		test("({[<>]})");
		test("M[MW]W");
		test("M[]");
//		test("[<>");
	}
	
	private static void test(String brackets) {
		
		CheckBracketBalance checker 
			= new CheckBracketBalance(brackets);
		boolean result = checker.check();
		
		if (result) {
			System.out.println("Bracket expression '" 
					+ brackets + "' is balanced");			
		}else {
			System.out.println("Bracket expression '" 
					+ brackets + "' is NOT balanced");
		}		
	}

}
