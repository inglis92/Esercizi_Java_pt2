package serieA;

public class Classifica {
    protected int numeroSquadre;
    protected Squadra [] squadre;

    public Classifica(int numeroSquadre) {
        this.numeroSquadre = numeroSquadre;
    }

    public String getMigliorAttacco(){

        int maxGol = squadre[0].golFatti;
        for (int i = 1; i < squadre.length; i++) {
            if (squadre[i].golFatti >= maxGol){
                maxGol = squadre[i].golFatti;
                return squadre[i].getNome();
            }
        } return squadre[0].getNome();
    }
}
