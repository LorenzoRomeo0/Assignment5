package controller;
import data.Status;

public abstract class Controller {
	private Status stato;

	public Status getStato() {
		return stato;
	}
	
	public void setStato(Status stato) {
		this.stato = stato;
	}
	
	public void initData() {
		
	}
}
