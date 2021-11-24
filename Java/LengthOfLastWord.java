public class LengthOfLastWord {
  public static void main(String args[]){
    System.out.println("Test 1: \'Hello World\' = " + lengthOfLastWord("Hello World"));
    System.out.println("Test 2: \'   fly me   to   the moon  \' = " + lengthOfLastWord("   fly me   to   the moon  "));
    System.out.println("Test 3: \'luffy is still joyboy\' = " + lengthOfLastWord("luffy is still joyboy"));
    System.out.println("Test 4: \'Hello\' = " + lengthOfLastWord("Hello"));
    System.out.println("Test 5: \'a \' = " + lengthOfLastWord("a "));
  }

  public static int lengthOfLastWord(String s){
    int len = 0;
    boolean hit = false;

    for(int i = s.length() - 1; i >= 0 ; i--){
      if(s.charAt(i) == ' ' && hit){
        return len;
      }else if(s.charAt(i) != ' '){
        hit = true;
        len++;
      }else{
        continue;
      }
    }

    return len;
  }
}
