package codigo;

import java.util.Random;

public class Ajuda {

	public void ajuda() {

		Random geraPergunta = new Random();
		int escolher = geraPergunta.nextInt(4);
		modelo.Randomizar.ajudaRandom = escolher;

		if (modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativaCorreta() == 1) {
			
			if(escolher == 1) {
				SelecionarPerguntas.opcaoB.setVisible(false);
			}else if(escolher == 2) {
				SelecionarPerguntas.opcaoB.setVisible(false);
				SelecionarPerguntas.opcaoC.setVisible(false);
			}else if(escolher == 3) {
				SelecionarPerguntas.opcaoB.setVisible(false);
				SelecionarPerguntas.opcaoC.setVisible(false);
				SelecionarPerguntas.opcaoD.setVisible(false);
			}
			
		}else if(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativaCorreta() == 2) {
			
			if(escolher == 1) {
				SelecionarPerguntas.opcaoA.setVisible(false);
			}else if(escolher == 2) {
				SelecionarPerguntas.opcaoA.setVisible(false);
				SelecionarPerguntas.opcaoD.setVisible(false);
			}else if(escolher == 3) {
				SelecionarPerguntas.opcaoA.setVisible(false);
				SelecionarPerguntas.opcaoC.setVisible(false);
				SelecionarPerguntas.opcaoD.setVisible(false);
			}
			
		}else if(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativaCorreta() == 3) {
			
			if(escolher == 1) {
				SelecionarPerguntas.opcaoB.setVisible(false);
			}else if(escolher == 2) {
				SelecionarPerguntas.opcaoD.setVisible(false);
				SelecionarPerguntas.opcaoA.setVisible(false);
			}else if(escolher == 3) {
				SelecionarPerguntas.opcaoA.setVisible(false);
				SelecionarPerguntas.opcaoB.setVisible(false);
				SelecionarPerguntas.opcaoD.setVisible(false);
			}
			
		}else {
			
			if(escolher == 1) {
				SelecionarPerguntas.opcaoC.setVisible(false);
			}else if(escolher == 2) {
				SelecionarPerguntas.opcaoB.setVisible(false);
				SelecionarPerguntas.opcaoA.setVisible(false);
			}else if(escolher == 3) {
				SelecionarPerguntas.opcaoA.setVisible(false);
				SelecionarPerguntas.opcaoB.setVisible(false);
				SelecionarPerguntas.opcaoC.setVisible(false);
			}
			
		}

	}

}
