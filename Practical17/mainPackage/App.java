package mainPackage;

import java.awt.*;
import javax.swing.JFrame;

public class App extends Canvas{

    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        setForeground(Color.RED);

        //Drawing Rectangle
        g.drawRect(10, 10, 100, 50);
        g.drawString("Rectangle", 20, 80);

        //Drawing Oval
        g.drawOval(120, 10, 100, 50);
        g.drawString("Oval", 160, 80);

        //Drawing Line
        g.drawLine(230, 50, 300, 50);
        g.drawString("Line", 250, 80);
    }
    public static void main(String[] args) {
        App obj = new App();
        
        JFrame frame = new JFrame();
        frame.add(obj);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

}