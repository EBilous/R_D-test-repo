package src.lections;

// Зреверсуйте масив без використання додаткового масиву.

public class reverseArray {

        public static void reverse(int arr[], int len) {
            int index, k, t;
            for (index = 0; index < len / 2; index++) {
                t = arr[index];
                arr[index] = arr[len - index - 1];
                arr[len - index - 1] = t;
            }

            // printing the reversed array
            System.out.println("Reversed array: \n");
            for (k = 0; k < len; k++) {
                System.out.println(arr[k]);
            }
        }
        public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 5 };
            reverse(arr, arr.length);
        }
    }
