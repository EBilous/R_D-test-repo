package src.home_work.LEC33;

import java.util.List;

public class NoteBook {
    public static void main(String[] args) {
        NoteInterface note = new NoteImpl();

        // Add note
        Note note1 = new Note("Eugene", "Перша нотатка");
        Note note2 = new Note("Max", "Друга нотатка");
        note.add(note1);
        note.add(note2);

        // Get note by ID
        Note retrievedNote = note.get(1);
        System.out.println("Отримана нотатка: " + retrievedNote.getContent());

        // Update note
        retrievedNote.setContent("Оновлена нотатка");
        note.update(retrievedNote);

        // Print all notes
        List<Note> allNotes = note.getAll();
        System.out.println("Всі нотатки:");
        for (Note singleNote : allNotes) {
            System.out.println(singleNote.getAuthor() + ": " + singleNote.getContent() + " | Created at: " + singleNote.getCreatedTime() + " | " + "Was edited: " + singleNote.getCreatedTime().equals(singleNote.getUpdatedTime()));
        }

        // delete note by ID
        note.delete(2);
    }
}
