package OOP.enumeration;

public enum Country {
    JAPAN("Japan", 125_800_000, "Japanese"),
    GREECE("Greece", 10_700_000, "Greek"),
    ARGENTINA("Argentina", 45_800_000, "Spanish");

    // Constants 👇
    private final String name;
    private final long peopleCount;
    private final String language;

    // Constructor 👇
    Country(String name, long peopleCount, String language) {
        this.name = name;
        this.peopleCount = peopleCount;
        this.language = language;
    }

    // Getters for fields 👇
    public String getName() {
        return name;
    }

    public long getPeopleCount() {
        return peopleCount;
    }

    public String getLanguage() {
        return language;
    }

    // Override: toString 👇
    @Override
    public String toString() {
        return "🌍 " + name + " | 👥 " + String.format("%,d", peopleCount) + " | 🗣️ " + language + "\n";
    }
}