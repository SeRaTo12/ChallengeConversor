import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner entrada = new Scanner(System.in);
        int opc=0;
        int cantidad = 0;
        String url_str;
        while(opc != 7){
            url_str = "https://v6.exchangerate-api.com/v6/b8098c934cbd5fbc87f490ff/pair/";
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Te presento las conversiones disponibles al momento: ");
            System.out.println("""
                1) Dólar -> Peso Mexicano
                2) Peso Mexicano -> Dólar
                3) Dólar -> Real Brasileño
                4) Real Brasileño -> Dólar
                5) Dólar -> Euro
                6) Euro -> Dólar
                7) Salir""");
            /*
            Dólar: USD
            Peso Mexicano: MXN
            Real Brasileño: BRL
            Euro: EUR
            */
            System.out.print("Ingresa una opción: ");
            opc = entrada.nextInt();
            switch(opc){
                //Setting URL
                case 1:
                    System.out.print("Ingresa la cantidad de dolares: ");
                    cantidad = entrada.nextInt();
                    url_str += "USD/MXN/"+cantidad;
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad de pesos: ");
                    cantidad = entrada.nextInt();
                    url_str+="MXN/USD/"+cantidad;
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad de dolares: ");
                    cantidad = entrada.nextInt();
                    url_str+="USD/BRL/"+cantidad;
                    break;
                case 4:
                    System.out.print("Ingresa la cantidad de Reales Brasileños: ");
                    cantidad = entrada.nextInt();
                    url_str+="BRL/USD/"+cantidad;
                    break;
                case 5:
                    System.out.print("Ingresa la cantidad de dolares: ");
                    cantidad = entrada.nextInt();
                    url_str+="USD/EUR/"+cantidad;
                    break;
                case 6:
                    System.out.print("Ingresa la cantidad de euros: ");
                    cantidad = entrada.nextInt();
                    url_str+="EUR/USD/"+cantidad;
                    break;
            }
            Conversiones.solicitud(url_str, cantidad);
        }
    }
}