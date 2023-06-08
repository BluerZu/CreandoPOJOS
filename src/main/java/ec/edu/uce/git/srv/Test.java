package ec.edu.uce.git.srv;

public class Test {

    public void saludo() {
        System.out.println("Hola, bienvenido a mi primer POJO con lombok.");
        Persona p1 = new Persona();
        p1.setCedula("2233445566");
        p1.setNombres("Reigen");
        p1.setApellidos("Arataka");

        System.out.println(p1);

    }
}
