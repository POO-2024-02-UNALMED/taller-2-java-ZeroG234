package test;

public class Motor {
    static private String[] tiposValidos = {"gasolina", "electrico"};
    Integer numeroCilindros;
    String tipo;
    Integer registro;

    void cambiarRegistro(Integer nuevoRegistro){
        registro = nuevoRegistro;
    }

    void asignarTipo(String nuevoTipo){
        for(int i = 0; i < tiposValidos.length; i++){
            if(nuevoTipo == tiposValidos[i]){tipo = nuevoTipo;};
        }
    }
}
