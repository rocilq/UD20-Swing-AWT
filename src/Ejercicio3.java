import javax.swing.*;

public class Ejercicio3 extends JFrame{
	private JPanel contentPane;

	public Ejercicio3() {
		setTitle("Encuesta");
		setBounds(400,200,900,500);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);

		// Etiqueta
		JLabel etiqueta = new JLabel("Elije un sistema operativo");
		etiqueta.setBounds(43,5,200,20);
		contentPane.add(etiqueta);

		// RadioButtons
		JRadioButton opcion1 = new JRadioButton("Windows", true);
		opcion1.setBounds(43,30,109,23);
		contentPane.add(opcion1);

		JRadioButton opcion2 = new JRadioButton("Linux", true);
		opcion2.setBounds(43,50,109,23);
		contentPane.add(opcion2);

		JRadioButton opcion3 = new JRadioButton("Mac", false);
		opcion3.setBounds(43,71,109,23);
		contentPane.add(opcion3);

		// Bgroup
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(opcion1);
		bgroup.add(opcion2);
		bgroup.add(opcion3);

		// Etiqueta 
		JLabel etiqueta2 = new JLabel("Elije tu especialidad");
		etiqueta2.setBounds(43,105,200,20);
		contentPane.add(etiqueta2);

		// Check box
		JCheckBox cbOpcion = new JCheckBox("Programación", true);
		cbOpcion.setBounds(43,125,109,23);
		contentPane.add(cbOpcion);

		JCheckBox cbOpcion2 = new JCheckBox("Diseño gráfico", false);
		cbOpcion2.setBounds(43,145,109,23);
		contentPane.add(cbOpcion2);

		JCheckBox cbOpcion3 = new JCheckBox("Administración", false);
		cbOpcion3.setBounds(43,166,150,23);
		contentPane.add(cbOpcion3);

		// Etiqueta 
		JLabel etiqueta3 = new JLabel("Horas dedicadas en el ordenador");
		etiqueta3.setBounds(43,210,200,20);
		contentPane.add(etiqueta3);


		// Slider
		JSlider horas = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
		horas.setBounds(43,220,200,90);
		horas.setInverted(false); 

		horas.setPaintTicks(true); 

		horas.setMajorTickSpacing(1);

		horas.setMinorTickSpacing(1);

		horas.setPaintLabels(true);

		contentPane.add(horas);


		//Ventana visible
		setVisible(true);
	}
}

