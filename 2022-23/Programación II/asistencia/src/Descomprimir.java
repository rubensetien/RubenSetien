import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipInputStream;

public class Descomprimir {

    public String archivo;
    public String contraseña;

    public Descomprimir(String archivo, String contraseña) {
        this.archivo = archivo;
        this.contraseña = contraseña;
    }

   public void descomprirArchivo(){
       try {
           FileInputStream fis = new FileInputStream(archivo);
           ZipInputStream zis;

           zis = new ZipArchive(fis);
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }catch ( IOException e){

       }



   }
}
