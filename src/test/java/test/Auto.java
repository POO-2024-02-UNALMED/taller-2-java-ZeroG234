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
        int count = 0;
        for(int i = 0; i < asientos.length; i++){
            if(asientos[i] != null){count++;};
        };
        return count;
    }

    String verificarIntegridad(){
        String original = "Auto original";

        if(registro != motor.registro){original = "Las piezas no son originales";}
        for(int i = 0; i < asientos.length; i++){
            if(asientos[i] != null){
                if(registro != asientos[i].registro){original = "Las piezas no son originales";};
            };
        };

        return original;
    }
}
