import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Okno extends JFrame {
    private Pole gameP;

    private class myKey implements KeyListener {
        @Override
        public void keyReleased(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {
            int _key = e.getKeyCode();

        }

        @Override
        public void keyTyped(KeyEvent e) {}
    }

    public Okno() {
        addKeyListener(new myKey());

        setFocusable(true);
        setBounds(0,0,800,600);
        setTitle("Игра: Новогодний дождь");

        gameP = new Pole();
        Container con = getContentPane();
        con.add(gameP);

        setVisible(true);
    }
}
