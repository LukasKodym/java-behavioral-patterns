package pl.lukas.observers;

import java.util.Observable;

public class ObservableTempValue extends Observable {

    private int oldTemp = 0;

    public int getOldTemp() {
        return oldTemp;
    }

    public void setValue(int newTemp) {
        if (newTemp != oldTemp) {
            super.setChanged();
            super.notifyObservers(newTemp);
            oldTemp = newTemp;
        }
    }
}