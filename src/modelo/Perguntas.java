package modelo;

import java.util.ArrayList;

public class Perguntas {
	
	//Atributos
	private String questao, alternativa1, alternativa2, alternativa3, alternativa4;
	private int alternativaCorreta;
	
	public static ArrayList<Perguntas> sessaoRock = new ArrayList<>();
	public static ArrayList<Perguntas> sessaoGame = new ArrayList<>();
	public static ArrayList<Perguntas> sessaoProgramming = new ArrayList<>();
	
	//Método Mágico
	public String getQuestao() {
		return questao;
	}
	public void setQuestao(String questao) {
		this.questao = questao;
	}
	public String getAlternativa1() {
		return alternativa1;
	}
	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}
	public String getAlternativa2() {
		return alternativa2;
	}
	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}
	public String getAlternativa3() {
		return alternativa3;
	}
	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}
	public String getAlternativa4() {
		return alternativa4;
	}
	public void setAlternativa4(String alternativa4) {
		this.alternativa4 = alternativa4;
	}
	public int getAlternativaCorreta() {
		return alternativaCorreta;
	}
	public void setAlternativaCorreta(int alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}

	
}
