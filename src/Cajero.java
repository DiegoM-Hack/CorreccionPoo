import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cajero extends JFrame {
    private JPanel principal;
    private JTextField producto;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JTextField cantidad;
    private JTextArea textArea1;

    public Cajero() {
        setTitle("Cajero");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(principal);
        setLocationRelativeTo(null);
        setVisible(true);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Guardado exitosamente", "Error", JOptionPane.ERROR_MESSAGE);

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
        producto.setText("");
        cantidad.setText("");
    }

    private void guardar() {
        String producto = this.producto.getText();
        String cantidad = this.cantidad.getText();


    }
}
