package Models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // -> Definir classe
@NoArgsConstructor // -> Construtor
@Data // -> Para get and setters
@Getter
@Setter
public class Institution {
	@Id
	@GeneratedValue
	private Long idInstitution;
	private String nameInstitution;
	 private String cnpjInstitution;
	private String unitInstution;
	public Long getIdInstitution() {
		return idInstitution;
	}
	public void setIdInstitution(Long idInstitution) {
		this.idInstitution = idInstitution;
	}
	public String getNameInstitution() {
		return nameInstitution;
	}
	public void setNameInstitution(String nameInstitution) {
		this.nameInstitution = nameInstitution;
	}
	public String getCnpjInstitution() {
		return cnpjInstitution;
	}
	public void setCnpjInstitution(String cnpjInstitution) {
		this.cnpjInstitution = cnpjInstitution;
	}
	public String getUnitInstution() {
		return unitInstution;
	}
	public void setUnitInstution(String unitInstution) {
		this.unitInstution = unitInstution;
	}  
	 
	 
	 
	 
}
