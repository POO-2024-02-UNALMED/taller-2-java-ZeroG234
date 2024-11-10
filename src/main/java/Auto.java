package test;

public class Auto {
    String modelo;
    Integer precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    Integer registro;
    static String cantidadCreados;

    Integer cantidadAsientos(){
        return asientos.length;
    }

    String verificarIntegridad(){
        String original = "Auto original";

        if(registro != motor.registro){original = "Las piezas no son originales";}
        for(int i = 0; i < asientos.length; i++){
            if(registro != asientos[i].registro){original = "Las piezas no son originales";};
        };

        return original;
    }
}
