
package JscrollBars10;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Vista10 extends JFrame{
    
    JScrollBar desValor;
    JLabel etiValor;
    
    public Vista10() {
        this.setTitle("JSPINNER");
        this.setSize(350, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        desValor=new JScrollBar(0);
        this.getContentPane().add(desValor, new AbsoluteConstraints(70, 20, 150, 20));
        desValor.setMinimum(50);
        desValor.setMaximum(155);
        desValor.setUnitIncrement(2);
        desValor.setBlockIncrement(20);
        desValor.setVisibleAmount(5);
        etiValor=new JLabel("");
        this.getContentPane().add(etiValor, new AbsoluteConstraints(70, 100, 150, 40));
        etiValor.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        
    }
    public static void main(String[] args) {
        Vista10 v= new Vista10();
        v.setVisible(true);
    }

    
    
}
