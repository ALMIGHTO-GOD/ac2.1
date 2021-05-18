public class Prioridad {
    public char dato;
    public int prio;
    
    public Prioridad(char dato,int prio){
        
    }
    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    public String toString() {
        return "char : " + dato + ". Prioridad: " + prio;
    }    
}
