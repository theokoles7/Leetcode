public class RomanToInteger {

  public static void main(String args[]) {
    System.out.println("\nExample 1: \nIII = " + romanToInt("III"));
    System.out.println("\nExample 2: \nIV = " + romanToInt("IV"));
    System.out.println("\nExample 3: \nIX = " + romanToInt("IX"));
    System.out.println("\nExample 4: \nLVIII = " + romanToInt("LVIII"));
    System.out.println("\nExample 5: \nDCXXI = " + romanToInt("DCXXI"));
    System.out.println("\nExample 6: \nMCMXCIV = " + romanToInt("MCMXCIV"));
  }

  public static int romanToInt(String s) {
    int sum = 0;
    char[] rom = s.toCharArray();

    for (int i = 0; i < rom.length; i++) {
      if (rom[i] == 'M') {
        sum += 1000;
      } else if (rom[i] == 'D') {
        sum += 500;
      } else if (rom[i] == 'L') {
        sum += 50;
      } else if (rom[i] == 'V') {
        sum += 5;
      } else if (rom[i] == 'C') {
        if (i != rom.length - 1) {
          if (rom[i + 1] == 'D') {
            sum += 400;
            i++;
          } else if (rom[i + 1] == 'M') {
            sum += 900;
            i++;
          } else {
            sum += 100;
          }
        } else {
          sum += 100;
        }
      } else if (rom[i] == 'X') {
        if (i != rom.length - 1) {
          if (rom[i + 1] == 'L') {
            sum += 40;
            i++;
          } else if (rom[i + 1] == 'C') {
            sum += 90;
            i++;
          } else {
            sum += 10;
          }
        } else {
          sum += 10;
        }
      } else if (rom[i] == 'I') {
        if (i != rom.length - 1) {
          if (rom[i + 1] == 'V') {
            sum += 4;
            i++;
          } else if (rom[i + 1] == 'X') {
            sum += 9;
            i++;
          } else {
            sum += 1;
          }
        } else {
          sum += 1;
        }
      } else {
        System.out.println("Something went wrong!");
      }
    }
    return sum;
  }
}