import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio1 extends JFrame{
	private JPanel contentPane;

	public Ejercicio1() {
		setTitle("Saludador");
		setBounds(400,200,900,500);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);


		// Etiqueta
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");

		etiqueta.setBounds(230,40,200,20);

		contentPane.add(etiqueta);

		// TextField
		JTextField textField = new JTextField();
		textField.setBounds(230,67,86,26);
		contentPane.add(textField);

		// Button
		JButton bSaludar = new JButton("¡Saludar!");
		bSaludar.setBounds(230,133,130,23);
		contentPane.add(bSaludar);

		bSaludar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = textField.getText();
				JOptionPane.showMessageDialog(null, "¡Hola " + nombre + "!");
			}
		});

		//Ventana visible
		setVisible(true);
	}
}
