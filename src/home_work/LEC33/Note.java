package src.home_work.LEC33;
import java.util.Date;
import java.util.Objects;

public class Note {
    private int id;
    private String author;
    private String content;
    private Date createdTime;
    private Date updatedTime;

    // Конструктор
    public Note(String author, String content) {
        this.author = author;
        this.content = content;
        this.createdTime = new Date();
        this.updatedTime = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Note note = (Note) o;

        if (id != note.id) {
            return false;
        }
        if (!Objects.equals(author, note.author)) {
            return false;
        }
        if (!Objects.equals(content, note.content)) {
            return false;
        }
        if (!Objects.equals(createdTime, note.createdTime)) {
            return false;
        }
        return Objects.equals(updatedTime, note.updatedTime);
    }

    @Override public int hashCode() {
        int result = id;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        return result;
    }
}
