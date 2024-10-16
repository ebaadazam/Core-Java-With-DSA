// LENGTH OF THE LAST WORD IN A GIVEN STRING
class String_LengthOfLastWord {
    public static int lastWordLength(String str){
        int count=0;
        for(int i = str.length()-1; i > 0; i--){

            if (str.charAt(i) != ' ') {
                count++;
            }

            else if(str.charAt(i) == ' ' && count != 0){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "  Hello   world    ";
        System.out.println(lastWordLength(str));
    }
}