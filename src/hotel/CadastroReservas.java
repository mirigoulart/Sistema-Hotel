package hotel;

import java.util.Date;

public class CadastroReservas {
	
	private String nomeHospede;
	private Date checkIn;
	private Date checkOut;
	private int numQuartoReservado;
	private String tipoQuartoReservado;
	
	public CadastroReservas(String nomeHospede, Date checkIn, Date checkOut, int numQuartoReservado,
			String tipoQuartoReservado) {
		super();
		this.nomeHospede = nomeHospede;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numQuartoReservado = numQuartoReservado;
		this.tipoQuartoReservado = tipoQuartoReservado;
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomehospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public int getNumQuartoReservado() {
		return numQuartoReservado;
	}

	public void setNumQuartoReservado(int numQuartoReservado) {
		this.numQuartoReservado = numQuartoReservado;
	}

	public String getTipoQuartoReservado() {
		return tipoQuartoReservado;
	}

	public void setTipoQuartoReservado(String tipoQuartoReservado) {
		this.tipoQuartoReservado = tipoQuartoReservado;
	}
}
