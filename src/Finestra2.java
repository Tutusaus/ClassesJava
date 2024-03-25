import java.awt.*;
import java.awt.event.*;

public class Finestra extends Frame implements ActionListener,KeyListener,WindowListener {
	Button b=new Button("->");
	Button b2=new Button("<-");
	TextField t_euros=new TextField(20);
	TextField t_dollars=new TextField(20);
	public static void main(String[] args) {
		new Finestra();
	}
	Finestra(){
		super("Finestra");	//Crida al constructor de la classe pare "Frame"
		setLayout(new FlowLayout());
		add(t_euros);
		t_euros.addKeyListener(this);
		add(b);
		b.addActionListener(this);
		add(b2);
		b2.addActionListener(this);
		add(t_dollars);
		t_dollars.addKeyListener(this);
		setVisible(true);
		setSize(500, 500);
		addWindowListener(this);
	}
	
	void euros2dollars() {
		String s=t_euros.getText();
		double d=Double.parseDouble(s);
		d*=0.99;	//d=d*0.99;
		s=Double.toString(d);
		t_dollars.setText(s);
	}
	void dollars2euros() {
		String s=t_dollars.getText();
		double d=Double.parseDouble(s);
		d/=0.99;	// d=d/0.99;
//		s=Double.toString(d);
		t_euros.setText(d+"");		//Conversi� m�s senzilla. Aix� crida impl�citament a Double.toString(d)
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b) {
//			System.out.println(t.getText());
			euros2dollars();
		}
		if (e.getSource()==b2) {
//			System.out.println("Bot�2 premut");		System.out.println("El resultat �s:"+res);
			dollars2euros();
		}
			
	}
	@Override
	public void keyPressed(KeyEvent arg0) {	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getSource()==t_euros) {
			try {
				euros2dollars();
			} catch(NumberFormatException e) {
				t_dollars.setText("");
			}
		}
		if (arg0.getSource()==t_dollars) {
			try {
				dollars2euros();
			} catch(NumberFormatException e) {
				t_euros.setText("");
			}
		}
		
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		/*f.*/dispose();		//Tanca nom�s la finestra actual.
//		System.exit(0);		//Finalitza l'aplicaci�
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}