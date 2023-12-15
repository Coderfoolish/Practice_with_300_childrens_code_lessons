package Week1;

public class Leetcode_5 {
    private boolean isPalindrome(String s) {
        if (s == null || s.length() == 0 || s.equals(""))
            return true;

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        /********* first approach *****************/
        /*
         * String reverse = "";
         * for(int i = s.length() - 1; i >= 0; i--) {
         * reverse += s.charAt(i);
         * }
         * 
         * return s.equals(reverse);
         */

        /**************** second approach *************/
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else
                return false;
        }

        return true;
    }

    public void findSolution() {
        String s = "A man, a plan, a canal: Panama";
        // String s = "race a car";
        // String s = "0P";
        System.out.println("Is palindrome : " + isPalindrome(s));
    }
}
