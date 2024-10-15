import java.util.Arrays;
public class CoreJavaPractice {
    public static String reverse(String s) {
       char[] ch = s.toCharArray();
       for (int i = 0; i < ch.length/2; i++) {
         char temp = ch[i];
         ch[i] = ch[ch.length-1-i];
         ch[ch.length-1-i] = temp;
       }
       return new String(ch);
    }
    public static void main(String[] args) {
        String s = "Ebaad Azam";
        String s2 = reverse(s);
        System.out.println(s2);
    }
}
