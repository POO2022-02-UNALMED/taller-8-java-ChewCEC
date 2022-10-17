package futbol;
// • Tendrá los siguientes atributos privados: nombre de tipo String, edad de tipo int, y
// posicion de tipo String. posicion no debe poder cambiar de valor una vez establecida.

// • Debe tener un constructor para dar valor a los tres atributos anteriores.
// • Debe tener un constructor por defecto, que usando el anterior, cree un Futbolista de
// nombre “Maradona”, posición “delantero” y edad 30 años.

// • Añadir el código necesario a la clase para que cuando en una clase usuaria se haga
// System.out.println(elFutbolista) siendo elFutbolista un objeto de la clase Futbolista, se
// imprima por pantalla lo siguiente: “El futbolista “+<nombre>+” tiene “+<edad>+ “, y
// juega de “+<posicion>. Donde los parámetros entre <> deben tomar los valores
// apropiados para cada objeto.

// • Crear un método público boolean equals (Futbolista f) que determine si dos objetos
// Futbolista representan al mismo jugador (son iguales).

// • Debe tener un método público abstracto, jugarConLasManos, que se utilizará para
// devolver verdadero si el Futbolista puede jugar con las manos y falso en caso contrario
// (un futbolista sólo puede jugar con las manos si es de la clase Portero).

// • Crear los métodos get y set para obtener y dar valor al atributo.
public abstract class Futbolista implements Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;

    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean equals(Futbolista f) {
        return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);
    }

    public abstract boolean jugarConLasManos();

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;

    }

    public String elFutbolista() {
        return toString();
    }

    @Override
    public int compareTo(Futbolista f) {
        return 0;

    }



}
