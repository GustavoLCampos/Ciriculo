import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");

        double r = sc.nextDouble();

        double area;

        area = 3.14 * r * r;

        System.out.println("A área é:  " + area);


    }


}
