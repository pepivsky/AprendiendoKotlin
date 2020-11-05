package interoperabilidad;

public class MainJava {
    public static void main(String[] args) {
        //FunctionsKotlinKt.displayGreeting("Hola"); //funcion llamada desde Kotlin
        ClaseKotlinFun.displayGreeting("Hola de nuevo");
        //llamando a la funcion con parametro por defecto
        ClaseKotlinFun.display("mensaje", 2);
        ClaseKotlinFun.display("msg"); //el valor de num sera 1 del valor por defecto de Kotlin
    }
}
