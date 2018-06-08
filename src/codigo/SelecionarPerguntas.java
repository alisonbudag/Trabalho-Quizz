package codigo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import grafico.Game;
import modelo.Perguntas;

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

	//Componentes estáticos do Painel de perguntas para manipulação em outras Classes
	public static JRadioButton opcaoA = new JRadioButton();
	public static JRadioButton opcaoB = new JRadioButton();
	public static JRadioButton opcaoC = new JRadioButton();
	public static JRadioButton opcaoD = new JRadioButton();
	public static JTextArea txtPergunta = new JTextArea();
	public static JLabel lblQuestao = new JLabel();
	public static ButtonGroup opcoes = new ButtonGroup();
	
	//Método para painel de perguntas
	public JPanel painelPerguntas(){
		
		//Painel
		JPanel jp = new JPanel();
		jp.setBounds(10, 39, 300, 213);
		jp.setLayout(null);
		
		//Número da questão
		lblQuestao.setText((modelo.Estaticas.indexPerguntas+1-modelo.Estaticas.pular)+"ª QUESTÃO");
		lblQuestao.setBounds(10, 11, 280, 20);
		jp.add(lblQuestao);
		
		//Pergunta
		txtPergunta.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getQuestao());
		txtPergunta.setLineWrap(true);
		txtPergunta.setEditable(false);
		JScrollPane barraPergunta = new JScrollPane(txtPergunta);
		barraPergunta.setBounds(10, 40, 280, 38);
		jp.add(barraPergunta);
		
		//Alternativas
		opcaoA.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa1());
		opcaoA.setBounds(10, 89, 280, 20);
		jp.add(opcaoA);
		
		opcaoB.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa2());
		opcaoB.setBounds(10, 120, 280, 20);
		jp.add(opcaoB);
		
		opcaoC.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa3());
		opcaoC.setBounds(10, 151, 280, 20);
		jp.add(opcaoC);
		
		opcaoD.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa4());
		opcaoD.setBounds(10, 182, 280, 20);
		jp.add(opcaoD);
		
		//Adicionar ao ButtonGroup
		opcoes.add(opcaoA);
		opcoes.add(opcaoB);
		opcoes.add(opcaoC);
		opcoes.add(opcaoD);
		
		
		//Ações
		if(modelo.Estaticas.quantasVezesPainelIniciou == 0) {
			opcaoA.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativaCorreta() == 1){
						modelo.Estaticas.acertos ++;
						Game.lblAcertos.setText("Acertos: "+modelo.Estaticas.acertos);
					}else{
						modelo.Estaticas.erros ++;
						Game.lblErros.setText("Erros: "+modelo.Estaticas.erros);
					}
					
					modelo.Estaticas.indexPerguntas++;
					
					if(modelo.Estaticas.indexPerguntas < (10 + modelo.Estaticas.pular)){
					
						lblQuestao.setText((modelo.Estaticas.indexPerguntas+1-modelo.Estaticas.pular)+"ª QUESTÃO");
						txtPergunta.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getQuestao());
						opcaoA.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa1());
						opcaoB.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa2());
						opcaoC.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa3());
						opcaoD.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa4());
						opcoes.clearSelection();
						opcaoA.setVisible(true);
						opcaoB.setVisible(true);
						opcaoC.setVisible(true);
						opcaoD.setVisible(true);
					
					}else{
						
						lblQuestao.setText("ACABOU!");
						txtPergunta.setText("");
						opcaoA.setVisible(false);
						opcaoB.setVisible(false);
						opcaoC.setVisible(false);
						opcaoD.setVisible(false);
						
					}
					
				}
			});
			
			opcaoB.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativaCorreta() == 2){
						modelo.Estaticas.acertos ++;
						Game.lblAcertos.setText("Acertos: "+modelo.Estaticas.acertos);
					}else{
						modelo.Estaticas.erros ++;
						Game.lblErros.setText("Erros: "+modelo.Estaticas.erros);
					}
					
					modelo.Estaticas.indexPerguntas++;
					
					if(modelo.Estaticas.indexPerguntas < (10 + modelo.Estaticas.pular)){
					
						lblQuestao.setText((modelo.Estaticas.indexPerguntas+1-modelo.Estaticas.pular)+"ª QUESTÃO");
						txtPergunta.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getQuestao());
						opcaoA.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa1());
						opcaoB.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa2());
						opcaoC.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa3());
						opcaoD.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa4());
						opcoes.clearSelection();
						opcaoA.setVisible(true);
						opcaoB.setVisible(true);
						opcaoC.setVisible(true);
						opcaoD.setVisible(true);
					
					}else{
						
						lblQuestao.setText("ACABOU!");
						txtPergunta.setText("");
						opcaoA.setVisible(false);
						opcaoB.setVisible(false);
						opcaoC.setVisible(false);
						opcaoD.setVisible(false);
						
					}
					
				}
			});
			
			opcaoC.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativaCorreta() == 3){
						modelo.Estaticas.acertos ++;
						Game.lblAcertos.setText("Acertos: "+modelo.Estaticas.acertos);
					}else{
						modelo.Estaticas.erros ++;
						Game.lblErros.setText("Erros: "+modelo.Estaticas.erros);
					}
					
					modelo.Estaticas.indexPerguntas++;
					
					if(modelo.Estaticas.indexPerguntas < (10 + modelo.Estaticas.pular)){
					
						lblQuestao.setText((modelo.Estaticas.indexPerguntas+1-modelo.Estaticas.pular)+"ª QUESTÃO");
						txtPergunta.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getQuestao());
						opcaoA.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa1());
						opcaoB.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa2());
						opcaoC.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa3());
						opcaoD.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa4());
						opcoes.clearSelection();
						opcaoA.setVisible(true);
						opcaoB.setVisible(true);
						opcaoC.setVisible(true);
						opcaoD.setVisible(true);
					
					}else{
						
						lblQuestao.setText("ACABOU!");
						txtPergunta.setText("");
						opcaoA.setVisible(false);
						opcaoB.setVisible(false);
						opcaoC.setVisible(false);
						opcaoD.setVisible(false);
						
					}
					
				}
			});
			
			opcaoD.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativaCorreta() == 4){
						modelo.Estaticas.acertos ++;
						Game.lblAcertos.setText("Acertos: "+modelo.Estaticas.acertos);
					}else{
						modelo.Estaticas.erros ++;
						Game.lblErros.setText("Erros: "+modelo.Estaticas.erros);
					}
					
					modelo.Estaticas.indexPerguntas++;
					
					if(modelo.Estaticas.indexPerguntas < (10 + modelo.Estaticas.pular)){
					
						lblQuestao.setText((modelo.Estaticas.indexPerguntas+1-modelo.Estaticas.pular)+"ª QUESTÃO");
						txtPergunta.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getQuestao());
						opcaoA.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa1());
						opcaoB.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa2());
						opcaoC.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa3());
						opcaoD.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa4());
						opcoes.clearSelection();
						opcaoA.setVisible(true);
						opcaoB.setVisible(true);
						opcaoC.setVisible(true);
						opcaoD.setVisible(true);
					
					}else{
						
						lblQuestao.setText("ACABOU!");
						txtPergunta.setText("");
						opcaoA.setVisible(false);
						opcaoB.setVisible(false);
						opcaoC.setVisible(false);
						opcaoD.setVisible(false);
						
					}
					
				}
			});
		}
		
		modelo.Estaticas.quantasVezesPainelIniciou++;
		
		return jp;
		
	}
	
}
