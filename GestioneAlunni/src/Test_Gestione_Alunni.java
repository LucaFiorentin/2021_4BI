import java.util.*;
public class Test_Gestione_Alunni {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		GestioneAlunni gestione=new GestioneAlunni();
		
		int scelta;
		boolean uscita=false;
		do {
			System.out.println("\nMENU' DELLA SCUOLA \n"
						+ "1) INSERIMENTO  \n"
						+ "2) CANCELLAZIONE \n"
						+ "3) VISUALIZZA \n"
						+ "4) RICERCA\n"
						+ "0) ESCI \n"
						+ "la tua scelta => ");
			scelta=in.nextInt();
			switch(scelta) {
			case 0:uscita=true; break;
			
			case 1:
				Alunni al=new Alunni();
				gestione.aggiungiAlunno(al);
				break;
				
			case 2:
				int indice =0;
				gestione.elimina(indice);
				break;
				
			case 3:
				gestione.visualizza();
				break;
				
			case 4:
				gestione.ricera();
				break;
			}
		}while(!uscita);

	}

}
