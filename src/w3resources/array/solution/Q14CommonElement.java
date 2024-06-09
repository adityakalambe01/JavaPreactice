package w3resources.array.solution;

import java.util.Arrays;

public class Q14CommonElement {
    static String[] removeDuplicates(String[] myArray){
        Arrays.sort(myArray);

        String[] result = new String[myArray.length];

        int index = 0;

        for (int i = 0; i < myArray.length-1; i++) {
            if (!myArray[i].equals(myArray[i+1])){
                result[index++] = myArray[i];
            }
        }

        result[index++] = myArray[myArray.length-1];

        myArray = Arrays.copyOf(result, index);

        return myArray;
    }

    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL","C#","C#"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA","C#","C#"};

        System.out.println("Original Arrays");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array1 = removeDuplicates(array1);
        array2 = removeDuplicates(array2);



        System.out.println("Common Element");
        for (String s: array1){
            for (String s1 : array2){
                if (s.equals(s1))
                    System.out.println(s1);
            }
        }
    }
}
