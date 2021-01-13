package component;

import java.util.Observable;

public class DelegatedOBS extends Observable {
	public void clearChanged() {
		super.clearChanged();
	}
	
	public void setChanged() {
		super.setChanged();;
	}
	
	
}
