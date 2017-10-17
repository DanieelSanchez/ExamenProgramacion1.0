
package BarrasDeMenús11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Controlador11 implements ActionListener{
    Vista11 v;

    public Controlador11() {
        v= new Vista11();
        v.setVisible(true);
        v.cirAzul.addActionListener(this);
        v.cirRosa.addActionListener(this);
        v.cirVerde.addActionListener(this);
        
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==v.cirRosa){
            v.getContentPane().setBackground(Color.MAGENTA);
        }
        if (ae.getSource()==v.cirVerde){
            v.getContentPane().setBackground(Color.GREEN);
        }
        if (ae.getSource()==v.cirAzul){
            v.getContentPane().setBackground(Color.blue);
        }
    }
    public static void main(String[] args) {
        Controlador11 c= new Controlador11();
    }
}
