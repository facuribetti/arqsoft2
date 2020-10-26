package ar.edu.ucc.arqSoft.baseService.dto;

import java.util.Date;

import ar.edu.ucc.arqSoft.common.dto.DtoEntity;

public class AlquilerResponseDto implements DtoEntity{
	
	private Date fecha;
	
	private Long peliculaId;
	
	private Long socioId;
	
	private String apellido;
	
	private String titulo;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getPeliculaId() {
		return peliculaId;
	}

	public void setPeliculaId(Long peliculaId) {
		this.peliculaId = peliculaId;
	}

	public Long getSocioId() {
		return socioId;
	}

	public void setSocioId(Long socioId) {
		this.socioId = socioId;
	}


}
