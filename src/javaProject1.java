// Temperature check
import java.util.Scanner;

public class javaProject1 {


        public static void main(String[] args) {
            int daysInWeek = 7;
            double[] temperatures = new double[daysInWeek];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < daysInWeek; i++) {
                System.out.print("Enter temperature for day " + (i + 1) + ": ");
                temperatures[i] = input.nextDouble();
            }
            double highestTemperature = temperatures[0];
            double lowestTemperature = temperatures[0];

            for (int i = 1; i < daysInWeek; i++) {
                if (temperatures[i] > highestTemperature) {
                    highestTemperature = temperatures[i];
                }

                if (temperatures[i] < lowestTemperature) {
                    lowestTemperature = temperatures[i];
                }
            }
            System.out.println("Highest temperature for the week: " + highestTemperature);
            System.out.println("Lowest temperature for the week: " + lowestTemperature);


        }

    }

