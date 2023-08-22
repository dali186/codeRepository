package algorithm.storage.baekjoon;

public class LeetCode125 {
    //A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    //it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    //Given a string s, return true if it is a palindrome, or false otherwise.
    public static void main(String[] args) {
        String T = " ";
        System.out.println(isPalindrome(T));

    }

    public static boolean isPalindrome(String s) {
        String T = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for(int i = 0; i < T.length()/2; i++) {
            if(T.charAt(i) != T.charAt(T.length()-(i+1))) {
                return false;
            }
        }
        return true;
    }

}

//String.replaceAll(정규식,을 뭐로바꿀지)
//return은 마지막임
