public class AppleFactory extends GroceryProductFactory {
    @Override
    Fruit getFruit() {
        return new Apple();

    }
}
