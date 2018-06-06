package codigo;

import grafico.Lobby;

public class Main {

	public static void main(String[] args) {
		
		PerguntasPredefinidas a = new PerguntasPredefinidas();
		a.cadastrarPerguntasRock();
		a.cadastrarPerguntasGames();
		a.cadastrarPerguntasCinema();
		Lobby b = new Lobby();
		

	}

}
