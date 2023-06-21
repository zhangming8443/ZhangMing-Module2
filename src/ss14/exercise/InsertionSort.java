package ss14.exercise;

public class InsertionSort {
    static int[] list = {2, 3, 5, 6, 1, -2, 3, 14, 12};

    public static void insertionSort(int[] list) {
        int index;
        int temp;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            index = i;
            while (index > 0 && temp < list[index - 1]) {
                list[index] = list[index - 1];
                index--;
            }
            list[index] = temp;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}

