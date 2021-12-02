import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {
    private String name;
    private List<String> words = new ArrayList<>();
    // конструктор
    public Dictionary(String name) {
        this.name = name;
    }
    // геттеры-сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getWords() {
        return words;
    }
    // подготовить текст для обработки (чистая функция)
    public String prepareText(String text) {
        return text.replaceAll("[^A-zА-я ]", "")
                .toLowerCase();
    }
    // обработать строку текста
    public void processText(String text) {
        // массив слов текста
        String[] textWords = prepareText(text).split(" ");
        // список уникальных слов текста (монады)
        List<String> listTextWords =
                Arrays.stream(textWords).distinct()
                .collect(Collectors.toList());
        // добавление новых слов в словарь
        for(String x : listTextWords) {
            if(!words.contains(x)) words.add(x);
        }
        // сортировка
        Collections.sort(words);
    }
}
