class String_ReverseString {
    private static String reverseString(String str) {

        char[] ch = str.toCharArray();
        int i=0, j=str.length()-1;

        while (i<j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++; j--;
        }
        return new String(ch);
    }  
    public static void main(String[] args) {
        String str = "ebaad";
        String res = reverseString(str);
        System.out.println(res);
    }  
}