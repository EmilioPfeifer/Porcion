package ventanas;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Alimento;
import modelo.Calculadora;
import modelo.TablaAlimento;

public class PanelCalculadoraComida extends JPanel {

    private JLabel textoIndicacion;
    private JButton btnCalcular;
    private JTextField txfGramosCalorias;
    private JLabel lblCaloriasComida;
    private TablaAlimento tablaAlimento;
    private Calculadora calculadora;

    public PanelCalculadoraComida() {
        initComponents();
    }

    private void initComponents() {

        this.setLayout(null);

        this.textoIndicacion = new JLabel("ingresar las calorias a consumir");
        this.txfGramosCalorias = new JTextField();
        this.btnCalcular = new JButton("Calcular");
        this.lblCaloriasComida = new JLabel("");

        this.textoIndicacion.setBounds(50, 50, 200, 20);
        this.txfGramosCalorias.setBounds(100, 90, 80, 20);
        this.btnCalcular.setBounds(90, 130, 100, 20);
        this.lblCaloriasComida.setBounds(100, 170, 80, 20);

        this.add(textoIndicacion);
        this.add(txfGramosCalorias);
        this.add(btnCalcular);
        this.add(lblCaloriasComida);
        this.setBackground(new Color(137, 208, 171));

    }

    public void calcularCalorias(Alimento alimento) {
        this.calculadora = new Calculadora();
        double caloriaAlimento = alimento.getCaloria();
        double gramos = Double.parseDouble(this.txfGramosCalorias.getText());
        String caloriasTotales = this.calculadora.calcularCaloriasAlimento(caloriaAlimento, gramos);
        this.lblCaloriasComida.setText(caloriasTotales);
    }

    public JLabel getLblCaloriasComida() {
        return lblCaloriasComida;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JTextField getTxfGramosCalorias() {
        return txfGramosCalorias;
    }
}
