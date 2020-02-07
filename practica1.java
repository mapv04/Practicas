import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Empleado{

    private String edificio;
    private String codigo;

    public Empleado(String edificio, String codigo) {
        this.edificio = edificio;
        this.codigo = codigo;
    }

    public String getEdificio() {
        return edificio;
    }

    public String getCodigo() {
        return codigo;
    }
}

public class Practica1 {

    public static void funcion(List<Empleado> lista){
        Map<String, Integer> map = new HashMap<>();
        Map<String, String> mapLugar = new HashMap<>();
        for(Empleado empleado : lista){
            if(!map.containsKey(empleado.getCodigo())){
                map.put(empleado.getCodigo(), 1);
                mapLugar.put(empleado.getCodigo(), empleado.getEdificio());
            }else{
                map.put(empleado.getCodigo(), map.get(empleado.getCodigo()) +1);
            }
        }

        imprimir(map, mapLugar);
    }

    public static void imprimir(Map<String, Integer> map, Map<String, String> mapLugar){
        for(String codigo : map.keySet()){
            System.out.println(mapLugar.get(codigo) + " | " + codigo + " | " + map.get(codigo));
        }

    }

    public static void main(String[] args) {
        List<Empleado> lista = new ArrayList<>();
        Empleado persona = new Empleado("HCL MINERVA","B1");
        Empleado persona1 = new Empleado("HCL VISTA","B2");
        Empleado persona2 = new Empleado("HCL MINERVA", "B1");
        Empleado persona3 = new Empleado("HCL VISTA", "B2");
        Empleado persona4 = new Empleado("HCL SKALIA", "B3");

        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);
        lista.add(persona);

        funcion(lista);

    }


}
