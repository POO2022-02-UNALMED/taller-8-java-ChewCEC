package futbol;

// • Debe tener dos atributos públicos, golesRecibidos de tipo short y dorsal de tipo byte.
// • La posición deberá ser siempre “Portero” y podrá jugar con las manos
// • Crear un constructor que dé valor a todos los atributos sin asignar, incluidos los
// heredados y que use el de la clase padre.

// • Añadir el código necesario a la clase para que cuando en una clase usuaria se haga
// System.out.println(elJugador) siendo elJugador un objeto de la clase Portero, se
// imprima por pantalla lo siguiente: “El futbolista “+<nombre>+” tiene “+<edad>+ “, y
// juega de “+<posición>+” con el dorsal “+<dorsal>+ “. Le han marcado
// “+<golesRecibidos>. Donde los parámetros entre <> deben tomar los valores
// apropiados para cada objeto.

// • Implementar el respectivo método que impone implementar la interface comparable el
// cual debe retornar la diferencia de golesRecibidos (en valor absoluto) entre el Portero y
// otro Portero (éste último se pasa como parámetro del método).

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    public int compareTo(Object o) {
        return Math.abs(this.golesRecibidos - ((Portero) o).golesRecibidos);
    
    }

    public short getGolesRecibidos() {
        return this.golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal +
        ". Le han marcado " + this.golesRecibidos;
    }

    public String elJugador(){
        return toString();
    }



}
