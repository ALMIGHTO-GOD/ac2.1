public class ListaDobleCircular {
        private NodoDoble ini,fin;


    public ListaDobleCircular(){
        ini=fin=null;
    }
    public boolean insertar(char dato, int prio){
        NodoDoble nuevo = new NodoDoble(dato,prio);
        NodoDoble aux = ini;
        if(nuevo==null) return false;
        if(hayListaDobleVacia()){
            ini = fin = nuevo;
            return true;
        }
        //metodo de ordenamiento
        if(ini==fin){
            //elementos con el mismo numero de prioridad
        if(ini.getPrio()==nuevo.getPrio()){
                ini.setSig(nuevo);
                nuevo.setAnt(ini);
                fin=nuevo;
                return true;
            }        
        if(nuevo.getPrio()< ini.getPrio()){
        fin.setSig(nuevo);
        nuevo.setAnt(fin);
        fin= nuevo;
        return true;
        }
        }else{
        for (; aux != fin; aux = aux.getSig()) {
            if (nuevo.getPrio() > ini.getPrio()) {
            ini.setAnt(nuevo);
            nuevo.setSig(ini);
            ini = nuevo;
            return true;
        }   
        if (nuevo.getPrio()>aux.getSig().getPrio()) {
                    nuevo.setSig(aux.getSig());
                    nuevo.setAnt(aux);
                    aux.getSig().setAnt(nuevo);
                    aux.setSig(nuevo);
                    return true;
            }
        }
            if (aux == fin) {
                fin.setSig(nuevo);
                nuevo.setAnt(fin);
                fin = nuevo;
                fin.sig=ini;////////para hacerlo circular            
                return true;
            }
        }
        return false;
        }
    
    public boolean eliminar(){
        if(hayListaDobleVacia()) return false;
        if(hayUnSoloNodo()){
            fin.sig=null;//////para hacerlo circular
            ini=fin=null;
            return true;
        }
        NodoDoble temp = ini;
        ini = temp.getSig();
        ini.setAnt(null);
        temp.setSig(null);
        fin.sig = ini;////////para hacerlo circular
        temp = null;
        return true;
    }
    public boolean hayListaDobleVacia(){
        return ini==null && fin==null;
    }     
    public boolean hayUnSoloNodo(){
        return ini == fin;
    }

    public NodoDoble getIni() {
        return ini;
    }
}