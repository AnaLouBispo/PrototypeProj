package Models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // -> Definir classe
@NoArgsConstructor // -> Construtor
@Data // -> Para get and setters
public class Institution {
	@Id
	@GeneratedValue
	private Long idInstitution;
	 String nameInstitution;
	 String cnpjInstitution;
	 String unitInstution;  
	 
}
