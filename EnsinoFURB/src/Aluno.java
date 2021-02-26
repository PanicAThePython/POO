import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Aluno implements Comparable<Aluno>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1819077595608677234L;
	protected String nome;
	protected LocalDate dataNasc;

	
	public Aluno(String nome, LocalDate data) {
		this.setNome(nome);
		this.setDataNasc(data);
		
		File file = new File("./arq.ser");
		
		if (file.isFile()) {
			ArrayList<String> restoredObjects = this.readBinArquive();
			
			
			for (Object obj : restoredObjects) {
				System.out.println("Restored " + obj.toString());
			}
			
			
			System.out.println("Serialization file found");
		}
		else {
			this.recordBinArquive(this);
			System.out.println("Serialization file not found.");
		}
		
	}
	public static void record(Object aluno) {
		try {
			ObjectOutputStream ooos = new ObjectOutputStream(new FileOutputStream("arq.ser"));
			ooos.writeObject(aluno);
			System.out.println("Salvei obj");
			ooos.close();
		}catch(FileNotFoundException z) {
			z.printStackTrace();
		}catch(IOException z) {
			z.printStackTrace();
		}
	}
	public static Object read() {
		Object aluno = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arq.ser"));
			aluno = (Object) ois.readObject();
			ois.close();
		}catch(FileNotFoundException z) {
			z.printStackTrace();
		}catch(IOException z) {
			z.printStackTrace();
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
		}
		return aluno;
	}
	
	public Object read01() {
		Object aluno = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arq.ser"));
			aluno = (Object) ois.readObject();
	        //if (arq.exists()) {
	        //   ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
	        //   list = (ArrayList<Aluno>)objInput.readObject();
	        //   objInput.close();
		}catch(FileNotFoundException z) {
			z.printStackTrace();
		}catch(IOException z) {
			z.printStackTrace();
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
		}
		return aluno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.isEmpty()) {
			throw new IllegalArgumentException("Nome vazio");
		}
		this.nome = nome;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		if(dataNasc.toString().isEmpty()) {
			throw new IllegalArgumentException("Data vazia");
		}
		this.dataNasc = dataNasc;
	}
	
	public int getIdade() {
		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		
		//Period p = Period.between(dataNascimento, LocalDate.now());
		//return p.getYears();
		
		return anoAtual - dataNasc.getYear();
	}
	
	// Destrutor
		protected void finalize() throws Throwable {
			//System.out.println("Passando pelo destrutor de ALUNO:"+this.nome);
			this.record(this);
			this.recordBinArquive(this);
			super.finalize();  // chama o destrutor da superclasse Object
		}
		
		public int compareTo(Aluno outro) {
			// int deve ser positivo caso esse objeto seja maior que o outro
			// int será zero se os dois objetos forem iguais
			// int deve ser negativo caso esse objeto seja menor que o outro
			return (this.nome.compareTo(outro.getNome()));
		}
	
	public abstract String mostrar();
	
	public static void recordBinArquive(ArrayList<Object> obj) {
		File arq = new File("arq.ser");
	      try {
	        arq.delete();
	        arq.createNewFile();

	        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
	        objOutput.writeObject(obj);
	        objOutput.close();

	      } catch(IOException erro) {
	          System.out.printf("Erro: %s", erro.getMessage());
	      }
	    }

	    @SuppressWarnings("unchecked")
		public static ArrayList<String> readBinArquive() {
	    	ArrayList<String> lista = new ArrayList();
	        try {
	          File arq = new File("arq.ser");
	          if (arq.exists()) {
	             ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
	             lista = (ArrayList<String>)objInput.readObject();
	             objInput.close();
	          }
	        } catch(IOException erro1) {
	            System.out.printf("Erro: %s", erro1.getMessage());
	        } catch(ClassNotFoundException erro2) {
	            System.out.printf("Erro: %s", erro2.getMessage());
	        }

	        return(lista);
	    }
	    
	    public static void recordBinArquive(Object obj) {
		      String nameArq = "arq.ser";
		      File arq = new File(nameArq);
		      try {
		        arq.delete();
		        arq.createNewFile();

		        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
		        System.out.println("Arquivo serializadoo em " + arq.getAbsolutePath());
		        objOutput.writeObject(obj);
		        System.out.println("Salvei obj this");
		        objOutput.close();

		      } catch(IOException error) {
		          System.out.printf("Error: %s", error.getMessage());
		      }
		    }

		    
}
