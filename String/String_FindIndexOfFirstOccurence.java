class String_FindIndexOfFirstOccurence {
    private static int[] findIndex(String haystack, String needle) {

        for (int i = 0; i <= haystack.length()-needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                
                return new int[]{i, i+needle.length()};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String haystack = "bttbutsadbut";
        String needle = "but";
        int[] index = findIndex(haystack, needle);
        System.out.println(index[0] + " " + index[1]); } }