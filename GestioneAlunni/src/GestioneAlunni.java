import java.util.Vector;
import java.util.*;

public class GestioneAlunni {
	private Vector alunni;
	Alunni a;
	
	Scanner in=new Scanner(System.in);
	
	public GestioneAlunni() {
		alunni=new Vector(1,1);
	}
	
	public void aggiungiAlunno(Alunni a) {
		alunni.addElement(a);
	}
	
	public void visualizza() {
		System.out.println("\nAlunni");
		for(int i=0;i<alunni.size();i++) {
			System.out.print("posizione " + i + " -> ");
			a=(Alunni) alunni.elementAt(i);
			System.out.println(a.toString());
		}
	}
	
	public void elimina(int i) {
		try
		{
			String surname;
			System.out.println("inserisci il cognome del'alunno da cancellare: ");
			surname=in.nextLine();
			for(i=0;i<alunni.size();i++) {
				if(((Alunni) alunni.get(i)).getCognome().equals(surname)) {
					alunni.removeElementAt(i);
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Eliminazione non riuscita! ");
			return;
		}
		
		System.out.println("Eliminazione riuscita! ");
	}
	
	public void ricera() {
		String surname;
		System.out.println("inserire cognome del'alunno da cancellare: ");
		surname=in.nextLine();
		for(int i=0;i<alunni.size();i++) {
			if(((Alunni) alunni.get(i)).getCognome().equals(surname)) {
				a=(Alunni) alunni.elementAt(i);
				System.out.println(a.toString());
			}
		}
		
	}

}