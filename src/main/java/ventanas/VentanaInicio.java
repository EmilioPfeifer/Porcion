package ventanas;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JFrame;

public class VentanaInicio extends JFrame implements ActionListener {

    private PanelBotonesMenu panelBotones;
    private PanelDatosPersona panelDatos;

    private PopupMenu popup ;
    private Image image;
    private TrayIcon trayIcon;
    private SystemTray systemTray;
    private MouseListener listenerMouse;

    public VentanaInicio() {
        initComponents();
        

    }

    private void initComponents() {
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 450);
        this.setTitle("Porcion Justa");

        this.setLocationRelativeTo(null);
        GridLayout distribution = new GridLayout(1, 2);
        this.setLayout(distribution);

        this.setBackground(Color.ORANGE);
this.setIconImage(null);
        this.panelBotones = new PanelBotonesMenu();
        this.panelDatos = new PanelDatosPersona();

        this.panelBotones.getBtnAgregarControl().addActionListener((ActionListener) this);
        this.panelBotones.getBtnGraficoControles().addActionListener((ActionListener) this);
        this.panelBotones.getBtnSalir().addActionListener((ActionListener) this);
        this.panelBotones.getBtnTablaComida().addActionListener((ActionListener) this);
        this.add(panelDatos, 0);
        this.add(panelBotones, 1);
        
        systemTray(this);
        this.setVisible(true);
    }

    private void systemTray( final JFrame frame) {
       
        Logger.getLogger(getClass().getName()).log(
            Level.INFO, "SystemTray");
        if (SystemTray.isSupported()) {
            this. popup = new PopupMenu();
            this.image = new ImageIcon("iconImage.png").getImage();
            this.trayIcon = new TrayIcon(image, "Mostrar notificación en java", popup);
            this.systemTray = SystemTray.getSystemTray();
            this.trayIcon.setImageAutoSize(true);

            this.listenerMouse = new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent evt) {
                    //al presionar con boton izquierdo del mouse reacciona
                    if (evt.getButton() == MouseEvent.BUTTON1 && frame.getExtendedState() == JFrame.ICONIFIED) {
                        MensajeTrayIcon("PorcionJusta  \n Ejecutandose", TrayIcon.MessageType.INFO);
                    }
                }
                @Override
                public void mouseEntered(MouseEvent evt) {/*nada x aqui circulen...*/
                }
                @Override
                public void mouseExited(MouseEvent evt) {/*nada x aqui circulen...*/
                }
               @Override
                public void mousePressed(MouseEvent evt) {/*nada x aqui circulen...*/
                }
                @Override
                public void mouseReleased(MouseEvent evt) {/*nada x aqui circulen...*/
                }
            };

            //se crean los listener para el menu de los  opUP
            ActionListener listenerSalir = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            };
            ActionListener listenerRestaurar = new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    if (frame.getExtendedState() == JFrame.ICONIFIED) {
                        frame.setVisible(true);
                        frame.setExtendedState(JFrame.NORMAL);
                        frame.repaint();
                    }
                }
            };

            //se cran los item de System tray y los listener que ocupan
            MenuItem exitAppItem = new MenuItem("Salir");
            exitAppItem.addActionListener(listenerSalir);
            popup.add(exitAppItem);

            MenuItem restoreAppItem = new MenuItem("Restaurar");
            restoreAppItem.addActionListener(listenerRestaurar);
            popup.add(restoreAppItem);

            trayIcon.addMouseListener(listenerMouse);

            try {
                systemTray.add(trayIcon);
            } catch (AWTException e) {
                System.err.println("Error:" + e.getMessage());
            }
        }else{
            System.err.println( "Error: SystemTray no es soportado" );
            return;
        }
         frame.addWindowListener(new WindowAdapter(){
        @Override
        public void windowIconified(WindowEvent e){
           frame.setVisible(false);//Se oculta JFrame
           //Se inicia una tarea cuando se minimiza           
           
        }
    });
    }

    public void MensajeTrayIcon(String texto, TrayIcon.MessageType tipo) {
        trayIcon.displayMessage("Informacion:", texto, tipo);
    }

    public void actionPerformed(ActionEvent e) {
        if (this.panelBotones.getBtnAgregarControl() == e.getSource()) {
            VentanaControl vc = new VentanaControl();
            this.setVisible(false);
            this.dispose();
            
        }
        if (this.panelBotones.getBtnTablaComida() == e.getSource()) {
            VentanaAlimentos va = new VentanaAlimentos();
            this.dispose();
        }
        if (this.panelBotones.getBtnGraficoControles() == e.getSource()) {
            VentanaGrafico vg = new VentanaGrafico(this.panelDatos.paciente);
            this.dispose();
        }
        if (this.panelBotones.getBtnSalir() == e.getSource()) {
            System.exit(0);

        }
    }
}
