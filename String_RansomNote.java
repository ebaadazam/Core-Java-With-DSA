import java.util.HashMap;
import java.util.Map;

class String_RansomNote {
    private static boolean sample(String ransomNote, String magazine) {
   
        // Creating a map and putting the values inside it
        Map<Character, Integer> mapMagazine = new HashMap<>();
        for (Character c : magazine.toCharArray()) {
            mapMagazine.put(c, mapMagazine.getOrDefault(c, 0)+1);
        }

        // Nothing, just printing the hashmap of magazine
        mapMagazine.forEach((key, value)->System.out.println(key + " : " + value));

        // Loop through each character in ransomNote and check availability
        for (char c : ransomNote.toCharArray()) {
            if (!mapMagazine.containsKey(c) || mapMagazine.get(c) == 0) {
                return false;
            }
            mapMagazine.put(c, mapMagazine.get(c) - 1);
        }

       return true;
    }
    public static void main(String[] args) {
      String ransomNote = "aa";
      String magazine = "aab";
      System.out.println(sample(ransomNote, magazine));
    }    
}