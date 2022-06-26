class Solution {
    public boolean isValid(String s) {
        		
Stack<Character> ss=new Stack<>();
for(int i=0;i<s.length();i++ ) {
	char curr=s.charAt(i);
	if(opening(curr)) {
		ss.push(curr);
	}
	else {
		if(ss.isEmpty())return false;
		else if(!match(ss.peek(),curr))
			return false;
		else
			ss.pop();
	}
}return ss.isEmpty();

		
	}
	static boolean opening (char c){
	        if(c=='{'||c=='('||c=='[')
	            return true;
	        return false;
	    }
  
  static boolean match(char a, char b){
	        if(a=='{'&&b=='}')
	            return true;
	        if(a=='('&&b==')')
	            return true;
	        if(a=='['&&b==']')
	            return true;
	        return false;
	    }
	
}
