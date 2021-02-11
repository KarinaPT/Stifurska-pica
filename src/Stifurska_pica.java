import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Stifurska_pica {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");
	static String vards, adrese, talruni,teksts, picasnosaukums, atb,lielums,izvele, maksasanasveids,pica;
	
	public static void Izveidot(int a, String nosaukums1) {
		
		}
	
	public static void Menu(String nosaukums2){
		
	}
	
	public static void main(String[] args) {
		String izvele,nosaukums1, nosaukums2;
		int klienti;
		do{
			
			izvele = JOptionPane.showInputDialog("'MENU' - veikt pasūtījumu no menu; 'ManaPica' - izveido savu picu");
			izvele = izvele.toUpperCase();
			
			if(izvele.equals("MENU")){
				
				System.out.println("Sveiki!");
				System.out.println("Jūs esat izvēlējies pakalpojumu - veikt pasūtījumu no menu. Mūsu uzņēmums piedāvā dažādas vienāda lieluma un cenas picas.");
				System.out.println("Pasūtījuma beigās jūs saņemsiet čeku");
				System.out.println("Visu labu!");
				
				System.out.println("Ievadiet pasūtījuma nosaukumu: ");
				nosaukums1 = scan.next();
				
				System.out.println("Cik daudz klientu vēlas veikt pasūtījumu? ");
				klienti = scan.nextInt();
				
				System.out.println("Cik picas vēlaties pasūtīt?");
				int a = scan.nextInt();
				scan.close();
				
				for(int i=1; i<=klienti; i++) {
				Izveidot(a, nosaukums1);
				
				}
			}else if (izvele.equals("MANAPICA")) {
				
				System.out.println("Ievadiet pasūtījuma nosaukumu: ");
				nosaukums2 = scan.next();
				
				Menu(nosaukums2);
				}else{
				JOptionPane.showMessageDialog(null, "Sāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			}
		}while(!izvele.equals("STOP"));
	}
	}

