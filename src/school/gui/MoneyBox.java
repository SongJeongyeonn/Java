package school.gui;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MoneyBox {
    public static JFrame frame;
    public static JPanel panel;

    public static void main(String[] args) {
        frame = new JFrame("자바 프로그램");
        frame.setSize(480,360);

        panel = new JPanel(new BorderLayout());
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(36,48,36,48));

        JTextField balance = new JTextField("0");
        balance.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        balance.setEditable(false);
        panel.add(balance);

        JTextField amount = new JTextField();
        amount.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        class DocumentAdapter implements DocumentListener{
            @Override
            public void insertUpdate(DocumentEvent e) {updateMessage();}
            @Override
            public void removeUpdate(DocumentEvent e) {updateMessage();}
            @Override
            public void changedUpdate(DocumentEvent e) {updateMessage();}
            private void updateMessage() {
                panel.putClientProperty("message", ((JTextField)panel.getComponent(1)).getText());
            }
        }
        amount.getDocument().addDocumentListener(new DocumentAdapter());
        panel.add(amount);

        panel.add(Box.createVerticalStrut(24));

        JButton button = new JButton("입금(+)/출금(-)");
        button.setFont(new Font("굴림",Font.PLAIN,32));
        button.setMaximumSize(new Dimension(
                amount.getMaximumSize().width,
                button.getMaximumSize().height));
        button.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String msg = (String)panel.getClientProperty("message");
                Integer amount = Integer.valueOf(msg);

                JTextField guiBalance = (JTextField)panel.getComponent(0);
                Integer balance = Integer.valueOf(guiBalance.getText());
                balance += amount;
                guiBalance.setText(balance.toString());

                System.out.println(balance);

                JOptionPane.showMessageDialog(frame, msg);
            }
        });

        panel.add(button, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);

        amount.requestFocus();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
