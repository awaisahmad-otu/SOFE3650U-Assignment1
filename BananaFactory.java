public class BananaFactory extends GroceryProductFactory {
    @Override
    Fruit getFruit() {
        return new Banana();
    }
}
