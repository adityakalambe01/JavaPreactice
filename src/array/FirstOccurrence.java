package array;



public class FirstOccurrence {
    public static void findFirstOccurrence(String inputString){
        int[] alphaCharArray = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            alphaCharArray[character-'a']++;
        }
        for (char character : inputString.toCharArray()){
            if(alphaCharArray[character-'a']==1){
                System.out.println(character);
                break;
            }
        }

    }
    public static void main(String[] args) {
        String myString = "aaabbccddaeffggrrttyyuuz";
        findFirstOccurrence(myString.toLowerCase());

    }
}
