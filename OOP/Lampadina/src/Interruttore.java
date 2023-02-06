import lampadina.lampadina;

public class Interruttore {
    private status stato;
    private lampadina lamp;
    public Interruttore(lampadina lamp){
        this.lamp = lamp;
        stato = status.Spento;
    }
    public status premi(){
        if (stato == status.Spento) {
            stato = status.Acceso;
            lamp.click();

        }
        else if (stato == status.Acceso){
            stato = status.Spento;
            lamp.click();
        }
        return stato;
    }
    enum status{
        Acceso, Spento
    }
}
