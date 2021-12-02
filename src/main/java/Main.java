
public class Main {

    public static void main(String[] args) {
        // словарь
        Dictionary dictionary = new Dictionary("English");
        // текст
        String foreignText = "Collections and streams, while bearing some superficial similarities, have different goals."
                            +" Collections are primarily concerned with the efficient management of, and access to, their elements.";
        // обработать строку текста
        dictionary.processText(foreignText);
        // вывод словаря в консоль
        dictionary.getWords().forEach(System.out::println);

    }
}
