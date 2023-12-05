// Max and min number
public class javaProjectQ5 {

        public static void main(String[] args) {
            int[] numbers = {5, 10, 3, 8, 15, 7, 12, 1};

            int max = findMax(numbers);
            int min = findMin(numbers);

            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        }

        private static int findMax(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        private static int findMin(int[] arr) {
            int min = arr[0];
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
    }

