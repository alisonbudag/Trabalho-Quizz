package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		comboCategoria.addItem("Programming");
		contentPane.add(comboCategoria);
		
		JLabel lblJogar = new JLabel("JOGAR");
		lblJogar.setIcon(new ImageIcon("C:\\Users\\ALISONRAFAEL\\Desktop\\Java Fundamentos\\06 - Orienta\u00E7\u00E3o Objetos\\Trabalho Quizz\\resources\\jogar.png"));
		lblJogar.setBounds(221, 249, 130, 36);
		contentPane.add(lblJogar);
		lblJogar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				lblJogar.setIcon(new ImageIcon("C:\\Users\\ALISONRAFAEL\\Desktop\\Java Fundamentos\\06 - Orienta\u00E7\u00E3o Objetos\\Trabalho Quizz\\resources\\jogar.png"));
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				lblJogar.setIcon(new ImageIcon("C:\\Users\\ALISONRAFAEL\\Desktop\\Java Fundamentos\\06 - Orienta\u00E7\u00E3o Objetos\\Trabalho Quizz\\resources\\jogar2.png"));
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		setVisible(true);
	}
}
