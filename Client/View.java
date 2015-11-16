package Client;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;


public class View {
	
	JFrame frame;
	JLabel labelM;
	JLabel labelC;
	
	
	public void gerarFrame(String m, String c){
		
		frame = new JFrame("Rotas");
		labelM = new JLabel();
		labelC = new JLabel();
		
		frame.setSize(800, 800);
		frame.setVisible(true);
		
		mostraMotorista(m);
		mostraCarona(c);
		
	}
	
	public void mostraMotorista(String m){
		
		labelM.setText("Lista de Motoristas");
		
		JTextArea textArea = new JTextArea(10,20);
		textArea.setText(m);
		
		this.frame.add(labelM);
		this.frame.add(textArea);
		
		labelM.setBounds(10, 10, 200, 30);
		textArea.setBounds(10, 60, 500, 300);
		
		
	}
	
	public void mostraCarona(String c){
		
		labelC.setText("Lista de Caronas");
		
		JTextArea textArea = new JTextArea(10,20);
		textArea.setText(c);
		
		this.frame.add(labelC);
		this.frame.add(textArea);
		
		labelC.setBounds(10, 350, 200, 50);
		textArea.setBounds(10, 400, 500, 300);
		
		
	}

}
