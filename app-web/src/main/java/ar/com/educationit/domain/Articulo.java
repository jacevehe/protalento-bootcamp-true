package ar.com.educationit.domain;
import java.util.Date;

public class Articulo {
	
	
	private Long id; 
	private String titulo; 
	private Date fechaCreacion; 
	private String codigo; 
	private Double precio; 
	private Integer stock; 
	private Long marcaId; 
	private Long categoriaId;
	
	
	public Articulo(String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock, Long marcaId,
			Long categoriaId) {
		super();
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}
	public Articulo(Long id, String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock,
			Long marcaId, Long categoriaId) {
		this.id = id;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Long getMarcaId() {
		return marcaId;
	}
	public void setMarcaId(Long marcaId) {
		this.marcaId = marcaId;
	}
	public Long getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", codigo=" + codigo
				+ ", precio=" + precio + ", stock=" + stock + ", marcaId=" + marcaId + ", categoriaId=" + categoriaId
				+ "]";
	}
	
	
	
	

}
