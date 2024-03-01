import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    interface Observable {
        void addObserver(Observer observer);
        void removeObserver(Observer observer);
        void notifyObservers();
    }
