package mode.observer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author ws
 * @Date 2021/5/31 22:34
 */
// awt监听器也是观察者模式
public class JustTestFrame extends Frame{
    public void launch() {
        // source
        Button b = new Button("press me");

        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        this.add(b);
        this.pack();

        this.addWindowListener(new WindowAdapter(){

            // event
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JustTestFrame().launch();
    }

    // observer
    private class MyActionListener implements ActionListener { //Observer

        public void actionPerformed(ActionEvent e) {
            ((Button)e.getSource()).setLabel("press me again!");
            System.out.println("button pressed!");
        }

    }

    // observer
    private class MyActionListener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed 2!");
        }

    }
}
