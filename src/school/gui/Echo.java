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

public class Echo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("자바 프로그램");
        frame.setSize(480, 360);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(36, 48, 36, 48));

        JTextField textfield = new JTextField();
        textfield.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        class DocumentAdapter implements DocumentListener {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateMessage();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateMessage();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateMessage();
            }

            private void updateMessage() {
                panel.putClientProperty("message", ((JTextField) panel.getComponent(0)).getText());
            }
        }

        textfield.getDocument().addDocumentListener(new DocumentAdapter());
        panel.add(textfield);

        panel.add(Box.createVerticalStrut(24));

        JButton button = new JButton("버튼");
        button.setFont(new Font("굴림", Font.PLAIN, 32));
        button.setMaximumSize(new Dimension(textfield.getMaximumSize().width, button.getMaximumSize().height));
        button.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = (String) panel.getClientProperty("message");
                JOptionPane.showMessageDialog(frame, msg);
            }
        });
        panel.add(button, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}