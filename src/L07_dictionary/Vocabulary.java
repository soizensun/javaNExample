package L07_dictionary;

public class Vocabulary {
    private String word;
    private String type;
    private String meaning;
    private String example;

    public Vocabulary(String word, String type, String meaning, String example) {
        this.word = word;
        this.type = type;
        this.meaning = meaning;
        this.example = example;
    }

    public String getWord() {
        return word;
    }
    public String getType() {
        return type;
    }
    public String getMeaning() {
        return meaning;
    }
    public String getExample() {
        return example;
    }
}
