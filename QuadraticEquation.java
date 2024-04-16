import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation;

        do {
            System.out.println("Nhap a, b va c cua phuong trinh bac hai:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem la: " + root1 + " va " + root2);
            } else if (delta == 0) {
                double root = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep la: " + root);
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }

            System.out.println("Ban co muon tiep tuc tinh toan? Nhap 'yes' để tiếp tục, 'no' để dừng.");
            continueCalculation = scanner.next();

        } while (continueCalculation.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
