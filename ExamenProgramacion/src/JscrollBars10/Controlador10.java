package JscrollBars10;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador10 implements AdjustmentListener {

    Vista10 v;

    public Controlador10() {
        v = new Vista10();
        v.setVisible(true);
        v.desValor.addAdjustmentListener(this);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        v.etiValor.setText("El valor es: " + v.desValor.getValue());
    }

    public static void main(String[] args) {
        Controlador10 c = new Controlador10();
    }

}
