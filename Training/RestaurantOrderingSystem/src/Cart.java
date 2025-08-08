package Java.Training.RestaurantOrderingSystem.src;

public class Cart extends Order {
    Cart(Customer customer) {
        super(customer);
    }

    public void removeItem(CartItem cartItem) {
        super.getAllItems().remove(cartItem);
    }

    public void updateQuantity(CartItem cartItem, int quantity) {
        for (OrderItem item : super.getAllItems()) {
            if (item.equals(cartItem)) {
                item.setQuantity(quantity);
                break;
            }
        }
    }
}

// add cheyyambazhum remove cheyyambazhum akka totalprice update cheyyanam okeee
