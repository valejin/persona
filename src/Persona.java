//costruttore della classe
//parola chiave 'this'

public class Persona {
    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;    //'this' serve per specificare che sto passando i parametri della funzione chiamata ai parametri della istanza
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
    }

    //metodo
    void saluta() {
        System.out.println("Ciao sono " + nome);
    }

    void cammina() {
        System.out.println("Sto camminando ...");
    }
}
