
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;


public class Reader {


    private File file;
    private Scanner scan;
    private List<String[]> list, translatedList;
    private String line;
    private String[] word, word2;

    /**
     * Metodo que lee e imprime el contenido del archivo
     * @param file_to_read 
     */
    public List<String[]> readFile(String file_to_read){
            list = new LinkedList<String[]>();
            file = new File(file_to_read);
            try {
                scan = new Scanner(file); 
                while(scan.hasNextLine()){
                    line = scan.nextLine();
                    word = line.split(" ");
                    list.add(word);
                }
            for(String[] a: list){
                System.out.println(Arrays.deepToString(a));
            }
            return list;
                
            } 
            catch (IOException e) {
                System.out.println("El archivo no existe");
                return null;
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
                word2 = line.split("");
                translatedList.add(word2);
                for(String i : word2){
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


