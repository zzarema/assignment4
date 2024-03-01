import java.util.ArrayList;
import java.util.List;
class ShoppingCart implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<ClothingItem> items = new ArrayList<>();

    public void addItem(ClothingItem item) {

        for (ClothingItem existingItem : items) {
            if (existingItem.getName().equals(item.getName())) {
                existingItem.setPrice(item.getPrice());
                notifyObservers();
                return;
            }
        }

        items.add(item);
        notifyObservers();
    }

    public void removeItem(ClothingItem item) {
        items.remove(item);
        notifyObservers();
    }

    public List<ClothingItem> getItems() {
        return items;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}