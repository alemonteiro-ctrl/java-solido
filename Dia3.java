import java.util.Scanner;

public class Dia3 {
    
   public static double calcularArea(double base, double altura) {
        return (base * altura) / 2; 
   }

   public static double calcularArea(double lado) {
        return lado * lado; 
   }

   static void descreveResultado(String forma, double area) {
        System.out.printf("A area do %s e: %.2f\n", forma, area);
   }

   public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite a base do triangulo: ");
    double base = sc.nextDouble();
    System.out.print("Digite a altura do triangulo: ");
    double altura = sc.nextDouble();
    double areaTriangulo = calcularArea(base, altura);
    descreveResultado("triangulo", areaTriangulo);

    System.out.print("Digite o lado do quadrado: ");
    double lado = sc.nextDouble();
    double areaQuadrado = calcularArea(lado);
    descreveResultado("quadrado", areaQuadrado);

    sc.close();
    }
}
