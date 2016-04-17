package me.codesky;

/**
 * Created by SkyAo on 16/4/17.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
