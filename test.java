class Coche {
    public String marca;
    public String modelo;
    public String color;

    public Coche(String initMarca, String initModelo, String initColor) {
        marca = initMarca;
        modelo = initModelo;
        color = initColor;
    }

    public void propiedades() {
        System.out.println("Marca:\t"+marca);
        System.out.println("Modelo:\t"+modelo);
        System.out.println("Color:\t"+color);

    }

}


class test {

    public static void main(String[] args) {
        Coche test = new Coche("Seat","Ibiza", "Negro");
        test.propiedades();

    }
}
