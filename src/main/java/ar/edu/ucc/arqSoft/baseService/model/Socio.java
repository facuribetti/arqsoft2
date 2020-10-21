package ar.edu.ucc.arqSoft.baseService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqSoft.common.model.GenericObject;


@Entity
@Table(name = "SOCIO")
public class Socio extends GenericObject {

	@NotNull
	@Size (min = 1, max = 100)
	@Column(name = "NOMBRE")
	private String nombre;
	
	@NotNull
	@Size (min = 1, max = 100)
	@Column(name = "APELLIDO")
	private String apellido;
	
	@NotNull
	@Column(name = "DNI")
	private int dni;
	
	@NotNull
	@Size (min = 1, max = 100)
	@Column(name = "EMAIL")
	private String email;
	
}
