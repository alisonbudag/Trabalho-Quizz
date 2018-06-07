package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.SelecionarPerguntas;
import modelo.Perguntas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lobby extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	public Lobby() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(10, 171, 201, 27);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtNome.setBounds(10, 200, 201, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setForeground(Color.WHITE);
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(10, 231, 201, 15);
		contentPane.add(lblCategoria);
		
		JComboBox<String> comboCategoria = new JComboBox<String>();
		comboCategoria.setBounds(10, 257, 201, 20);
		comboCategoria.addItem("Rock");
		comboCategoria.addItem("Games");
		comboCategoria.addItem("S�ries");
		contentPane.add(comboCategoria);
		
		JButton btnJogar = new JButton("JOGAR");
		btnJogar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnJogar.setBounds(221, 200, 98, 82);
		contentPane.add(btnJogar);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(330, 249, 110, 33);
		contentPane.add(btnSair);
		
		JButton btnRanking = new JButton("RANKING");
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRanking.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRanking.setBounds(330, 200, 110, 33);
		contentPane.add(btnRanking);
		btnJogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				
				codigo.Players c = new codigo.Players();
				
				
				if(c.validarNome(nome) == true){
					
					//Resetando vari�veis
					modelo.Perguntas.perguntasSelecionadas.clear();
					modelo.Randomizar.randomizar.clear();
					modelo.Estaticas.indexPerguntas = 0;
					modelo.Estaticas.pular = 0;
					modelo.Estaticas.ajuda = 0;
					modelo.Estaticas.nomeJogador = txtNome.getText();
					modelo.Estaticas.acertos = 0;
					modelo.Estaticas.erros = 0;
					modelo.Estaticas.data = c.guardarHora();
					modelo.Randomizar.ajudaRandom = 0;
					SelecionarPerguntas.opcaoA.setVisible(true);
					SelecionarPerguntas.opcaoB.setVisible(true);
					SelecionarPerguntas.opcaoC.setVisible(true);
					SelecionarPerguntas.opcaoD.setVisible(true);
					SelecionarPerguntas.opcoes.clearSelection();
				
					//Abrindo novo jogo
					String categoria = comboCategoria.getSelectedItem().toString();
				
					SelecionarPerguntas a = new SelecionarPerguntas();
					a.selecionarPerguntas(categoria);
				
					Game b = new Game();
					dispose();
					
				}
				
			}
		});
		
		setVisible(true);
	}
}
