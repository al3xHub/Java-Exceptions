package es.studium.Ejercicio3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 implements WindowListener, ActionListener
{
	
	Frame ventana = new Frame("Calcular el IVA");
	
	Label lblCantidad = new Label("Introduzca la cantidad");
	Label lblPorcentaje = new Label("Introduzca el porcentaje");
	Label lblResultado = new Label("Resultado");
	
	TextField txtCantidad = new TextField(10);
	TextField txtPorcentaje = new TextField(3);
	TextField txtResultado = new TextField(10);
	
	Button btnCalcular = new Button("Calcular");
	
	Ejercicio3()
	{
		ventana.setLayout(new GridLayout(1, 7));
		
		ventana.add(lblCantidad);
		ventana.add(txtCantidad);
		ventana.add(lblPorcentaje);
		ventana.add(txtPorcentaje);
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		ventana.add(txtResultado);
		
		txtResultado.setEnabled(false);
		
		
		ventana.setSize(1100,60);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
		//Añadimos los Listener
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		
		
		
	}
	
	public static void main(String[] args)
	{
		new Ejercicio3();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		//solamente hay un botón, pero es buena práctica conocer cual ha sido pulsado.
		Object a =e.getSource();
		if(a.equals(btnCalcular))
		{
			try
			{
			//calculamos el porcentaje
			float resultado =
			Float.parseFloat(txtCantidad.getText())*Float.parseFloat(txtPorcentaje.getText())/(float)100.0;
			
			//Resetear los datos después de operación
			txtCantidad.selectAll();
			txtCantidad.setText("");
			
			txtPorcentaje.selectAll();
			txtPorcentaje.setText("");
			
			//Poner cursor de nuevo en cuadro de texto
			txtPorcentaje.requestFocus();
			
			//Transformamos resultado de float a cadena para mostrar el resultado
			txtResultado.setText(resultado+"");
			}
			
			catch(NumberFormatException nfe)
			{
				txtResultado.setText("Hay una letra escrita");
			}
			
			
			
			
		}
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
	}

}

