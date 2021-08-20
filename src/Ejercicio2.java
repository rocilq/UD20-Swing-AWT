import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio2 extends JFrame{
	private JPanel contentPane;

	public Ejercicio2() {
		setTitle("Películas");
		setBounds(100,200,800,400);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);


		// Etiqueta
		JLabel etiqueta = new JLabel("Escribe el título de una película");

		etiqueta.setBounds(100,40,200,20);

		contentPane.add(etiqueta);

		// TextField
		JTextField textField = new JTextField();
		textField.setBounds(100,67,86,26);
		contentPane.add(textField);

		// Segunda etiqueta

		JLabel etiqueta2 = new JLabel("Peliculas");

		etiqueta2.setBounds(500,40,200,20);

		contentPane.add(etiqueta2);

		// ComboBox
		JComboBox menu = new JComboBox<>();
		menu.setBounds(500,67,141,22);
		contentPane.add(menu);

		menu.addItem("Kill Bill");
		menu.addItem("Interestellar");
		

		// Button
		JButton bSaludar = new JButton("Añadir");
		bSaludar.setBounds(100,133,130,23);
		contentPane.add(bSaludar);

		bSaludar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pelicula = textField.getText();
				menu.addItem(pelicula);
			}
		});



		//Ventana visible
		setVisible(true);
	}
}
