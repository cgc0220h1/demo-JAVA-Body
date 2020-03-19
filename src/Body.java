import java.util.Scanner;

public class Body {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();

        double height;
        System.out.println("Enter your height");
        height = scanner.nextDouble();

        double bmi;
        bmi = weight / Math.pow(height, 2);
        System.out.printf("Your bmi is %f \n \n", bmi);

        String result;
        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 25) {
            result = "Normal";
        } else if (bmi < 30) {
            result = "Overweight";
        } else {
            result = "Obese";
        }

        System.out.printf("You are: %s \n", result);
    }
}
