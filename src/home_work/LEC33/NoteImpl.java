package src.home_work.LEC33;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NoteImpl implements NoteInterface{
    private final Map<Integer, Note> notes = new ConcurrentHashMap<>();
    private int nextId = 1;

    @Override
    public void add(Note note) {
        note.setId(nextId++);
        notes.put(note.getId(), note);
    }

    @Override
    public Note get(int id) {
        return notes.get(id);
    }

    @Override
    public List<Note> getAll() {
        return new ArrayList<>(notes.values());
    }

    @Override
    public void update(Note note) {
        if (notes.containsKey(note.getId())) {
            note.setUpdatedTime(new Date());
            notes.put(note.getId(), note);
        }
    }

    @Override
    public void delete(int id) {
        notes.remove(id);
    }
}
