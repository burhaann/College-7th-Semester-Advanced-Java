import java.awt.*;
import java.awt.event.*;

class SampleChoice {
    /* Creates object of Frame, Choice, Label and Button. */
    Frame f;
    Choice ch;
    Label lb1;
    Button bt1;

    SampleChoice() {
        f = new Frame("Java AWT Choice Example");
        ch = new Choice();
        lb1 = new Label("Select your country from the Menu: ");
        /* Adding items in the list. */
        ch.add("Kashmir");
        ch.add("Australia");
        ch.add("America");
        ch.add("Russia");
        ch.add("France");
        ch.add("China");
        bt1 = new Button("Submit");
        /* Add label and choice menu on the Frame. */
        f.add(lb1);
        f.add(ch);
        f.add(bt1);
        /* Set properties of the Frame. */
        f.setLayout(new FlowLayout());
        f.setSize(260, 220);
        f.setVisible(true);
        
    }

    /* Driver Code */
    public static void main(String[] ar) {
        new SampleChoice();
    }
}