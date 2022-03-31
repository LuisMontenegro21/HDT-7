
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;


public class Reader {


    private File file;
    private Scanner scan;
    private List<String> list;
    private String line;
    private String[] word;

    /**
     * Metodo que lee e imprime el contenido del archivo
     * @param file_to_read 
     */
    public void readFile(String file_to_read){
            list = new LinkedList<String>();
            file = new File(file_to_read);
            try {
                scan = new Scanner(file); 
                while(scan.hasNextLine()){
                    line = scan.nextLine();
                    list.add(line);
                    System.out.println(line);
                    //TODO que devuelva los datos para asociarlos 
                }
                for(String i : list){
                    System.out.println(i);
                }
                
            } catch (IOException e) {
                System.out.println("El archivo no existe");
            }
         
    }

    /**
     * Metodo que lee el texto ingresado 
     * @param text
     */
    public void readText(String text){
        try {
            scan = new Scanner(new File(text));
            while(scan.hasNextLine()){
                line = scan.nextLine();
                word = line.split("");
                for(String i : word){
                    System.out.println("*"+i+"*");
                }
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


