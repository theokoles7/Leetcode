import java.util.Stack;

public class ValidParentheses {
  public static void main(String args[]){
    // Test Variables
    String[] strings = {
      "()", "()[]{}", "(]", "(", "(("
    };

    // Tests
    for(int i = 0; i < strings.length; i++){
      System.out.println(
        "Test No. " + (i + 1) + " is valid: " + isValid(strings[i])
      );
    }
  }

  public static boolean isValid(String s){
    Stack<Character> stack = new Stack<>();

    for(char c : s.toCharArray()){
      if(stack.empty()){
        stack.push(c);
      }else{
        if(c == '(' || c == '[' || c == '{'){
          stack.push(c);
        }else{
          char top = stack.pop();
          if(
            (c == ')' && top != '(') ||
            (c == ']' && top != '[') ||
            (c == '}' && top != '{')
          ){return false;}
        }
      }
    }

    return stack.empty();
  }

  // public static boolean isValid(String s){
  //   if(s.length() > 1){
  //     switch(s.charAt(0)){
  
  //       case '(':
  //         if(s.charAt(1) != ']' && s.charAt(1) != '}'){
  //           return isValid(s.substring(1));
  //         }else{return false;}
  
  //       case '[':
  //         if(s.charAt(1) != ')' && s.charAt(1) != '}'){
  //           return isValid(s.substring(1));
  //         }else{return false;}
  
  //       case '{':
  //         if(s.charAt(1) != ']' && s.charAt(1) != ')'){
  //           return isValid(s.substring(1));
  //         }else{return false;}
  
  //       default: return false;
  //     }
  //   }
  //   return true;
  // }
}
