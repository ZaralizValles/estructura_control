public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        esPositivo(-3);
        numeroWhile(5);
        numeroDoWhile(1);
        numeroFor();
        estacion("verano");
    }

    static void esPositivo(int numeroIf) {

        if (numeroIf > 0) {
            System.out.println("Es positivo");

        } else if (numeroIf < 0) {
            System.out.println("Es negativo");

        } else {
            System.out.println("Es cero");
        }
    }

    static void numeroWhile(int numeroWhile) {

        while (numeroWhile < 3) {

            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }
    }

    static void numeroDoWhile(int numeroDoWhile) {

        do {

            numeroDoWhile = numeroDoWhile + 1;
            System.out.println(numeroDoWhile);
            break;

        } while (numeroDoWhile < 3);
    }

    static void numeroFor() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    static void estacion(String estacion) {

        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en " + estacion);
                break;

            case "verano":
                System.out.println("Estamos en " + estacion);
                break;

            case "invierno":
                System.out.println("Estamos en " + estacion);
                break;

            case "otoño":
                System.out.println("Estamos en " + estacion);
                break;

            default:
                System.out.println("Estaci{on equivocada");
                break;
        }
    }

}
