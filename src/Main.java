import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static  char minValue = 25;
    static  char maxValue = 75;
    static Random rand = new Random();

    static char getRandomeValue(){

        return (char) (minValue + rand.nextInt(maxValue - minValue));
    }

    static void printArray(char[] arr){
        int i = 0;
        for (char var: arr) {
            System.out.println(i + " :: " + arr[i] + "::" + (int) arr[i]);
            i++;
        }
    }
    public static void  main(String[] args) {
        int arrayLength = 48;

        System.out.println("*** Bubble Sorting ***");

        char[] arrayToSort;
        arrayToSort = new char[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arrayToSort[i] = getRandomeValue();
        }
        System.out.println("*** Before Sorting ***");
        printArray(arrayToSort);

        for (int i = 1; i < arrayToSort.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    var tmp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = tmp;

                }
            }
        }
        System.out.println("*** After Sorting ***");
        printArray(arrayToSort);
    }
}