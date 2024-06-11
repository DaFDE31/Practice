package problems;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] one = {1,2,3,4,5};
        int[] two = new int[one.length+5];
        System.arraycopy(one, 0, two, 0, one.length);
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        one = two;
        System.out.println(Arrays.toString(one));

    }
}
