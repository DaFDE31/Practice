package problems;

public class Questions<G> {
    /*
    TODO For this code, return the greatest common factor of the two parameters, x and y
     So gcf(20,30) returns 10 and gcf(10,5) returns 5
    */
    public static int gcf(int x, int y){
        if (x==y){
            return x;
        }
        int factor = Math.min(x,y);
        while (factor > 1){
            if (x % factor == 0 && y % factor == 0){
                return factor;
            }
            factor--;
        }
        return 1;
    }

    /*
    TODO
     Here, you should make a function that takes an array of strings and returns a similar array
     where each string is turned to just the first and last letter.
     EX: ["Hello", "World"] -> ["Ho", "Wd"]
     EX: ["To", "The", "End"] -> ["To", "Te", "Ed"]
     */
    public static void cut(String[] anArray){
        for (int i = 0; i < anArray.length; i++){
            anArray[i] = ""+ anArray[i].charAt(0) + anArray[i].charAt(anArray[i].length()-1);
        }
    }

    public void replaceAtindex(G[] anArray, int index, G value){
        //TODO This method should replace the value at index inside anArray with the value variable
        // EX: replaceAtindex([1,2,6,4], 2, 3) -> [1,2,3,4]. 6 was at index 2 so it was replaced with 3.
        anArray[index] = value;
    }

    public void replace(G[] anArray, G tobereplaced, G value){
        //TODO This method should replace all instances of the first value with the second one
        // EX: replace([1,2,6,4], 6, 3) -> [1,2,3,4]. This replaced the first 6 it found with 3.
        for(int i = 0; i < anArray.length; i++){
            if (anArray[i].equals(tobereplaced)){
                anArray[i] = value;
            }
        }
    }

    public int max(int[] arrays){
        //TODO Return the biggest number in the array.
        int max = 0;
        for (int ar : arrays){
            if (ar > max){
                max = ar;
            }
        }
        return max;
    }

    //TODO For this method, return true if the string is a palindrome, as in if it is spelled the same backwards
    // EX: palindrome("racecar") returns true
    public boolean palindrome(String str){
        int end = str.length()-1;
        for (int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(end)){
                return false;
            }
            end--;
        }
        return true;
    }

    //TODO This is the same as the previous method but with an array of ints
    // EX: palindrome([1, 2, 3, 2, 1]) returns true
    // EX: palindrome([1, 2, 3, 2, 1, 6]) returns false
    public boolean palindrome(int[] array){
        int end = array.length-1;
        for (int i = 0; i < array.length/2; i++){
            if(!(array[i] == array[end])){
                return false;
            }
            end--;
        }
        return true;
    }

    //TODO, This method should return true if value is inside of the array, false otherwise.
    // EX: [1, 2, 3] , 2 would return true.
    public boolean contains(int[] array, int value){
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }
}
