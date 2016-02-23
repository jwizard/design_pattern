package fly_weight.en_wiki;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// fly_weight.en_wiki.Menu acts as a factory and cache for fly_weight.en_wiki.CoffeeFlavour flyweight objects
class Menu {
    private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<String, CoffeeFlavour>();

    CoffeeFlavour lookup(String flavorName) {
        if (!flavours.containsKey(flavorName))
            flavours.put(flavorName, new CoffeeFlavour(flavorName));
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}