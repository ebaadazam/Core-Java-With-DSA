import java.util.HashMap;
import java.util.Map;
public class String_ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // If lengths are not equal, they cant be anagrams
        if (s.length() != t.length()) return false;

        // creating hashmaps for each for storing the frequency of chars
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(Character c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c,0)+1);
        }
        for(Character c2 : t.toCharArray()) {
            mapT.put(c2, mapT.getOrDefault(c2,0)+1);
        }
        
        return mapS.equals(mapT);
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));
        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2));
    }
}