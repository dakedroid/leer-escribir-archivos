import javax.swing.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.StringTokenizer;

public class Archivo02 {

    public static void main(String[] args) throws IOException {
        //  leerArchivo();
        leer();
        //escribirArchivo();
    }

    static void leer() throws IOException {
        List<String> words = Files.readAllLines(new File(System.getProperty("user.home") + "/Desktop/documento2.txt").toPath(), Charset.defaultCharset());

        for (int i = 0; i < words.size() - 1; i++) {
            JOptionPane.showMessageDialog(null, words.get(i));
        }
    }

    static void leerArchivo() throws IOException {

        BufferedReader archivoDeEntrada = new BufferedReader(new FileReader(System.getProperty("user.home") + "/Desktop/documento2.txt"));
        StringTokenizer linea = new StringTokenizer(archivoDeEntrada.readLine());

        //linea.nextToken();
        linea.nextElement();
        while (linea.hasMoreTokens()) {
            JOptionPane.showMessageDialog(null, linea.nextToken());
            //linea.nextToken();
        }

        archivoDeEntrada.close();
    }


    static void escribirArchivo() throws IOException {
        PrintWriter archivoDeSalida = new PrintWriter(new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/Desktop/documento2.txt")));
        archivoDeSalida.println("Bienvenido a mi archivo");
        archivoDeSalida.println("---------");
        archivoDeSalida.println("---------");
        for (int i = 0; i < 100; i++) {
            archivoDeSalida.println(i);
        }
        archivoDeSalida.close();
    }
}
