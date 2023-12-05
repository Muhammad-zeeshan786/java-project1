//2D Array even num
public class javaProjectQ10 {

        public static void main(String[] args) {
            int[][] numbers = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            System.out.println("Even numbers:");

            for (int[] row : numbers) {
                for (int number : row) {
                    if (number % 2 == 0) {
                        System.out.print(number + " ");
                    }
                }
            }
        }
    }


