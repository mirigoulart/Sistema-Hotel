package hotel;

public class CadastroQuartos {
	
	    private int numeroQuarto;
	    private String tipoQuarto;
	    private double precoDiario;
	    private boolean disponivel;

	    public CadastroQuartos(int numeroQuarto, String tipoQuarto, double precoDiario) {
	        this.numeroQuarto = numeroQuarto;
	        this.tipoQuarto = tipoQuarto;
	        this.precoDiario = precoDiario;
	        this.disponivel = true; 
	    }

	    public int getNumeroQuarto() {
	        return numeroQuarto;
	    }

	    public void setNumeroQuarto(int numeroQuarto) {
	        this.numeroQuarto = numeroQuarto;
	    }

	    public String getTipoQuarto() {
	        return tipoQuarto;
	    }

	    public void setTipoQuarto(String tipoQuarto) {
	        this.tipoQuarto = tipoQuarto;
	    }

	    public double getPrecoDiario() {
	        return precoDiario;
	    }

	    public void setPrecoDiario(double precoDiario) {
	        this.precoDiario = precoDiario;
	    }

	    public boolean isDisponivel() {
	        return disponivel;
	    }

	    public void setDisponivel(boolean disponivel) {
	        this.disponivel = disponivel;
	    }

	}

