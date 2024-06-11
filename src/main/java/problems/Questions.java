package problems;

public class Questions<G> {
    /*
    For this code, return the greatest common denominator of the two parameters, x and y
    */
    public static int gcf(int x, int y){
        return 0;
    }

    /*
    Here, you should make a function that takes an array of strings and returns a similar array
    where each string is turned to just the first and last letter.
    EX: ["Hello", "World"] -> ["Ho", "Wd"]
    EX: ["To", "The", "End"] -> ["To", "Te", "Ed"]
     */
    public static String[] cut(String[] anArray){
        return new String[0];
    }

    public void replaceAtindex(G[] anArray, int index, G value){
        //This method should replace the value at index inside anArray with the value variable
        //EX: replaceAtindex([1,2,6,4], 2, 3) -> [1,2,3,4]
        anArray[index] = value;
    }

    public void replace(G[] anArray, G tobereplaced, G value){
        //This method should replace all instances of the first value with the second one
        //EX: replace([1,2,6,4], 6, 3) -> [1,2,3,4]
        for(int i = 0; i < anArray.length; i++){
            if (anArray[i].equals(tobereplaced)){
                anArray[i] = value;
            }
        }
    }

    public int longestArray( G[][] arrays){
        //Return the length of the longest array in the 2D array
        int max = 0;
        for (G[] ar : arrays){
            if (ar.length > max){
                max = ar.length;
            }
        }
        return max;
    }

    public boolean palindrome(String str){
        int end = str.length()-1;
        for (int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(end)){
                return false;
            }
        }
        return true;
    }
    public boolean palindrome(G[] array){
        int end = array.length-1;
        for (int i = 0; i < array.length/2; i++){
            if(!array[i].equals(array[end])){
                return false;
            }
        }
        return true;
    }

    public boolean contains(G[] array, G value){
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    public G[] intersection(G[] arrayOne, G[] arrayTwo){
        G[] answer = (G[])new Object[Math.max(arrayOne.length, arrayTwo.length)];
        return answer; // replace this line with the return array.
    }
}
