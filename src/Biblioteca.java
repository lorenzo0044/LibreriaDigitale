import java.util.*;

public class Biblioteca {


    List<Libro<?>> libreria = new ArrayList<>();
    Set<String> utenti = new HashSet<>();
    Map<String, Stack<Libro<?>>> prestiti = new HashMap<>();
    Queue<Libro<?>> libriDaRestituire = new LinkedList<>();

    public void aggiungiLibro(Libro<?> libro) {
        libreria.add(libro);
    }

    public <T> void rimuoviLibro(T id) {
        for (Libro<?> libro : libreria) {
            if (libro.getIsbn().equals(id)) {
                libreria.remove(libro);
                break;
            }

        }
    }
    public void registraUtente(String nome){
        utenti.add(nome);
    }

    public void prestaLibro(String utente, Libro<?> libro){
        if (prestiti.containsKey(utente)== false) {
            prestiti.put(utente, new Stack<>());
            prestiti.get(utente).push(libro);
            libreria.remove(libro);
        }else{
            prestiti.get(utente).push(libro);
            libreria.remove(libro);
        }


        }


    public void restituisciLibro(String utente){

        if (prestiti.containsKey(utente)){
            Libro<?> libroRientrato = prestiti.get(utente).pop();
            libriDaRestituire.offer(libroRientrato);
            libreria.add(libriDaRestituire.poll());
        }
    }



}
