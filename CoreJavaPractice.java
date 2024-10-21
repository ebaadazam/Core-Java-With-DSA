// FIND THE BIGGEST VERSION
class CoreJavaPractice {

    public static String biggerString(String str) {
        String[] versions = str.split(" ");
        String version1 = versions[0];
        String version2 = versions[1];

        // Compare the two versions using the compareVersions method
        int result = compareVersions(version1, version2);

        // Return the bigger version
        return result > 0 ? version1 : version2;
    }

    // Method to compare two versions
    public static int compareVersions(String version1, String version2) {
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");

        int length = Math.max(levels1.length, levels2.length);

        for (int i = 0; i < length; i++) {
            int v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
            int v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
            if (v1 < v2) {
                return -1;
            }
            if (v1 > v2) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String str = "12.23.4 12.1.1";
        String res = biggerString(str);
        System.out.println(res);  // Output: 12.1.1
    }
}




