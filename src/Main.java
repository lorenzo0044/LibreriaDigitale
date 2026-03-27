import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Biblioteca miaBiblioteca = new Biblioteca();



        Libro storia = new Libro<>("Storia", "L102");
        Libro matematica = new Libro<>("Matematica", "L104");
        Libro chimica = new Libro<>("Chimica", "L101");
        Libro fisica = new Libro<>("Fisica", "L103");

        miaBiblioteca.aggiungiLibro(storia);
        miaBiblioteca.aggiungiLibro(matematica);
        miaBiblioteca.aggiungiLibro(chimica);
        miaBiblioteca.aggiungiLibro(fisica);

        miaBiblioteca.registraUtente("Giulio");
        miaBiblioteca.registraUtente("Marco");
        miaBiblioteca.registraUtente("Cesare");
        miaBiblioteca.registraUtente("Pierpaolo");

        Comparator<Libro<?>>  comparatore = new Comparator <Libro<?>> () {
            @Override
            public int compare(Libro<?> l1, Libro<?> l2) {
                return l1.getTitolo().compareTo(l2.getTitolo());}
        };
        miaBiblioteca.libreria.sort(comparatore);
        System.out.println("Libreria iniziale disponibile : "+miaBiblioteca.libreria);

        miaBiblioteca.prestaLibro("Marco", storia);
        System.out.println("Libreria dopo prestiti: "+miaBiblioteca.libreria);

        miaBiblioteca.prestaLibro("Cesare", matematica);
        System.out.println("Libreria dopo prestiti: "+miaBiblioteca.libreria);

        miaBiblioteca.prestaLibro("Pierpaolo", chimica);
        System.out.println("Libreria  dopo prestiti: "+miaBiblioteca.libreria);

        miaBiblioteca.prestaLibro("Giulio", fisica);
        System.out.println("Libreria  dopo prestiti: "+miaBiblioteca.libreria);



        miaBiblioteca.restituisciLibro("Marco");
        System.out.println("Libri restituiti: " +miaBiblioteca.libreria);

        miaBiblioteca.restituisciLibro("Giulio");
        System.out.println("Libri restituiti: " +miaBiblioteca.libreria);


        miaBiblioteca.restituisciLibro("Pierpaolo");
        System.out.println("Libri restituiti: " +miaBiblioteca.libreria);

        miaBiblioteca.restituisciLibro("Cesare");
        System.out.println("Libri restituiti: " +miaBiblioteca.libreria);






















    }
}