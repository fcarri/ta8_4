package project8;

public class Serie {

	protected String titulo;
	protected int numero_de_temporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	public Serie() {
		this.titulo = "";
		this.numero_de_temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numero_de_temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	
	public Serie(String titulo, int numero_de_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numero_de_temporadas = numero_de_temporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	
}
