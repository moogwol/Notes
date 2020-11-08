package notes;

public class Main {
    public static void main(String[] args) {
        Note note = new Note("this is my first note");
        System.out.println(note.getText());
        System.out.println(note.getDateCreated());
    }
}
