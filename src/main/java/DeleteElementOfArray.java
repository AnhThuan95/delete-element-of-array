import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 5;
        array[1] = 2;
        array[2] = 3;
        array[3] = 3;
        array[4] = 8;
        array[5] = 6;
        array[6] = 1;
        array[7] = 0;
        array[8] = 9;
        array[9] = 4;

        System.out.println("Show array: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();

        System.out.println("Enter element you want delete: ");
        int element = scanner.nextInt();
        int index = -1;

        do {
            for (int i = 0; i < array.length; i++) {
                if (element == array[i]) {
                    index = i;
                    break;
                }
                index = -1;
            }
            if (index != -1) {
                for (int i = index; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = 0;
            }
        } while (index != -1);

        System.out.println("Show array: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }
}
