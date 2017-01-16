package day1.examples;

/**
 * Created by Rullendemuffins on 11-Jan-17.
 */
public class ExampleSwitch {
    public static void main(String[] args){

        int j = 2; //Can also use strings in switch cases

        switch(j){

            case 0:
                System.out.println("Value is 0");
                break;
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            default:
                System.out.println("No value");
                break;
        }

    }
}
