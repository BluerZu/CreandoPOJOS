package ec.edu.uce.git.srv;

public class Test {

    public void saludo() {
        System.out.println("Hola, bienvenido a mi primer POJO con lombok.");
        //Creando al primer POJO:
        Persona p1 = new Persona();
        p1.setCedula("2233445566");
        p1.setNombres("Reigen");
        p1.setApellidos("Arataka");

        System.out.println("El primer POJO es: "+p1);

        //Creando el segundo POJO pasándole los valores del primero:
        Persona p2 = new Persona(p1.getCedula(),"Shigeo", "Kageyama","08-06-2023");
        System.out.println("El segundo POJO es: "+p2);

        //Modificando la cédula del segundo POJO:
        p2.setCedula("1223344556");
        System.out.println("El segundo POJO modificado es: "+p2);
    }
}
