import java.io.*;
import java.sql.Array;

public class Archivo {

    public static void main(String[] args) throws IOException {

        FileOutputStream cadena1 = null;
        FileInputStream cadena2 = null;

        int opcion = 0, m = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bytes;
        byte[] array1 = new byte[1000];
        byte[] array2 = new byte[1000];


        do {
            System.out.println("Menu\n1Crear un archivo\n2Leer Archivo");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1: {
                    System.out.println("Introduzca los datos de l nuevo archivo");
                    bytes = System.in.read(array1);
                    cadena1 = new FileOutputStream("archivo.txt");
                    cadena1.write(array1, 0, bytes);
                    break;
                }
                case 2: {
                    cadena2 = new FileInputStream("archivo.txt");
                    bytes = cadena2.read(array2, 0, 1000);
                    String cadena3 = new String(array2, 0 , bytes);
                    System.out.println(cadena3);
                    break;
                }
            }

            System.out.println("Presione 1) si desea continuar\nO cualquier otro para finalizar");
            m = Integer.parseInt(br.readLine());
        } while (m == 2);

    }
}
