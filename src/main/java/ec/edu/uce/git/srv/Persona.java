package ec.edu.uce.git.srv;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
public class Persona {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
}
/*
public class Persona {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
}
*/