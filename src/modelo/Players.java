package modelo;

import java.util.ArrayList;
import java.util.Comparator;

public class Players{
	
	//Atributos
	private String nome, data, categoria;
	private Integer acertos, pulo, ajuda;
	
	//ArrayList
	public static ArrayList<Players> players = new ArrayList<>();
	
	//Comparador
	private static Comparator<Players> comparadorJogador;

	//Inicializa o comparador
	static {	
		// Instrui o comparador para primeiro comparar pelo número de acertos e em
	    // seguida pelos pulos.
	    comparadorJogador = (jogador1, jogador2) -> jogador2.acertos.compareTo(jogador1.acertos);
	    comparadorJogador = comparadorJogador.thenComparing(
	            (jogador1, jogador2) -> jogador1.pulo.compareTo(jogador2.pulo));
	}
	
	// Retorna uma lista ordenada dos jogadores. A lista é ordenada primeiro
	// pelo número de acertos e em seguida pela quantidade que o jogador pulou.
	public static ArrayList<Players> listarJogadores(){
		ArrayList<Players> jogadores = players;
		//Ordena a lista
		jogadores.sort(comparadorJogador);
		
		return jogadores;
	}
	
	//Método Mágico	
	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

	public int getPulo() {
		return pulo;
	}

	public void setPulo(int pulo) {
		this.pulo = pulo;
	}

	public int getAjuda() {
		return ajuda;
	}

	public void setAjuda(int ajuda) {
		this.ajuda = ajuda;
	}
	
}
