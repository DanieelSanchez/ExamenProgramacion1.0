
package BarrasDeMenús11;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Vista11 extends JFrame{
    JMenuBar BarraMenus;
    JMenu menuArchivo, menuEdicion,menuInsertar, menuColores;
    JMenuItem itemAbrir, itemGuardar,itemSalir,cirAzul,cirVerde,cirRosa;
    
    

    public Vista11() {
        this.setTitle("BARRAS DE MENU");
        this.setSize(500, 450);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        BarraMenus= new JMenuBar();
        this.getContentPane().add(BarraMenus, new AbsoluteConstraints(10,10,200, 50));
        menuArchivo=new JMenu("ARCHIVO");
        menuInsertar=new JMenu("AYUDA");
        menuEdicion=new JMenu("DISEÑO");
        BarraMenus.add(menuArchivo);
        BarraMenus.add(menuInsertar);
        BarraMenus.add(menuEdicion);
        itemAbrir= new JMenuItem("ABRIR");
        itemGuardar= new JMenuItem("GUARDAR");
        itemSalir= new JMenuItem("SALIR");
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.add(itemSalir);
        menuArchivo.addSeparator();
        menuColores= new JMenu("COLORES");
        menuEdicion.add(menuColores);
        cirRosa= new JMenuItem("ROSA");
        cirVerde= new JMenuItem("VERDE");
        cirAzul= new JMenuItem("AZUL");
        menuColores.add(cirAzul);
        menuColores.addSeparator();
        menuColores.add(cirRosa);
        menuColores.addSeparator();
        menuColores.add(cirVerde);
        menuColores.addSeparator();
       
        
       
    }
    public static void main(String[] args) {
        Vista11 v=new Vista11();
        v.setVisible(true);
    }
    
}
