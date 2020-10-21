package ar.edu.ucc.arqSoft.baseService.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqSoft.common.model.GenericObject;

@Entity
@Table(name = "ALQUILER")
public class Alquiler extends GenericObject{

	@NotNull
	@Size(min = 1, max = 250)
	@Column(name = "FECHA")
	private Date fechaAlquiler;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="PELICULA_ID")
	private Pelicula pelicula;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SOCIO_ID")
	private Socio socio;

}
