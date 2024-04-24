import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("1) Dolar == Peso Argentino");
        System.out.println("2) Peso Argentino == Dolar");
        System.out.println("3) Real Brasileño == Dolar");
        System.out.println("4) Dolar == Real Brasileño");
        System.out.println("5) Dolar == Peso Colombiano");
        System.out.println("6) Peso Colombiano == Dolar");
        System.out.println("7) Salir");
        System.out.println("************************************************");

        boolean continuar = true;
        while (continuar) {
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad en dólares:");
                    double cantidad1 = scanner.nextDouble();
                    double resultado1 = converter.convert(cantidad1, "dolar", "peso_argentino");
                    System.out.println("El resultado de la conversión es: " + resultado1 + " pesos argentinos");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en pesos argentinos:");
                    double cantidad2 = scanner.nextDouble();
                    double resultado2 = converter.convert(cantidad2, "peso_argentino", "dolar");
                    System.out.println("El resultado de la conversión es: " + resultado2 + " dólares");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad en reales brasileños:");
                    double cantidad3 = scanner.nextDouble();
                    double resultado3 = converter.convert(cantidad3, "real_brasileno", "dolar");
                    System.out.println("El resultado de la conversión es: " + resultado3 + " dólares");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad en dólares:");
                    double cantidad4 = scanner.nextDouble();
                    double resultado4 = converter.convert(cantidad4, "dolar", "real_brasileno");
                    System.out.println("El resultado de la conversión es: " + resultado4 + " reales brasileños");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad en dólares:");
                    double cantidad5 = scanner.nextDouble();
                    double resultado5 = converter.convert(cantidad5, "dolar", "peso_colombiano");
                    System.out.println("El resultado de la conversión es: " + resultado5 + " pesos colombianos");
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad en pesos colombianos:");
                    double cantidad6 = scanner.nextDouble();
                    double resultado6 = converter.convert(cantidad6, "peso_colombiano", "dolar");
                    System.out.println("El resultado de la conversión es: " + resultado6 + " dólares");
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Por favor, elija una opción válida.");
                    break;
            }
        }
    }
}

