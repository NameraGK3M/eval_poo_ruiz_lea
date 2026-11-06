package exo_5;

public class JournalEvenements {
    public static instance;

    protected JournalEvenements() {}

    public static getInstance(*
        if (getInstance == null) {
            getInstance = new getInstance();
        }
        return getInstance; // c'est un sigletron mais j'ai plus la syntaxe exact mais c'est un truc du genre
    ){}
}