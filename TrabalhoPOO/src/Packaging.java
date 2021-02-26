import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Packaging {
	
    public static void recordBinArquive(ArrayList<Object> list) {
    	String nameArq = "arq";
      File arq = new File(nameArq);
      try {
        arq.delete();
        arq.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
        objOutput.writeObject(list);
        objOutput.close();

      } catch(IOException error) {
          System.out.printf("Error: %s", error.getMessage());
      }
    }

    public static ArrayList<Object> readBinArquive() {
    	String nameArq = "arq";
      ArrayList<Object> list = new ArrayList<>();
      try {
        File arq = new File(nameArq);
        if (arq.exists()) {
           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
           list = (ArrayList<Object>)objInput.readObject();
           objInput.close();
        }
      } catch(IOException error1) {
          System.out.printf("Erro: %s", error1.getMessage());
      } catch(ClassNotFoundException error2) {
          System.out.printf("Erro: %s", error2.getMessage());
      }

      return(list);
    }
}
