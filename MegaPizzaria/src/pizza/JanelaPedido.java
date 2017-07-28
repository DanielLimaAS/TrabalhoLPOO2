package pizza;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaPedido extends Janela{
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	public JanelaPedido() {
		super();
				
		textField1 = new JTextField("Colors");
		add(textField1);
			
		textField2 = new JTextField();
		add(textField2);
			
		textField3 = new JTextField();
		add(textField3);
			
	}
	
	
	
}
