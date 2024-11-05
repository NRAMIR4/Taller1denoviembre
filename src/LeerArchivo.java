//1.Leer un archivo, identificar si la ruta es correcta.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class LeerArchivo {
    public static void main(String[] args) {
        String ruta = "C:\\\\Fundamentos de programacion\\\\Taller1denoviembre\\\\";;
        String nombreArchivo = "prueba.txt";
        try(FileReader fr= new FileReader( ruta+nombreArchivo)){
            BufferedReader  br =new BufferedReader(fr);
            String linea;
            while((linea = br.readLine())!= null){
                System.out.println (linea);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
