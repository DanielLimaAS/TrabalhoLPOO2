package pizza;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Janela extends JFrame{
	private JMenuBar menuBar;

	
	public Janela() {
		super("MegaPizza");
		setLayout(new FlowLayout());
		
		JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
		
		JMenu pedidoMenu = new JMenu("Pedido");
        JMenu queijosMenu = new JMenu("Queijos");
        JMenu carnesMenu = new JMenu("Carnes");
        JMenu vegetaisMenu = new JMenu("Vegetais");
        menuBar.add(pedidoMenu);
        menuBar.add(queijosMenu);
        menuBar.add(carnesMenu);
        menuBar.add(vegetaisMenu);
        
        pedidoMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}

        });
		
	}




}
