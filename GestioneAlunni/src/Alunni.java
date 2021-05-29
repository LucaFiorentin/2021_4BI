import java.util.*;
public class Alunni {
	

	private String nome;
	private String cognome;
	private String classe;
	
	public Alunni() {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Nome alunno: ");
		nome=in.nextLine();
		System.out.println("Cognome alunno: ");
		cognome=in.nextLine();
		System.out.println("Classe alunno: ");
		classe=in.nextLine();
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public String toString() {
		return "Alunno [nome=" + nome + ", cognome=" + cognome + ", classe=" + classe + "]";
	}


}