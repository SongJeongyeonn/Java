package school.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class OneButton {
    public static JFrame frame;
    public static JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("자바 프로그램");
        frame.setSize(480,360);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(0x00FFFF));
        panel.setBorder(new EmptyBorder(36,48,36,48));

        JButton button = new JButton("버튼");
        button.setFont(new Font("굴림", Font.PLAIN,30));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "버튼 누름");
            }
        });
        panel.add(button, BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
