package hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gerenciamento {

    private List<CadastroQuartos> listaQuartos = new ArrayList<>();
    private List<CadastroReservas> listaReservas = new ArrayList<>();

    public void cadastrarQuarto(int numQuarto, String tipoQuarto, double precoDiario) {
        CadastroQuartos quarto = new CadastroQuartos(numQuarto, tipoQuarto, precoDiario);
        listaQuartos.add(quarto);
        System.out.println("Quarto cadastrado com sucesso!");
    }

    public void cadastrarReservas(String nomeHospede, Date checkIn, Date checkOut, int numQuartoReservado, String tipoQuartoReservado) {
        CadastroReservas reserva = new CadastroReservas(nomeHospede, checkIn, checkOut, numQuartoReservado, tipoQuartoReservado);
        listaReservas.add(reserva);
        System.out.println("Reserva cadastrada com sucesso!");
    }

    public void realizarCheckIn(int numeroQuarto) {
        for (CadastroQuartos quarto : listaQuartos) {
            if (quarto.getNumeroQuarto() == numeroQuarto && quarto.isDisponivel()) {
                quarto.setDisponivel(false);
                System.out.println("Check-in realizado no quarto: " + numeroQuarto);
                return;
            }
        }
        System.out.println("Quarto não disponível ou não encontrado.");
    }

    public void realizarCheckOut(int numeroQuarto) {
        for (CadastroQuartos quarto : listaQuartos) {
            if (quarto.getNumeroQuarto() == numeroQuarto && !quarto.isDisponivel()) {
                quarto.setDisponivel(true);
                System.out.println("Check-out realizado no quarto: " + numeroQuarto);
                return;
            }
        }
        System.out.println("Quarto não encontrado ou já está disponível.");
    }

    public void relatorioOcupacao() {
        for (CadastroQuartos quarto : listaQuartos) {
            if (!quarto.isDisponivel()) {
                System.out.println("Quarto: " + quarto.getNumeroQuarto() + " | Tipo: " + quarto.getTipoQuarto() + " | Ocupado");
            }
        }
    }

    public void historicoReservas() {
        for (CadastroReservas reserva : listaReservas) {
            System.out.println("Hóspede: " + reserva.getNomeHospede());
            System.out.println("Check-in: " + reserva.getCheckIn());
            System.out.println("Check-out: " + reserva.getCheckOut());
            System.out.println("Tipo de Quarto: " + reserva.getTipoQuartoReservado());
            System.out.println("--------------------------------------------------");
        }
    }  
}
