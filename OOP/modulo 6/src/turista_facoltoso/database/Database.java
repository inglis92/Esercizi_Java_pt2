package turista_facoltoso.database;

import java.util.HashMap;
import java.util.HashSet;

import turista_facoltoso.entities.Abitazione;
import turista_facoltoso.entities.Feedback;
import turista_facoltoso.entities.Prenotazione;
import turista_facoltoso.entities.users.Utente;

public class Database {
    
    private static HashMap<Integer, Utente> utenti = new HashMap<>();
    private static HashMap<Integer, Abitazione> abitazioni = new HashMap<>();
    private static HashMap<Integer, Prenotazione> prenotazioni = new HashMap<>();
    private static HashMap<Integer, Feedback> feedbacks = new HashMap<>();

    private static HashMap<Integer, HashSet<Integer>> abitazioniHost = new HashMap<>();

    public static void addAbitazione(Abitazione ab){
        abitazioni.put(ab.getId(), ab);
        int idHost = ab.getHost();
        if (abitazioniHost.containsKey(idHost)) {
            HashSet<Integer> abitazioniVecchie = abitazioniHost.get(idHost);
            abitazioniVecchie.add(ab.getId());
            abitazioniHost.put(idHost, abitazioniVecchie);
        } else{
            HashSet<Integer> abitazioniVecchie = new HashSet<>();
            abitazioniVecchie.add(ab.getId());
            abitazioniHost.put(idHost, abitazioniVecchie);
        }

        
    }
    public static void removeAbitazione(int idAbitazione) {
        Abitazione ab = abitazioni.get(idAbitazione);
        int idHost = ab.getHost();
        HashSet<Integer> abitazioniDiQuestoHost = abitazioniHost.get(idHost);
        abitazioniDiQuestoHost.remove(idAbitazione);
        abitazioniHost.put(idHost, abitazioniDiQuestoHost);
        abitazioni.remove(idAbitazione);
        
    }
}

