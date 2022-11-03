package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(8);
        list.add(7);
        list.add(36);
        list.add(5);
        list.add(26);

        System.out.println(list);

        int arr[] = new int[3];
        arr[0]=5;
        arr[1]=15;
        arr[2]=25;

        System.err.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);

        }
        System.err.println(list);



    }
}
