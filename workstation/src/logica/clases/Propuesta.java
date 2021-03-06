package logica.clases;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import dataTypes.DtCategoria;
import dataTypes.DtPropuesta;
import dataTypes.TRetorno;

public class Propuesta {
	private String titulo;
	private String descripcion;
	private DtCategoria categoria;
	private String lugar;
	private Date fechaRealizacion;
	private Date fechaPublicacion;
	private float montoRequerido;
	private float montoReunido;
	private TRetorno tipoRetorno;
	private float precioEntrada;
	private String rutaImg;
	private List<Estado> estados; /*El primer elemento es el ultimo estado*/
	private String nickProponente;
	private List<Comentario> comentarios;
	private Date fechaExtension;
	private List<String> usuariosFavoritos;
	
	
	public Propuesta(String titulo, String descripcion, DtCategoria categoria, String lugar, Date fechaRealizacion,
			float montoRequerido, TRetorno tipoRetorno, float precioEntrada, String rutaImg, String nick) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.lugar = lugar;
		this.fechaRealizacion = fechaRealizacion;
		this.fechaPublicacion = null;
		this.fechaExtension = null;
		this.montoRequerido = montoRequerido;
		this.montoReunido = 0;
		this.tipoRetorno = tipoRetorno;
		this.precioEntrada = precioEntrada;
		this.rutaImg = rutaImg;
		this.estados = new ArrayList<Estado>();
		this.nickProponente = nick;
		this.comentarios = new ArrayList<Comentario>();
		this.usuariosFavoritos = new ArrayList<String>();
	}

	public void agregarUsuarioFavorito(String nickname){
		if (!usuariosFavoritos.contains(nickname))
			usuariosFavoritos.add(nickname);
	}
	
	public void eliminarUsuarioFavorito(String nickname){
		if (usuariosFavoritos.contains(nickname))
			usuariosFavoritos.remove(nickname);
	}
	
	public List<String> listarUsuariosFavorito(){
		return usuariosFavoritos;
	}
	
	public String getTitulo() {
		return this.titulo;
	}


	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public DtCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(DtCategoria categoria) {
		this.categoria = categoria;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Date getFechaRealizacion() {
		return this.fechaRealizacion;
	}

	public void setFechaRealizacion(Date fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}

	public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	public Date getFechaExtension() {
		return this.fechaExtension;
	}

	public void setFechaExtension(Date fechaExtension) {
		this.fechaExtension = fechaExtension;
	}

	public float getMontoRequerido() {
		return this.montoRequerido;
	}

	public void setMontoRequerido(float montoRequerido) {
		this.montoRequerido = montoRequerido;
	}

	public float getMontoReunido() {
		return montoReunido;
	}

	public void setMontoReunido(float montoReunido) {
		this.montoReunido = montoReunido;
	}

	public TRetorno getTipoRetorno() {
		return this.tipoRetorno;
	}

	public void setTipoRetorno(TRetorno tipoRetorno) {
		this.tipoRetorno = tipoRetorno;
	}

	public String getRutaImg() {
		return this.rutaImg;
	}

	public void setRutaImg(String rutaImg) {
		this.rutaImg = rutaImg;
	}
	
	public DtPropuesta getInfoPropuesta() {
		return new DtPropuesta(nickProponente, titulo, descripcion, categoria, lugar,
				fechaRealizacion, fechaPublicacion, fechaExtension, montoRequerido, montoReunido, tipoRetorno, precioEntrada, rutaImg, estados.get(0).getEstado(), usuariosFavoritos);
	}
	
	public void setEstado(Estado est){
		this.estados.add(0, est);
	}
	
	public List<Estado> getEstados(){
		return this.estados;
	}

	public float getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(float valorRetorno) {
		this.precioEntrada = valorRetorno;
	}
	
	public void comentar(String nickname, String comentario) {
		Comentario coment = new Comentario(nickname, comentario);
		this.comentarios.add(coment);
	}
	
	public List<Comentario> getComentarios(){
		return this.comentarios;
	}

	public void borrarPrimerEstado() {
		this.estados.remove(this.estados.size() - 1);
	}
}
