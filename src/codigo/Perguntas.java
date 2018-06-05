package codigo;

import modelo.PadraoPerguntas;

public class Perguntas extends PadraoPerguntas{

	@Override
	public void cadastrarPerguntas() {
		
		//Pergunta Rock #1
		modelo.Perguntas p1 = new modelo.Perguntas();
		p1.setQuestao("Quais são os integrantes originais da banda Beatles?");
		p1.setAlternativa1("Jim Morrison, Paul McCartney ,George Harrison, John Lennon e Stu Sutcliffe");
		p1.setAlternativa2("John Lennon, Paul McCartney, George Harrison, Stu Sutcliffe e Peter Best");
		p1.setAlternativa3("Ringo Starr, Paul McCartney, Peter Best, Bono Vox e Mick Jagger");
		p1.setAlternativa4("John Lennon, Jimmy Page, Paul McCartney, Stu Sutcliffe e George Harrison");
		p1.setAlternativaCorreta(2);
		modelo.Perguntas.sessaoRock.add(p1);
		
	}
	
	

}
