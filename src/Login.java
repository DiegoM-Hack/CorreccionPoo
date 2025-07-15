import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel principal;
    private JButton ingresarButton;
    private JButton clienteButton;
    private JTextField usuario;
    private JPasswordField clave;

    public Login() {

        setTitle("LOGIN");
        setSize(700, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(principal);
        setLocationRelativeTo(null);
        setVisible(true);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificar();
            }
        });
        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cliente();
            }
        });
    }

    private void verificar(){
        String u = usuario.getText();
        char[] pass = clave.getPassword();
        if (u.isEmpty() || pass.length == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (u.equals("cliente") && String.valueOf(pass).equals("123")) {
            Cliente cliente = new Cliente();
           ingresarButton.addActionListener(e -> verificar());

        }else if (u.equals("cajero") && String.valueOf(pass).equals("123")) {
            Cajero cajero = new Cajero();
            ingresarButton.addActionListener(e -> verificar());
        } else{
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
