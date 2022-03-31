/**
 * @author Luis Montenegro
 * @version 1.1
 * @since 22/03/2022
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class View{

  private Scanner scan;

  public View(){
    scan = new Scanner(System.in);
  }

  public int input(){
    try {
      return scan.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Ingrese una opción permitida");
      return 0;
    }
  }

  public String stringInput(){
    return scan.next();
  }

  public void menu(String command){
    if(command == "file_dictionary"){
      System.out.println("Ingrese el directorio (path) del diccionario: ");
    }
    
    else if(command == "file_to_read"){
      System.out.println("Ingrese el directorio (path) del archivo a traducir: ");
    }

    else if(command == "original"){
      System.out.println("Seleccione el idioma que desea seleccionar: " + "1 inglés \n2 español \n3 francés");
    }
    
    else if(command == "translated"){
      System.out.println("Seleccione el idioma al que desea traducir: " + "1 inglés \n2 español \n3 francés");
    }

    else if(command == "welcome"){
      System.out.println("Bienvenido: \n" + "¿Qué desea hacer? \n" + "1 ingresar diccionario\n2 salir");
    }

    else if(command == "continue"){
      System.out.println("¿Desea continuar? \ny/n");
    }

  }
  public void exit(){
    System.out.println("Gracias por usar el traductor");
  }

}
