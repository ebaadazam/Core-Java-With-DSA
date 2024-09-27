// LENGTH OF THE LAST WORD IN A GIVEN STRING
class String_LengthOfLastWord {
    public static int lastWordLength(String str){
        int count=0;
        for(int i = str.length()-1; i > 0; i--){

            // Case when there is space after last word
            if (str.charAt(i) == ' ' && count == 0) {
                continue;
            }

            else if(str.charAt(i) == ' ' && count != 0){
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(lastWordLength(str));
    }
}