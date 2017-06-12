package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


import net.sf.jcarrierpigeon.Notification;
import net.sf.jcarrierpigeon.NotificationQueue;
import net.sf.jcarrierpigeon.WindowPosition;

public class VentanaNotificacion extends JFrame implements ActionListener{
	Notification notificacion;
	PanelControl panelNotif;
	NotificationQueue mostrarNot;
 
	public VentanaNotificacion() {
		initComponentes();
	}

	private void initComponentes() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(350,200); 
	    this.setTitle("Control");
	    
		this.panelNotif = new PanelControl();
		this.add(panelNotif);
		this.setVisible(true);
		

		notificacion = new Notification(this, WindowPosition.BOTTOMRIGHT, 0, 0, 15000);
		mostrarNot = new NotificationQueue();


			mostrarNot.add(notificacion);
		}

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
		
		
		
		


	

}
