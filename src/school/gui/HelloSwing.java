package school.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloSwing {
    public static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame("자바 프로그램");
        frame.setSize(480,360);

        JLabel label = new JLabel("Hello, Swing!");
        label.setFont(new Font("Arial", Font.PLAIN,32));
        frame.add(label);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("GUI 창 종료");
            }
        });
    }
}
