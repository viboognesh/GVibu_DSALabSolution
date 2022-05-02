package balancingBrackets;

public class CheckBracketBalance extends BracketsFunctions {
	
	private String bracketSequence;
	
	public CheckBracketBalance(String bracketSequence) {
		this.bracketSequence = bracketSequence;
	}
	
	public boolean check() {
		String stack = ""; //creates a string to hold the stack of characters
		
		for (int i = 0; i < bracketSequence.length(); i++) {  //for loop to loop through every bracket in sequence
			String bracket = bracketSequence.substring(i, i+1); //stores the string value of bracket at position 'i'
			
			if(ifopenBracket(bracket)) { //checks if bracket is open bracket
				stack = stack.concat(bracket); //adds the bracket to stack if it is open bracket
			}
			
			if(ifcloseBracket(bracket)) { //checks if bracket is close bracket
				String openPair = findOpenPair(bracket); //finds the open pair bracket of the close bracket
				if(stack.endsWith(openPair)) { //checks if last open bracket matches the close bracket
					//if matched, brackets is balanced and the last bracket is removed from the stack
					stack = stack.length()==1 ? "" : stack.substring(0, stack.length()-1); 
				}
				else {  //if doesn't match brackets is unbalanced 
					return false;  //and function returns false
				}
			}
		}
		
		if (stack == "") {  // in the end if all open brackets are matched and stack is empty
			return true; // function returns true
		}
		else { //if unmatched open brackets remain
			return false;  //function returns false
		}
	}
	

	

}
