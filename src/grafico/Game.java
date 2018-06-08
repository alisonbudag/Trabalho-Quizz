package grafico;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import codigo.SelecionarPerguntas;
import modelo.Players;
import javax.swing.ImageIcon;

public class Game extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	public static JLabel lblPulos = new JLabel();
	public static JLabel lblAjuda = new JLabel();
	public static JLabel lblAcertos = new JLabel();
	public static JLabel lblErros = new JLabel();

	public Game() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Chamar JPanel Perguntas
		SelecionarPerguntas a = new SelecionarPerguntas();
		contentPane.add(a.painelPerguntas());
		
		//Painel Estatísticas
		JPanel panelEstatisticas = new JPanel();
		panelEstatisticas.setBounds(320, 39, 120, 213);
		contentPane.add(panelEstatisticas);
		panelEstatisticas.setLayout(null);
		
		//Estatísticas
		JLabel lblNumeros = new JLabel("Números");
		lblNumeros.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeros.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumeros.setBounds(10, 11, 100, 22);
		panelEstatisticas.add(lblNumeros);
		
		lblPulos.setText("Pulos: "+modelo.Estaticas.pular);
		lblPulos.setHorizontalAlignment(SwingConstants.LEFT);
		lblPulos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPulos.setBounds(10, 44, 100, 22);
		panelEstatisticas.add(lblPulos);
		
		lblAjuda.setText("Ajuda: "+modelo.Estaticas.ajuda);
		lblAjuda.setHorizontalAlignment(SwingConstants.LEFT);
		lblAjuda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAjuda.setBounds(10, 77, 100, 22);
		panelEstatisticas.add(lblAjuda);
		
		lblAcertos.setText("Acertos: "+modelo.Estaticas.acertos);
		lblAcertos.setHorizontalAlignment(SwingConstants.LEFT);
		lblAcertos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAcertos.setBounds(10, 110, 100, 22);
		panelEstatisticas.add(lblAcertos);
		
		lblErros.setText("Erros: "+modelo.Estaticas.erros);
		lblErros.setHorizontalAlignment(SwingConstants.LEFT);
		lblErros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblErros.setBounds(10, 143, 100, 22);
		panelEstatisticas.add(lblErros);
		
		//Botões
		JButton btnPular = new JButton("PULAR");
		btnPular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(modelo.Estaticas.pular < 3){
				
					//Incrementando Pulo
					modelo.Estaticas.pular++;
					lblPulos.setText("Pulos: "+modelo.Estaticas.pular);
				
					//pular
					modelo.Estaticas.indexPerguntas++;
				
					//Próxima questão questão
					if(modelo.Estaticas.indexPerguntas < (10 + modelo.Estaticas.pular)){
				
						SelecionarPerguntas.lblQuestao.setText((modelo.Estaticas.indexPerguntas+1-modelo.Estaticas.pular)+"ª QUESTÃO");
						SelecionarPerguntas.txtPergunta.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getQuestao());
						SelecionarPerguntas.opcaoA.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa1());
						SelecionarPerguntas.opcaoB.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa2());
						SelecionarPerguntas.opcaoC.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa3());
						SelecionarPerguntas.opcaoD.setText(modelo.Perguntas.perguntasSelecionadas.get(modelo.Estaticas.indexPerguntas).getAlternativa4());
						SelecionarPerguntas.opcoes.clearSelection();
				
					}else{
					
						SelecionarPerguntas.lblQuestao.setText("ACABOU!");
						SelecionarPerguntas.txtPergunta.setText("");
						SelecionarPerguntas.opcaoA.setVisible(false);
						SelecionarPerguntas.opcaoB.setVisible(false);
						SelecionarPerguntas.opcaoC.setVisible(false);
						SelecionarPerguntas.opcaoD.setVisible(false);
					
					}
				
				}else{
					JOptionPane.showMessageDialog(null, "Você já pulou 3 vezes.");
				}
			}
		});
		btnPular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPular.setBounds(10, 263, 145, 23);
		contentPane.add(btnPular);
		
		JButton btnAjuda = new JButton("AJUDA");
		btnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelo.Estaticas.ajuda == 0) {
					
					//Executar método
					codigo.Ajuda a = new codigo.Ajuda();
					a.ajuda();
					
					//Incrementar pulo
					modelo.Estaticas.ajuda++;
					lblAjuda.setText("Ajuda: "+modelo.Estaticas.ajuda);
					
				}else {
					JOptionPane.showMessageDialog(null, "Você só pode pedir ajuda uma vez");
				}
			}
		});
		btnAjuda.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAjuda.setBounds(168, 263, 130, 23);
		contentPane.add(btnAjuda);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SelecionarPerguntas.lblQuestao.getText().equals("ACABOU!")){
					
					//Adicionar no vetor
					Players b = new Players();
					b.setNome(modelo.Estaticas.nomeJogador);
					b.setAcertos(modelo.Estaticas.acertos);
					b.setAjuda(modelo.Estaticas.ajuda);
					b.setPulo(modelo.Estaticas.pular);
					b.setData(modelo.Estaticas.data);
					b.setCategoria(modelo.Estaticas.categoria);
					modelo.Players.players.add(b);
					
					//Voltar ao menu
					Lobby a = new Lobby();
					dispose();
					
				}else{
					
					//Voltar ao menu
					Lobby a = new Lobby();
					dispose();
					
				}
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMenu.setBounds(312, 263, 130, 23);
		contentPane.add(btnMenu);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/imgGame.jpg")));
		lblNewLabel.setBounds(188, 5, 73, 23);
		contentPane.add(lblNewLabel);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
}
