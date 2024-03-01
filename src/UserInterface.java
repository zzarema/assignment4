class UserInterface implements Observer {
    private ShoppingCart cart;

    public UserInterface(ShoppingCart cart) {
        this.cart = cart;
        cart.addObserver(this);
    }

    @Override
    public void update() {

        System.out.println("Shopping cart updated:");
        for (ClothingItem item : cart.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }

    private double calculateTotal() {
        double total = 0;
        for (ClothingItem item : cart.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}