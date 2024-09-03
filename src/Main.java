import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel MainPanel;
    private JLabel labelCliente;
    private JTextField nomeCliente;
    private JLabel labelAgencia;
    private JTextField textAgencia;
    private JLabel labelNumero;
    private JTextField numeroConta;
    private JLabel labelSaldo;
    private JTextField saldoConta;
    private JButton confirmarButton;

    public Main() {
        setContentPane(MainPanel);
        setTitle("Deko's Bank");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);


        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeCliente.getText();
                String agencia = textAgencia.getText();
                int conta = Integer.parseInt(numeroConta.getText());
                double saldo = Double.parseDouble(saldoConta.getText());

                JOptionPane.showMessageDialog(Main.this, "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
