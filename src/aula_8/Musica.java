/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 * 
 */
package aula_8;

public class Musica {
	private String titulo, artista, album;
	private int duracao; // Em segundos
	
	public Musica(String titulo, String artista, String album, int duracao) {
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.duracao = duracao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void imprimirDados() {
		System.out.println("Música ["+this.titulo+"]"
				+ "\nArtista: "+this.artista
				+ "\nAlbum: "+this.album
				+ "\nDuração (seg): "+this.duracao);
	}
	
}
