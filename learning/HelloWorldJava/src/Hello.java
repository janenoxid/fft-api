import java.util.Scanner;

public class Hello {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

        System.out.println("Hello, Desiree");

        String[] questions = {"What do you want to do? ", "What are you doing? "};

        printArray(questions);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i< array.length; i++ ) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
