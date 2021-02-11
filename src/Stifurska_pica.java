import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Stifurska_pica {
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void Izveidot(int a, String nosaukums1) {
		
		}
	
	public static void Menu(String nosaukums2){
		
	}
	
	public static void main(String[] args) {
		String izvele,nosaukums1, nosaukums2;
		int klienti;
		do{
			
			izvele = JOptionPane.showInputDialog("'MENU' - veiciet pasūtījumu no menu; 'ManaPica' - izveido savu picu");
			izvele = izvele.toUpperCase();
			
			if(izvele.equals("MENU")){
				
				System.out.println("Здравствуйте!");
				System.out.println("Вы выбрали услугу - заказ по меню. Наше заведение предлагает Вам различные пицы одних размеров и одной ценой.");
				System.out.println("Весь Ваш заказ будет сохранен и показан у Вас на рабочем столе");
				System.out.println("Всего хорошего!");
				
				System.out.println("Введите название заказа: ");
				nosaukums1 = scan.next();
				
				System.out.println("Cik daudz klientu vēlas veikt pasūtījumu? ");
				klienti = scan.nextInt();
				
				System.out.println("Сколько пиц будет заказанно?");
				int a = scan.nextInt();
				scan.close();
				
				for(int i=1; i<=klienti; i++) {
				Izveidot(a, nosaukums1);
				}
			}else if (izvele.equals("MANAPICA")) {
				System.out.println("Введите название заказа: ");
				nosaukums2 = scan.next();
				Menu(nosaukums2);
				}else{
				JOptionPane.showMessageDialog(null, "Sāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			}
		}while(!izvele.equals("STOP"));
	}
	}

