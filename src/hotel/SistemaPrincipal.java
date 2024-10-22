package hotel;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SistemaPrincipal {
	
	public static void main(String[] args) {
		Gerenciamento hotel = new Gerenciamento();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("SISTEMA HOTEL");
			System.out.println("----------------------------");
			System.out.println("1. Cadastar Quarto");
			System.out.println("2. Cadastar Reserva");
			System.out.println("3. Check in");
			System.out.println("4. Check out");
			System.out.println("5. Relatório de Ocupação");
			System.out.println("6. Histórico de Reservas");
			System.out.println("7. Sair");
			System.out.println();
			System.out.print("Digite uma opcao: ");
			int opcao = scan.nextInt();
			scan.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.print("Número do Quarto: ");
				int numero = scan.nextInt();
				scan.nextLine(); 
				System.out.print("Tipo do Quarto: ");
				String tipo = scan.nextLine();  
				System.out.print("Preço Diário: R$");
				double preco = scan.nextDouble();
				hotel.cadastrarQuarto(numero, tipo, preco);
				break;
			case 2:
				System.out.print("Nome do Hóspede: ");
				String nome = scan.nextLine();
				System.out.println("Data de Check-in:");
				Date checkIn = lerData(scan);
				System.out.println("Data de Check-out:");
				Date checkOut = lerData(scan);
				System.out.print("Número do Quarto: ");
				int numReservado = scan.nextInt();
				scan.nextLine();
				System.out.print("Tipo do Quarto: ");
				String tipoQuarto = scan.nextLine();
				hotel.cadastrarReservas(nome, checkIn, checkOut, numReservado, tipoQuarto);
				break;
				
			case 3:
				System.out.print("Número do Quarto para Check in: ");
				int numeroQuartoIn = scan.nextInt();
				hotel.realizarCheckIn(numeroQuartoIn);
				break;
				
			case 4:
				System.out.print("Número do Quarto para Check out: ");
				int numeroQuartoOut = scan.nextInt();
				hotel.realizarCheckOut(numeroQuartoOut);;
				break;
				
			case 5: 
				hotel.relatorioOcupacao();
				break;
				
			case 6:	
				hotel.historicoReservas();
				break;
			
			case 7: 
				System.out.println("Encerrando o sistema...");
				scan.close();
				return;
			
			default: 
				System.out.println("Opção Inválida! Tente Novamente");
				break;
			}
		}
	}
	public static Date lerData(Scanner scan) {
		System.out.print("Digite o dia: ");
		int dia = scan.nextInt();
		System.out.print("Digite o mês: ");
		int mes = scan.nextInt();
		System.out.print("Digite o ano: ");
		int ano = scan.nextInt();
		scan.nextLine(); 
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, dia);
		calendario.set(Calendar.MONTH, mes - 1); 
		calendario.set(Calendar.YEAR, ano);
		
		return calendario.getTime();
	}
}