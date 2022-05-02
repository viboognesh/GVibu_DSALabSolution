package balancingBrackets;

public class BracketsFunctions {
	
	private String openBrackets = "({[<";  //all open brackets
	private String closeBrackets = ")}]>"; //all close brackets

	public boolean ifcloseBracket(String bracket) {  //returns true if given bracket is close bracket else returns false
		if (closeBrackets.contains(bracket)){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean ifopenBracket(String bracket) {  //returns true if given bracket is open bracket else returns false
		if (openBrackets.contains(bracket)){
			return true;
		}
		else {
			return false;
		}
	}
	
	public String findOpenPair(String bracket) {  //returns the opposite open bracket pair of given close bracket
		int index = closeBrackets.indexOf(bracket);
		String openPair = openBrackets.substring(index,index+1);
		return openPair;
	}
	
	/*
	public String findClosePair(String bracket) {  //returns the opposite close bracket pair of given open bracket
		int index = openBrackets.indexOf(bracket);
		String openPair = closeBrackets.substring(index,index+1);
		return openPair;
	}
	*/

}
