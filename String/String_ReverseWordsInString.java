class String_ReverseWordsInString {
    private static String reverseWords(String s) {
        // trim() - trimming any leading and trailing spaces in the string
        // split("\\s+") - splits the string by one or more spaces, ignoring extra spaces between words
        String[] str = s.trim().split("\\s+");
        StringBuilder reversedStr = new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            reversedStr.append(str[i]);
            if (i != 0) {
                reversedStr.append(" ");
            }
        }
        return reversedStr.toString();
    }
    public static void main(String[] args) {
        String s = "   the sky is blue  ";
        System.out.println(reverseWords(s)); }
}