package day1.examples;

/**
 * Created by Rullendemuffins on 11-Jan-17.
 */
public class ExampleAndOr {
    public static void main(String[] args){

        int x, y;
        x = 10;
        y = -10;

        if(x > 0 && y > 0){
            System.out.println("Both numbers are positive");
        }else if(x > 0 || y > 0){
            System.out.println("One of the numbers are positive");
        }else{
            System.out.println("Both of the numbers are negative");
        }

    }
}
