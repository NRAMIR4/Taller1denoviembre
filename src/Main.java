import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String ruta = "C:\\\\Fundamentos de programacion\\\\Taller1denoviembre\\\\";
        String nombreArchivo = "prueba.txt";
        try (FileReader fr = new FileReader(ruta + nombreArchivo)) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        String ruta1 = "C:\\\\Fundamentos de programacion\\\\Taller1denoviembre\\\\";
        try (
                FileWriter fw = new FileWriter(ruta1 + "prueba.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {

            String[] datos = ruta.split(",");
            int[] numeros = new int[datos.length];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Integer.parseInt(datos[i]);
            }
            int suma = 0;
            int valormenor = numeros[0];
            int valormayor = numeros[0];
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
                if (numeros[i] < valormenor) {
                    valormenor = numeros[i];
                }
                if (numeros[i] > valormayor) {
                    valormayor = numeros[i];
                }
            }
            int promedio = suma / numeros.length;

            bw.write("PROMEDIO ES: " + promedio);
            bw.newLine();
            bw.write("NUMERO MAYOR ES:  " + valormayor);
            bw.newLine();
            bw.write("NUMERO MENOR ES:  " + valormenor);
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo :  " + e.getMessage());
        }
    }
}



