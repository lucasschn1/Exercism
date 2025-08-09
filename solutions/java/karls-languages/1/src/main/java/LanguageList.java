import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if (this.languages.size() == 0) {
            return true;
        } return false;
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    public String firstLanguage() {
        return this.languages.get(0);
    }

    public int count() {
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        for (String l : this.languages) {
            if (l.equals(language)) {
                return true;
            } 
        } return false;
    }

    public boolean isExciting() {
        for (String l : this.languages) {
            if (l.equals("Java") || l.equals("Kotlin")) {
                return true;
            } 
        } return false;
    }
}
