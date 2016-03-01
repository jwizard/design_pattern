package Fly_weight.en_wiki;

// Instances of fly_weight.en_wiki.CoffeeFlavour will be the Flyweights
class CoffeeFlavour {
    private final String name;

    CoffeeFlavour(String newFlavor) {
        this.name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }
}