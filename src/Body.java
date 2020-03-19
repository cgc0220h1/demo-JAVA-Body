import java.util.Scanner;

public class Body {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        System.out.println("Enter your weight (in kilogram):");
        weight = scanner.nextDouble();

        double height;
        System.out.println("Enter your height (in meter):");
        height = scanner.nextDouble();

        double bmi;
        bmi = weight / Math.pow(height, 2);
        System.out.printf("Your bmi is %3.2f \n \n", bmi);

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

        System.out.printf("%-4.2f %s", bmi, "is evaluated as " + result);
    }
}
