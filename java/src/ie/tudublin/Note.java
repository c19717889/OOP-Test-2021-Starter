/*
Name - Alan Murphy
Student Number - C19717889
OOP Labtest - 21/04/21
Lecturer - Dr Bryan Duggan
*/

package ie.tudublin;

//import processing.data.TableRow;

public class Note {

    //private fields for class Note 
    private char note;
    private int duration;

    

    //Default constructor that takes no parameters
    public Note()
    {

    }

    //Note object to get every row from the table and creates the note from a table row
    //and instanciates the note from a single row on the table
    /*public Note(TableRow row)
    {
        this(
            row.getString("Note"),
            row.getInt("Duration"),
            row.getString("Type")
        );

    }*/

    //Parameterised contructor that takes default values from the fields in class note
    public Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
    }

    //Getters & Setters
    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //to String
    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }

    

  

    


    
}
