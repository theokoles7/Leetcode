public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        char[] arr1 = ("" + x).toCharArray();
        char[] arr2 = new char[arr1.length];

        int count = arr1.length -1;
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr1[count];
            count--;
        }

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
