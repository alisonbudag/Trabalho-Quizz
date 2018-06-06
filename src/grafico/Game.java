package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.SelecionarPerguntas;

import javax.swing.JLabel;
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

public class Game extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	public Game() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPerguntas = new JPanel();
		panelPerguntas.setBounds(10, 39, 300, 213);
		contentPane.add(panelPerguntas);
		panelPerguntas.setLayout(null);
		
		JPanel panelEstatisticas = new JPanel();
		panelEstatisticas.setBounds(320, 39, 120, 213);
		contentPane.add(panelEstatisticas);
		panelEstatisticas.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmeros");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 100, 22);
		panelEstatisticas.add(lblNewLabel);
		
		JLabel lblPulos = new JLabel("Pulos: ");
		lblPulos.setHorizontalAlignment(SwingConstants.LEFT);
		lblPulos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPulos.setBounds(10, 44, 100, 22);
		panelEstatisticas.add(lblPulos);
		
		JLabel lblAjuda = new JLabel("Ajuda: ");
		lblAjuda.setHorizontalAlignment(SwingConstants.LEFT);
		lblAjuda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAjuda.setBounds(10, 77, 100, 22);
		panelEstatisticas.add(lblAjuda);
		
		JLabel lblAcertos = new JLabel("Acertos: ");
		lblAcertos.setHorizontalAlignment(SwingConstants.LEFT);
		lblAcertos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAcertos.setBounds(10, 110, 100, 22);
		panelEstatisticas.add(lblAcertos);
		
		JLabel lblErros = new JLabel("Erros: ");
		lblErros.setHorizontalAlignment(SwingConstants.LEFT);
		lblErros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblErros.setBounds(10, 143, 100, 22);
		panelEstatisticas.add(lblErros);
		
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnConfirmar.setBounds(10, 263, 145, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnPular = new JButton("PULAR");
		btnPular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPular.setBounds(168, 263, 130, 23);
		contentPane.add(btnPular);
		
		JButton btnAjuda = new JButton("AJUDA");
		btnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjuda.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAjuda.setBounds(312, 263, 130, 23);
		contentPane.add(btnAjuda);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
}
