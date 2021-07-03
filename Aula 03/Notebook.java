import java.util.ArrayList;

public class Notebook {
	
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

   // Metodo construtor
    public Notebook() {
        notes = new ArrayList<String>();
    }

    // Armazena um note
    public void storeNote(String note) {
        notes.add(note);
    }

    // Retorna a quantidade de notes
    public int numberOfNotes() {
        return notes.size();
    }

    // Busca por indice
    public void showNote(int noteNumber) {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }
}
