package futbol;

// • Debe tener dos atributos públicos, golesMarcados de tipo short y dorsal de tipo byte.
// • Crear un constructor que dé valor a todos los atributos, incluidos los heredados y que
// use el de la clase padre.
// • Crear un constructor por defecto, que use el de la clase padre para los atributos
// heredados, y que ponga como golesMarcados 289 y como dorsal 7.

// • Implementar el respectivo método que impone implementar la interface comparable el
// cual debe retornar la diferencia de edad (en valor absoluto) entre el futbolista y otro
// futbolista (éste último se pasa como parámetro del método).

// • Añadir el código necesario a la clase para que cuando en una clase usuaria se haga
// System.out.println(elJugador) siendo elJugador un objeto de la clase Jugador, se
// imprima por pantalla lo siguiente: “El futbolista “+<nombre>+” tiene “+<edad>+ “, y
// juega de “+<posición>+” con el dorsal “+<dorsal>+ “. Ha marcado “+<goles>. Donde
// los parámetros entre <> deben tomar los valores apropiados para cada objeto.


public class Jugador extends Futbolista {
   
    public short golesMarcados;
    public byte dorsal;
    public Jugador (String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.dorsal = dorsal;
        this.golesMarcados = golesMarcados;
    }

    public Jugador() {
        super();
        this.dorsal = 7;
        this.golesMarcados = 289;
    }
   
    public int compareTo(Jugador o) {
        return Math.abs(this.getEdad() - o.getEdad());
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public int compareTo(Futbolista o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    @Override   
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + 
        ". Ha marcado " + this.golesMarcados;
    }

    public String elJugador(){
        return toString();
    }

    


}
