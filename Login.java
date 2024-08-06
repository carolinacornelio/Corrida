package Jogo;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Login = new JTextField();
		Login.setBounds(208, 214, 136, 26);
		contentPane.add(Login);
		Login.setColumns(10);
		
		
		
		
		
		JLabel Botao = new JLabel("");
		Botao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			if(!Login.getText().equals("")){
				JOptionPane.showMessageDialog(null,"GAME ON!");
				Jogo frame = new Jogo();
				frame.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,"Crie seu username!");
			}
			}
		});
		Botao.setIcon(new ImageIcon("C:\\Users\\202312260001\\Downloads\\Labirinto de carros (18).png"));
		Botao.setBounds(296, 195, 136, 163);
		contentPane.add(Botao);
		
		JLabel botaoLogin = new JLabel("New label");
		botaoLogin.setIcon(new ImageIcon("C:\\Users\\202312260001\\Downloads\\Labirinto de carros (16).png"));
		botaoLogin.setBounds(0, 0, 540, 525);
		contentPane.add(botaoLogin);
		  
		
		
		
		
		
	}
}
