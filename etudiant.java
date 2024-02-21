public class Etudiant{
    public String nom;
    public String prenom;
    public String code;
    public int id;
    public int noteE;
    public int age;
    public int notes;

    public Etudiant(){
        
    }

    public double calculerMoyenne() {
        double moyenne = (double) (noteE + notes) / 2;
        return moyenne;
    }
}