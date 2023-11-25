public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

        pizza = chicagoStore.orderPizza("cheese");

        pizza = nyStore.orderPizza("veggie");

        pizza = chicagoStore.orderPizza("clam");
    }
}