
package JSpinner09;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista09 extends JFrame{
    
    JSpinner spiValor;
    JLabel etiValor;

    public Vista09() {
        this.setTitle("JSPINNER");
        this.setSize(350, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        spiValor=new JSpinner();
        this.getContentPane().add(spiValor, new AbsoluteConstraints(70, 20, 150, 40));
        etiValor=new JLabel("");
        this.getContentPane().add(etiValor, new AbsoluteConstraints(70, 100, 150, 40));
        etiValor.setBorder(new LineBorder(Color.BLACK, 5, true));
        
    }
    public static void main(String[] args) {
        Vista09 v= new Vista09();
        v.setVisible(true);
    }
}
