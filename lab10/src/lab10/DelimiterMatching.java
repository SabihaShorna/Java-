package lab10;

public class DelimiterMatching {


		public boolean isDelimiterMatching(String inputExpr) {
			int stackSize = inputExpr.length();
			Stack myStack = new Stack(stackSize);
			char ch, stackContent;

			for(int i = 0; i < inputExpr.length(); i++) {
				ch = inputExpr.charAt(i);
				switch(ch) {
				case '(':
				case '{':
				case '[':
					myStack.push(ch);
					break;
				case ')':
				case '}':
				case ']':
					if(!myStack.isStackEmpty()) {
						stackContent = myStack.pop();
						if((ch == ')' && stackContent != '(') ||
								(ch == '}' && stackContent != '{') || 
								(ch == ']' && stackContent != '[')) {
							System.out.println("Mismatch Found: " + ch + " at " + i);
							return false;
						}
					}
					else {
						System.out.println("Mismatch Found: " + ch + " at " + i);
						return false;
					}
					break;
				default:
					break;
				}
			}
			
			if(!myStack.isStackEmpty()) {
				System.out.println("Missing Right Delimiter");
			}
			return true;
		}
	}



