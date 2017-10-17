package JSpinner09;


import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador09 implements ChangeListener {

    Vista09 v;

    public Controlador09() {
        v = new Vista09();
        v.setVisible(true);
        v.spiValor.addChangeListener((ChangeListener) this);
        v.spiValor.getChangeListeners();
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(10);
        nm.setMinimum(0);
        nm.setStepSize(2); 
        v.spiValor.setModel(nm);

        

    }

    public static void main(String[] args) {
        Controlador09 c = new Controlador09();
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        v.etiValor.setText("El valor es: " + v.spiValor.getValue().toString());
    }

}
