import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio4  extends JFrame{
	private JPanel contentPane;

	public Ejercicio4() {
		setTitle("MiniCalculadora");
		setBounds(400,200,900,500);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		// TextField
		JTextField textField = new JTextField();
		textField.setBounds(230,100,86,26);
		contentPane.add(textField);
		
		JTextField textField2 = new JTextField();
		textField2.setBounds(330,100,86,26);
		contentPane.add(textField2);
		
		JTextField textField3 = new JTextField();
		textField3.setBounds(460,100,86,26);
		contentPane.add(textField3);
		
		// Label
		
		JLabel etiqueta = new JLabel("=");

		etiqueta.setBounds(433,63,100,100);

		contentPane.add(etiqueta);
		
		// Buttons
		
		JButton suma = new JButton("Suma");
		suma.setBounds(230,200,80,23);
		contentPane.add(suma);
		suma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField2.getText());
				String resultado = num1 + num2 + " ";
				
				textField3.setText(resultado);
			}
		});
		
		JButton resta = new JButton("Resta");
		resta.setBounds(330,200,80,23);
		contentPane.add(resta);
		resta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField2.getText());
				String resultado = num1 - num2 + " ";
				
				textField3.setText(resultado);
			}
		});
		
		JButton multiplicacion = new JButton("Multiplicación");
		multiplicacion.setBounds(430,200,120,23);
		contentPane.add(multiplicacion);
		multiplicacion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField2.getText());
				String resultado = num1 * num2 + " ";
				
				textField3.setText(resultado);
			}
		});
		
		JButton division = new JButton("División");
		division.setBounds(560,200,80,23);
		contentPane.add(division);
		division.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField2.getText());
				String resultado = num1 / num2 + " ";
				
				textField3.setText(resultado);
			}
		});
		
		//Ventana visible
		setVisible(true);
	}
}
