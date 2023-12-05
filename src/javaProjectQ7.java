//Even and odd sum
public class javaProjectQ7 {

        public static void main(String[] args) {
            int[][] numbers = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            int sumEven = 0;
            int sumOdd = 0;

            for (int[] row : numbers) {
                for (int number : row) {
                    if (number % 2 == 0) {
                        sumEven += number;
                    } else {
                        sumOdd += number;
                    }
                }
            }

            System.out.println("Sum of even numbers: " + sumEven);
            System.out.println("Sum of odd numbers: " + sumOdd);
        }
    }

