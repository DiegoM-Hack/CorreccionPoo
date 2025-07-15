import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends JFrame {
    private JPanel principal;
    private JTextField nombre;
    private JTextField cedula;
    private JTextField edad;
    private JButton limpiarButton;
    private JButton guardarButton;


    public Cliente() {

        setTitle("Cliente");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(principal);
        setLocationRelativeTo(null);
        setVisible(true);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });

    }

    private void limpiar() {
        nombre.setText("");
        cedula.setText("");
        edad.setText("");
    }

    private void verificar(){
        String n = nombre.getText();
        String c = cedula.getText();
        String e = edad.getText();
        int d = Integer.parseInt(edad.getText());

        if (n.isEmpty() || c.isEmpty() || e.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (d >= 18) {
            JOptionPane.showMessageDialog(this, "Datos Guardados.", "Exito", JOptionPane.WARNING_MESSAGE);

        } else{
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
