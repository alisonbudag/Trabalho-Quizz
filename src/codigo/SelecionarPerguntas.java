package codigo;

import java.util.Random;

import javax.swing.JPanel;

public class SelecionarPerguntas {

	public void selecionarPerguntas(String categoria) {

		Random geraPergunta = new Random();
		boolean valida = false;

		// Laço Random
		for (int i = 0; i < 13; i++) {

			int escolher = geraPergunta.nextInt(20);

			if (i == 0) {
				modelo.Randomizar.randomizar.add(escolher);
			} else {

				for (int i2 = i-1; i2 >= 0; i2--) {
					if (modelo.Randomizar.randomizar.get(i2) == escolher) {
						valida = false;
						break;
					} else {
						valida = true;
					}
				}
				
				if(valida == true){
					modelo.Randomizar.randomizar.add(escolher);
				}else{
					i--;
				}

			}

		}

		// Colocar as perguntas no Array
		for (int i = 0; i < 13; i++) {
			
			if(categoria.equals("Rock")){
				
				for(int i2=0; i2<20; i2++){
					if(modelo.Randomizar.randomizar.get(i) == i2){
						modelo.Perguntas a = new modelo.Perguntas();
						a.setQuestao(modelo.Perguntas.sessaoRock.get(i2).getQuestao());
						a.setAlternativa1(modelo.Perguntas.sessaoRock.get(i2).getAlternativa1());
						a.setAlternativa2(modelo.Perguntas.sessaoRock.get(i2).getAlternativa2());
						a.setAlternativa3(modelo.Perguntas.sessaoRock.get(i2).getAlternativa3());
						a.setAlternativa4(modelo.Perguntas.sessaoRock.get(i2).getAlternativa4());
						a.setAlternativaCorreta(modelo.Perguntas.sessaoRock.get(i2).getAlternativaCorreta());
						modelo.Perguntas.perguntasSelecionadas.add(a);
					}
				}
				
			}else if(categoria.equals("Games")){
				
				for(int i2=0; i2<20; i2++){
					if(modelo.Randomizar.randomizar.get(i) == i2){
						modelo.Perguntas a = new modelo.Perguntas();
						a.setQuestao(modelo.Perguntas.sessaoGame.get(i2).getQuestao());
						a.setAlternativa1(modelo.Perguntas.sessaoGame.get(i2).getAlternativa1());
						a.setAlternativa2(modelo.Perguntas.sessaoGame.get(i2).getAlternativa2());
						a.setAlternativa3(modelo.Perguntas.sessaoGame.get(i2).getAlternativa3());
						a.setAlternativa4(modelo.Perguntas.sessaoGame.get(i2).getAlternativa4());
						a.setAlternativaCorreta(modelo.Perguntas.sessaoGame.get(i2).getAlternativaCorreta());
						modelo.Perguntas.perguntasSelecionadas.add(a);
					}
				}
				
			}else{
				
				for(int i2=0; i2<20; i2++){
					if(modelo.Randomizar.randomizar.get(i) == i2){
						modelo.Perguntas a = new modelo.Perguntas();
						a.setQuestao(modelo.Perguntas.sessaoCinema.get(i2).getQuestao());
						a.setAlternativa1(modelo.Perguntas.sessaoCinema.get(i2).getAlternativa1());
						a.setAlternativa2(modelo.Perguntas.sessaoCinema.get(i2).getAlternativa2());
						a.setAlternativa3(modelo.Perguntas.sessaoCinema.get(i2).getAlternativa3());
						a.setAlternativa4(modelo.Perguntas.sessaoCinema.get(i2).getAlternativa4());
						a.setAlternativaCorreta(modelo.Perguntas.sessaoCinema.get(i2).getAlternativaCorreta());
						modelo.Perguntas.perguntasSelecionadas.add(a);
					}
				}
				
			}
			
		}

	}

	public JPanel painelPerguntas(){
		
		JPanel jp = new JPanel();
		jp.setBounds(10, 39, 300, 213);
		jp.setLayout(null);
		
		return jp;
		
	}
	
}
