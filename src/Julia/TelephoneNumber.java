package Julia;

import java.util.ArrayList;
import java.util.Random;

public class TelephoneNumber {

    /*
    create a random telephone number
    1. 8 plus any of this:  123, 345, 444, 564, 643, 472, 675, 553, 889, 555 plus 7 random numbers
    2. 8 plus any of this: 1423, 3456, 4144, 9564, 4643, 2345, 2355, 7896, 1255, 0098 plus 6 random numbers
        */

    public static void main(String[] args) {

        System.out.println(createTelephoneNumber());
    }

    public static String createTelephoneNumber(){

        Random rnd = new Random();
        int numberLength = 0;

        String [] arr1 = {"123", "345", "444", "564", "643", "472", "675", "553", "889", "555"};
        String [] arr2 = {"1423", "3456", "4144", "9564", "4643", "2345", "2355", "7896", "1255", "0098"};
        String [][] array = {arr1, arr2};

        String result = 8 + "-" + array[rnd.nextInt(array.length)][rnd.nextInt(arr1.length)] + "-";
        numberLength = 11 + 2 - result.length();


        for(int i = 0; i < numberLength; i++){
            result += rnd.nextInt(10);
        }

        return result;
    }
}
