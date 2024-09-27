class String_ValidPalindrome {

    public static boolean isPalindrome(String str) {
        String s = str.toLowerCase().replaceAll("[^a-z0-9]", ""); 
        // Above replaceAll("[^a-z0-9]", "") means that replace anything which is not small letter or number to empty string
        
        int l = 0;
        int r = s.length()-1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal:Panama";
        System.out.println(isPalindrome(str));
    }
}
