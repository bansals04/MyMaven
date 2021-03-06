package Test;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class IncedoTest {
/*
    int[] input={2,2,3,4,5,6,6}
    q1: write integer array with unique elements from input array
    int[] output={2,3,4,5,6}

    q2: Occurrence of each integer in input array
    {2:2},{3:1},{4:1},{5:1},{6:2}

    q3: Print last repeated character from input
    out:6

*/
int[] input={2,2,8,4,5,3,6,7,3,8};

    @Test
    public void intarray(){


        System.out.println(Arrays.toString(input));
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] redundantArray = new int[input.length];
        int[] outputArray;
        int val=0;

        for (int i=0; i<= input.length-1; i++){
            if(hashMap.containsKey(input[i])){
                System.out.println("key already exists at position number: "+i + ". Value is " + input[i]);
                redundantArray[val++] = input[i];
            }
            else {
                hashMap.put(input[i], i);
            }
        }
        System.out.println(Arrays.toString(redundantArray) + " This is redundant array");
        System.out.println();
        int dd = duplicacyRemoved();
        System.out.println(dd+ " : Length of array");
        for(int h=0; h<dd; h++){
            System.out.println(input[h] + " Hello");
        }
    }

    public int duplicacyRemoved(){
        //input={2,2,3,4,5,6,6};
        int len = input.length;

        int b=0;

        for(int j =0; j<len-1; j++){

            if(input[j] != input[j+1]){

                input[b++] = input[j];

                System.out.println(Arrays.toString(input));
            }
        }
        input[b++] = input[len-1];
        return b;
    }
}
