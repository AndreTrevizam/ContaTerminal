import javax.swing.*;

public class Screen extends JFrame {
    public Screen() {

        setTitle("Deko's Bank");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel labelName = new JLabel();
        labelName.setText("Digite seu nome:");
        labelName.setBounds(20, 20, 100, 50);
        add(labelName);

        JTextField userName  = new JTextField(20);
        userName.setBounds(20, 60, 150, 30);
        add(userName);

        JLabel labelAgency = new JLabel();
        labelAgency.setText("Digite o número da agência:");
        labelAgency.setBounds(20, 90, 200, 50);
        add(labelAgency);

        JTextField userAgency = new JTextField();
        userAgency.setBounds(20, 130, 150, 30);
        add(userAgency);

        JLabel labelAccount = new JLabel();
        labelAccount.setText("Digite o número da sua conta:");
        labelAccount.setBounds(20, 170, 200, 30);
        add(labelAccount);

        JTextField userAccount = new JTextField();
        userAccount.setBounds(20, 200, 150, 30);
        add(userAccount);

        JLabel labelBalance = new JLabel();
        labelBalance.setText("Digite seu saldo:");
        labelBalance.setBounds(20, 240, 200, 30);
        add(labelBalance);

        JTextField userBalance = new JTextField();
        userBalance.setBounds(20, 270, 150, 30);
        add(userBalance);

        setVisible(true);
    }
}