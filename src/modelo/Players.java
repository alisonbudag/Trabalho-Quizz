package modelo;

import java.util.ArrayList;

public class Players {
	
	//Atributos
	private String nome, data;
	private int acertos, erros, pulo, ajuda;
	
	public static ArrayList<Players> players = new ArrayList<>();
	
	//Método Mágico
	public String getNome() {
		return nome;
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

	public int getErros() {
		return erros;
	}

	public void setErros(int erros) {
		this.erros = erros;
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
