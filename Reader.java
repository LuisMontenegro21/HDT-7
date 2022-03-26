
import java.io.IOException;
import java.io.File;
import java.util.Scanner;


public class Reader {


    private File file;
    private Scanner scan;

    /**
     * Archivo que lee e imprime el contenido del archivo
     * @param file_to_read 
     */
    public void readFile(String file_to_read){
        
            file = new File(file_to_read);
            try {
                scan = new Scanner(file); 
                while(scan.hasNextLine()){
                    System.out.println(scan.nextLine());
                    //TODO que devuelva los datos para asociarlos 
                }
            } catch (IOException e) {
                System.out.println("El archivo no existe");
            }
         
    }


    /**
     * Es para verificar si existe o no el archivo ingresado
     * @param files
     * @return boolean
     */
    public boolean fileExists(String file){
        return new File(file).isFile();
    }

    
}


