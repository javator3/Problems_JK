package pl.sda.problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P01 {

    public static String last(List<String> list) {
        return list.get(list.size() - 1);
    }

    public static List<Integer> reverse(List<Integer> number) {

        List<Integer> reversed = new ArrayList<>(number);

        Collections.reverse(reversed);

        return reversed;
    }

    public static boolean isPalindromeWord(String originalWord) {

        String reversed = new StringBuffer(originalWord).reverse().toString();

        if (originalWord.equals(reversed)) {
            return true;

        } else {

            return false;
        }
    }

//    public static boolean isPalindrome(List<String> original){
//
//        List<String> reversed = new ArrayList<>(original);
//
//        Collections.reverse(reversed);
//
//        if (original.equals(reversed)){
//            return true;
//
//        }else {
//
//            return false;
//        }
//    }

    public static boolean isPalindrome(List<Integer> original) {

        List<Integer> reversed = new ArrayList<>(original);

        Collections.reverse(reversed);

        if (original.equals(reversed)) {
            return true;

        } else {

            return false;
        }
    }


    public static List<String> dropEveryNth(List<String> originalList, int j) {
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < originalList.size(); i++) {
            if ((i + 1) % j != 0) {
                newList.add(originalList.get(i));
            }
        }

        return newList;
    }

    public static Map<Boolean, List<String>> split(List<String> originalList, int j) {

        Map<Boolean, List<String>> map = new HashMap<>();

        List<String> firstHalf = new ArrayList<>();
        List<String> secondHalf = new ArrayList<>();

        for (int i = 0; i < originalList.size(); i++) {
            if (i < j) {
                firstHalf.add(originalList.get(i));
            } else {
                secondHalf.add(originalList.get(i));
            }
        }

        map.put(true, firstHalf);
        map.put(false, secondHalf);

        return map;
    }

    public static List<String> slice(List<String> originalList, int j, int k) {
        List<String> slicedList = new ArrayList<>();

        for (int i = 0; i < originalList.size(); i++) {
            if (i > (j-2) && i < (k)) {
                slicedList.add(originalList.get(i));
            }
        }

        return slicedList;
    }

    public static List<String> insertAt(List<String> input, int i, String alfa) {
        List<String> output = new ArrayList<>(input);

            output.add(i, alfa);

        return output;
    }

    public static List<String> flatten(List<Object> asList, Class<String> stringClass) {
        List<String> flatten = new ArrayList<>();

        for (Object e: asList) {
            if ()
        }
        //instanceOf

        return flatten;
    }
}
