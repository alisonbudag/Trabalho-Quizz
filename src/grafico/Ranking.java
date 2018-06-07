package grafico;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class Ranking extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public Ranking() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblRanking = new JLabel("");
		lblRanking.setIcon(new ImageIcon("C:\\Users\\ALISONRAFAEL\\Desktop\\Java Fundamentos\\06 - Orienta\u00E7\u00E3o Objetos\\Trabalho Quizz\\resources\\imgRanking.jpg"));
		lblRanking.setBounds(10, 11, 430, 49);
		contentPane.add(lblRanking);
		
		//Instanciar Painel de Controle
		codigo.Tabela a = new codigo.Tabela();
				
		JScrollPane barraTabela = new JScrollPane();
		barraTabela.setBounds(10, 71, 430, 184);
		contentPane.add(barraTabela);
				
		table = new JTable(a.listarRanking());
		table.setDefaultEditor(Object.class, null);
		barraTabela.setViewportView(table);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lobby a = new Lobby();
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(321, 266, 119, 23);
		contentPane.add(btnVoltar);
		
		
		setVisible(true);
	}
}
