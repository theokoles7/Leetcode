public class LongestCommonPrefix {
  public static void main(String args[]){
    String[] strs1 = {"flower", "flow", "flight"};
    String[] strs2 = {"dog", "racecar", "car"};
    String[] strs3 = {"ab", "a"};
    String[] strs4 = {"aa", "a"};
    String[] strs5 = {"", "b"};

    System.out.println("Example 1: Flower, Flow, Flight = " + longestCommonPrefix(strs1));
    System.out.println("Example 2: Dog, Racecar, Car = " + longestCommonPrefix(strs2));
    System.out.println("Example 3: ab, a = " + longestCommonPrefix(strs3));
    System.out.println("Example 4: aa, a = " + longestCommonPrefix(strs4));
    System.out.println("Example 5: \"\", b = " + longestCommonPrefix(strs5));
  }

  public static String longestCommonPrefix(String[] strs){
    if(strs==null || strs.length ==0){
        return "";
    }
    if(strs.length == 1){
        return strs[0];
    }

    boolean good = true;
    int i=0;

    while(good){
      for(int j = 1; j < strs.length; j++){
        if(strs[j].length() <= i || strs[j-1].length() <= i 
          || strs[j].charAt(i) != strs[j-1].charAt(i)){
            good = false;
            break;
        }               
      }
      if(good){
        i++;
      }else{
        break;
      }
    }
    return strs[0].substring(0, i);
  }
}
