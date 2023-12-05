// 2nd largest number
public class javaProjectQ3 {

        public static void main(String[] args) {
            int[] numbers = {5, 10, 3, 8, 15, 7, 12, 1};
            int secondLargest = findSecondLargest(numbers);
            if (secondLargest != Integer.MIN_VALUE) {
                System.out.println("Second largest number: " + secondLargest);
            } else {
                System.out.println("Array does not have a second largest number.");
            }
        }

        private static int findSecondLargest(int[] arr) {
            if (arr.length < 2) {
                return Integer.MIN_VALUE;
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num < largest) {
                    secondLargest = num;
                }
            }

            return secondLargest;
        }
    }

