/**
 * @author Luis Montenegro
 * @version 1.1
 * @since 22/03/2022
 */

public class Control{
  public static void main(String[] args){
    boolean finished  = false, exists;
    View view;
    BinarySearchTree tree; 
    Association association;
    ToMap toMap = new ToMap();
    Reader reader = new Reader();
    int option;
    String key, file_dictionary, file_to_read, original, translated;
    
    while(!finished){
      view = new View();
      view.menu("welcome");
      option = view.input();
      switch(option){
        case 1:
        view.menu("file_dictionary");
        file_dictionary = view.stringInput();
        view.menu("key");
        key = view.stringInput();

        if(file_dictionary.toLowerCase().equals("exit")){
          System.exit(0);
        }
        exists = reader.fileExists(file_dictionary);
        if(exists == true){
          toMap.toMap(reader.readFile(file_dictionary), key);
          finished = true;
        }
        else{
          finished = false;
        }
        break;

        case 2:
        view.exit();
        System.exit(0);
        break;
        default:
        finished = false;
        break;
      }
    }

    finished = false;

    while(!finished){
      view = new View();
      view.menu("file_to_read");
      file_to_read = view.stringInput();
      exists = reader.fileExists(file_to_read);

      if(file_to_read.toLowerCase().equals("exit")){
        System.exit(0);
      }

      if(exists == true){
        reader.readFile(file_to_read);
        //reader.readText(file_to_read);
        finished = true;
      }
      else{
        finished = false;
      }
    }

    finished = false;

    while(!finished){
      view = new View();
      view.menu("original");
      original = view.stringInput().toLowerCase();
      //elegir el tipo de lenguaje original que ingresará
      if(original.equals("english")||original.equals("spanish")||original.equals("french")){

      }
      else{
        view.errorInput();
        finished = false;
      }
      view.menu("translated");
      translated = view.stringInput().toLowerCase();
      //elegir el tipo de lenguaje al que se va a traducir
      if(translated.equals("english")||translated.equals("spanish")||translated.equals("french")){

      }
      else{
        view.errorInput();
        finished = false;
      }
      view.exit();
      System.exit(0);
    }
  }
}
