package logica.clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public abstract class Usuario {
	private String nickName; // Lo identifica
	private String password; 
	private String apellido;
	private String email; // Lo identifica
	private Date fechaNacimiento;
	private String rutaImg;
	private Map<String, Usuario> seguidores;
	private Map<String, Usuario> seguidos;
	private List<String> favoritas;

	public Usuario(){}
	 
	public Usuario(String nickName, String password, String nombre, String apellido, String email, Date fechaNacimiento,
			String rutaImg) {
		super();
		this.nickName = nickName;
		this.password = password; 
		this.apellido = apellido;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.rutaImg = rutaImg;
		this.seguidores = new HashMap<String, Usuario>();
		this.seguidos = new HashMap<String, Usuario>();
		this.favoritas = new ArrayList<String>();
		
	}

	public String getNickName() {
		return nickName;
	}

	public abstract String getNombre();
	
	public String getPassword(){
		return password;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getRutaImg() {
		return rutaImg;
	}

	public void addSeguidor(Usuario usuario){
		seguidores.put(usuario.getNickName(), usuario);
	}
	
	public void eraseSeguidor(Usuario usuario){
		seguidores.remove(usuario.getNickName());
	}
	
	public void addSeguido(Usuario usuario){
		seguidos.put(usuario.getNickName(), usuario);
	}
	
	public void eraseSeguido(Usuario usuario){
		seguidos.remove(usuario.getNickName());
	}
	
	public Collection<Usuario> getSeguidores(){
		Collection<Usuario> res = seguidores.values();
		return res;
	}
	
	public Collection<Usuario> getSeguidos(){
		Collection<Usuario> res = seguidos.values();
		return res;
	}
	
	public void marcarFavorita(String favorita) {
		if (!favoritas.contains(favorita))
			favoritas.add(favorita);
	}
	
	public void eliminarFavorita(String favorita){
		if (favoritas.contains(favorita))
			favoritas.remove(favorita);
	}
	
	public List<String> listarFavoritas(){
		return favoritas;
	}
}
