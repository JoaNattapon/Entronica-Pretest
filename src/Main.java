import java.util.*;

public class Main {

    // Question 1 Find intersection Integer
    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++) {

            for(int k = 0; k < arr2.length; k++) {

                if(arr1[i] == arr2[k]) {

                    result.add(arr1[i]);
                }
            }
        }

        return result;
    }

    // Question 2 Sort an array on integer
    public static int[] sortArr(int[] arr) {

        // { 5, 7, 1, 2, 13 }

        for(int i = 0; i < arr.length - 1; i++) {

            for(int k = 0; k < arr.length - i - 1; k++) {

                if(arr[k] > arr[k + 1]) {

                    int tmp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = tmp;
                }
            }
        }
        return arr;
    }

    // Question 3 Find a pair of an int array that can sum up to target nums.
    public static List<int[]> pairSum(int[] arr, int val) {

        Set<List<Integer>> result = new HashSet<>();
        //List<int[]> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {

            for(int k = i; k < arr.length; k++) {

                if(arr[i] + arr[k] == val) {

                    List<Integer> pair = Arrays.asList(arr[i], arr[k]);
                    result.add(pair);
                    //result.add(new int[]{arr[i], arr[k]});
                }
            }
        }

        List<int[]> finalResult = new ArrayList<>();

        for(List<Integer> el : result) {

            int[] pairValue = el.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();

            finalResult.add(pairValue);
        }


        return finalResult;
    }

    public static void main(String[] args) {


    }
}