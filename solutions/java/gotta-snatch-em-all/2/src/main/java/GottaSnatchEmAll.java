import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        // checking common cards
        Set<String> myUniqueCard = new HashSet<>(myCollection);
        myUniqueCard.removeAll(theirCollection);

        Set<String> theirUniqueCard = new HashSet<>(theirCollection);
        theirUniqueCard.removeAll(myCollection);

        return !myUniqueCard.isEmpty() && !theirUniqueCard.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return new HashSet<>();
        }
        Set<String> commonCards = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            commonCards.retainAll(collections.get(i));
        }
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return new HashSet<>();
        }
        Set<String> allCards = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            allCards.addAll(collections.get(i));
        }

        return allCards;
    }
}
