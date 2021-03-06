import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Stifurska_pica {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");
	static String vards, adrese, talruni,teksts, picasnosaukums, atb,lielums,izvele, maksasanasveids,pica;
	
	public static void Izveidot(int a, String nosaukums1) {
		char k;
		
		try{				
			FileWriter fw = new FileWriter(nosaukums1, true);
			PrintWriter raksta = new PrintWriter(fw);
			
			vards = JOptionPane.showInputDialog("Ievadi savu vardu: ");
			raksta.println("Klienta vārds: "+vards.substring(0,1).toUpperCase()+vards.substring(1,vards.length()));
			adrese = JOptionPane.showInputDialog("Ievadi savu adrese: ");
			raksta.println("Klienta adrese: "+adrese.substring(0,1).toUpperCase()+adrese.substring(1,adrese.length()));
			do {
			talruni = JOptionPane.showInputDialog("Ievadi savu talruni: ");
			raksta.println("Klienta numurs: "+talruni);
			}while(talruni.length() < 8 ||talruni.length() > 8);
			
			izvele = JOptionPane.showInputDialog("Jums jāparāda menu?: ");
			izvele = izvele.toUpperCase();
			if(izvele.equals("JA")) {
			System.out.println("Menu");
			System.out.println("1	-	Siera Pica			11.99€"
					+ " Sastāvs: Picas mērce, siers (40cm)");
			System.out.println("2	-	Desu Pica			11.99€"
					+ " Sastāvs: Picas mērce, siers, desa (40cm)");
			System.out.println("3	-	Zemnieku Pica			11.99€"
					+ " Sastāvs: Picas mērce, siers, desa, bekons, šampinjoni (40cm)");
			System.out.println("4	-	Havaju Pica			11.99€"
					+ " Sastāvs: 1000 salu mērce, siers, šķiņķis, vista, paprika, ananāsi (40cm)");
			System.out.println("5	-	Meatball Pica			11.99€"
					+ " Sastāvs: Picas mērce, siers, cīsiņi, gaļas bumbiņas (40cm)");
			}
			raksta.println("Klients lūdza parādīt menu:"+izvele);
			
			for(int i=1; i<=a; i++) {
				picasnosaukums = JOptionPane.showInputDialog("Paskaties menu un ievadiet picas nosaukumu: ");
				raksta.println("Picas nosaukums: "+picasnosaukums);
				maksasanasveids = JOptionPane.showInputDialog("Apmaksas veids: (k - KARTE/ n - NAUDA)");
				
				k = maksasanasveids.charAt(0);
				if (k == 'K' || k == 'k') {
					
			       System.out.println("Apmaksas veids: Karte");
			       raksta.println("Apmaksas veids: Karte ");
			       
			    } else if (k == 'n' || k == 'N') {
			    	
			    	System.out.println("Apmaksas veids: Nauda");
				    raksta.println("Apmaksas veids: Nauda ");
				    
			    }
				
				atb = JOptionPane.showInputDialog("Vai vēlaties saņemt pasūtījumu uzvietas??");
				atb = atb.toUpperCase();
				
				 JOptionPane.showMessageDialog(null, "Paldies par pasūtījumu.");
			        UIManager.put("OptionPane.yesButtonText", "Super");
			        UIManager.put("OptionPane.noButtonText", "Slikti");
			        int viedoklis = JOptionPane.showConfirmDialog(null, "Kā Jūs novērtēsiet mūsu apkalpošanu?", "Viedoklis", JOptionPane.YES_NO_OPTION);
			        if(viedoklis==JOptionPane.YES_OPTION){
			            JOptionPane.showMessageDialog(null, "Paldies par atsauksmi!");
			        }if(viedoklis==JOptionPane.NO_OPTION){
			            JOptionPane.showInputDialog("Paldies!");
			            JOptionPane.showMessageDialog(null, "");
			        }
		}
			raksta.close();
			JOptionPane.showMessageDialog(null, "Teksts ir saglabāts!");
	}catch(Exception e){
		JOptionPane.showConfirmDialog(null, "Kļūme ierakstot failā!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
	}
	System.out.println();
	
		}
	
	public static void Menu(String nosaukums2){
		String vards,talr,adress,mikla;
	    char tips;
	    final double taxRate = 0.08; 
	    double tax, kopa, viss, izmaksas = 0.0;  
	    int pildijums = 0,pildijums2 =0,pildijums4 =0,pildijums5 =0,pildijums3,dm, pildijums6=0;
	    
	    String toppings = "Siers";
	    System.out.print("Ievadi savu vardu: ");
	    vards = scan.next();
	    System.out.print("Ievadi savu adrese: ");
	    adress = scan.next();
	    do {
	    System.out.print("Ievadi savu talruni: ");
	    talr = scan.next();
	    }while(talr.length() < 8 ||talr.length() > 8);
	    
	    double distance = 0;
	    double delt = 0;
	    System.out.print("Lūdzu, ievadiet attālumu no picērijas (0 veikala saņemšanai):");
	    distance =scan.nextDouble();
	    if (distance == 0) {
	    	delt = 0;
	        System.out.println("Nav nosūtīšanas maksas.");
	    } else if (distance > 1) {
	    	delt = ((distance * 0.5) + 2);
	        System.out.println("Piegādes izmaksas: " + df.format (delt)+"€");
	    } else if (distance > 0) {
	    	delt = 2.00;
	        System.out.println("Piegādes izmaksas: " + df.format (delt)+"€");
	    }
	   
	    System.out.print("Kāda izmēra picu vēlaties? (20, 25, 30 vai 50)");
	    dm = scan.nextInt();
	    if (dm == 20) {
	    	izmaksas = 12.99;
	    } else if (dm == 25) {
	    	izmaksas = 14.99;
	    } else if (dm == 30) {
	    	izmaksas = 16.99;
	    } else if (dm == 50) {
	    	izmaksas = 18.99;
	    } else if (dm != 20 && dm != 25 && dm != 30 && dm != 50) {
	        System.out.println("Ievadītais numurs nav derīgs, picas izmērs tiks iestatīts uz 20 cm.");
	        izmaksas = 12.99;
	    }
	   scan.nextLine();
	   
	   System.out.print("Kādu mīklu vēlaties picā? (H) Hand-Tossed, (T) Thin-crust, (D) Deep-Dish: ");
	    tips = scan.nextLine().charAt(0);
	    if (tips == 'H' || tips == 'h') {
	    	mikla = "Hand-Tossed";
	    } else if (tips == 'T' || tips == 't') {
	    	mikla = "Thin-Crust";
	    } else if (tips == 'D' || tips == 'd') {
	    	mikla = "Deep-Dish";
	    } else if (tips != 'H' && tips != 'h' && tips != 'T' && tips != 't' && tips != 'D' && tips != 'd') {
	        System.out.println("Ievadītais tips nav derīgs, picas mīkla tiks izvēlēta manuāli");
	    }
	    mikla = "Deep-Dish"; 
	    
	    System.out.println("Visas picas nāk ar sieru.");
	    System.out.println("Papildu pildījumi maksā 1,25.");
	    System.out.print("Vēlaties pepperoni? (N / Y)");
	    pildijums = scan.nextLine().charAt(0);
	    if (pildijums == 'Y' || pildijums == 'y') {
	    	pildijums = 1;
	        toppings = toppings + " , pepperoni";
	    } else {
	    	pildijums = 0;
	    }
	    System.out.print("Vēlaties desu? (N / Y)");
	    pildijums2 = scan.nextLine().charAt(0);
	    if (pildijums2 == 'y' || pildijums2 == 'Y') {
	    	pildijums2 = 1;
	        toppings = toppings + " , desa";
	    } else {
	    	pildijums2 = 0;
	    } 
	    System.out.print("Vēlaties majonēzi? (N / Y)");
	    pildijums4 = scan.nextLine().charAt(0);
	    if (pildijums4 == 'y' || pildijums4 == 'Y') {
	    	pildijums4 = 1;
	        toppings = toppings + " , majonēze";
	    } else {
	    	pildijums4 = 0;
	    } 
	    System.out.print("Vēlaties kečupu? (N / Y)");
	    pildijums5 = scan.nextLine().charAt(0);
	    if (pildijums5 == 'y' || pildijums5 == 'Y') {
	    	pildijums5 = 1;
	        toppings = toppings + " , kečups";
	    } else {
	    	pildijums5 = 0;
	    } 
	    System.out.print("Vēlaties sēnes? (N / Y)");
	    pildijums6 = scan.nextLine().charAt(0);
	    if (pildijums6 == 'y' || pildijums5 == 'Y') {
	    	pildijums6 = 1;
	        toppings = toppings + " , sēnes";
	    } else {
	    	pildijums6 = 0;
	    }
	    
	    pildijums3  = (pildijums) + (pildijums2) + (pildijums4) + (pildijums5)+(pildijums6);
	    kopa = (izmaksas) + (pildijums3 * 1.25) + (delt);
	    tax = kopa * taxRate;
	    viss = kopa * ( 1 + taxRate );
	    
	    JOptionPane.showMessageDialog(null, "Paldies par pasūtījumu.");
        UIManager.put("OptionPane.yesButtonText", "Super");
        UIManager.put("OptionPane.noButtonText", "Slikti");
        int viedoklis = JOptionPane.showConfirmDialog(null, "Kā Jūs novērtēsiet mūsu apkalpošanu?", "Viedoklis", JOptionPane.YES_NO_OPTION);
        if(viedoklis==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Paldies par atsauksmi!");
        }if(viedoklis==JOptionPane.NO_OPTION){
            JOptionPane.showInputDialog("Paldies!");
            JOptionPane.showMessageDialog(null, "");
        }
        
	    try {
			FileWriter fw = new FileWriter(nosaukums2, true);
			PrintWriter raksta = new PrintWriter(fw); 
			raksta.println(vards.substring(0,1).toUpperCase()+vards.substring(1,vards.length()) + ",jūsu pasūtījums:");
		    System.out.println(vards.substring(0,1).toUpperCase()+vards.substring(1,vards.length()) + ",jūsu pasūtījums:");
		    raksta.println("Picas izmērs: "+dm + " cm pica");
		    System.out.println("Picas izmērs: "+dm + " cm pica");
		    raksta.println("Sastāvdaļas: "+mikla + ", " + toppings);
		    System.out.println("Sastāvdaļas: "+mikla + ", " + toppings);
		    raksta.println("Pasūtījuma izmaksas: " + df.format(kopa));
		    System.out.println("Pasūtījuma izmaksas: " + df.format(kopa));
		    raksta.println("Nodoklis: " + df.format(tax)+"€");
		    System.out.println("Nodoklis: " + df.format(tax)+"€");
		    raksta.println("Kopējā summa: " + df.format(viss));
		    System.out.println("Kopējā summa: " + df.format(viss)+"€");
		    raksta.println("Jūsu adrese un tālruņa numurs: "+talr+"/"+adress.substring(0,1).toUpperCase()+adress.substring(1,adress.length()));
		    System.out.println("Jūsu adrese un tālruņa numurs: "+talr+"/"+adress.substring(0,1).toUpperCase()+adress.substring(1,adress.length()));
		    raksta.close();
			
	    }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kļūme ierakstot failā", "Kļūme!", JOptionPane.ERROR_MESSAGE);
	    }
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
				
				System.out.print("Ievadiet pasūtījuma nosaukumu: ");
				nosaukums1 = scan.next();
				
				System.out.print("Cik daudz klientu vēlas veikt pasūtījumu? ");
				klienti = scan.nextInt();
				
				System.out.print("Cik picas vēlaties pasūtīt?");
				int a = scan.nextInt();
				scan.close();
				
				for(int i=1; i<=klienti; i++) {
				Izveidot(a, nosaukums1);
				
				}
			}else if (izvele.equals("MANAPICA")) {
				
				System.out.print("Ievadiet pasūtījuma nosaukumu: ");
				nosaukums2 = scan.next();
				
				Menu(nosaukums2);
				}else{
				JOptionPane.showMessageDialog(null, "Sāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			}
		}while(!izvele.equals("STOP"));
	}
	}

