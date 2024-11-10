package test;

public class Asiento {
    static private String[] coloresValidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
    String color;
    Integer precio;
    Integer registro;

    void cambiarColor(String nuevoColor){
        for(int i = 0; i < coloresValidos.length; i++){
            if(nuevoColor == coloresValidos[i]){color = nuevoColor;};
        }
    }
}
