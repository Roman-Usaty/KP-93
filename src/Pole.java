import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Pole extends JPanel {
    private Image shapka;
    private Image fon;
    public int x = 400;
    public Pole() {
        try {
            shapka = ImageIO.read(new File("./assets/hat.png"));
            fon = ImageIO.read(new File("./assets/fon.jpg"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Timer timerDraw = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timerDraw.start();
    }

    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.drawImage(fon, 0, 0, null);
        gr.drawImage(shapka, x, 465, null);
    }
}
