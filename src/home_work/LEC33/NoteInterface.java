package src.home_work.LEC33;

import java.util.List;

public interface NoteInterface {
    void add(Note note);

    Note get(int id);

    List<Note> getAll();

    void update(Note note);

    void delete(int id);
}
