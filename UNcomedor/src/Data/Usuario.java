package Data;
public class Usuario {
    public static String nombre; //apoyo total o parcial
    private String tipoApoyo;
    private String usuario;
    private String idUsuario;
    
    

    public Usuario(String nombre,  String idUsuario, String tipoApoyo, String usuario) {
        this.nombre = nombre;
        this.tipoApoyo = tipoApoyo;
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        
    }
    // public void setNombre(String nombre){
    //     this.nombre = nombre;
    // }
    public String getNombre() {
        return this.nombre;
    }
    public String getTipoApoyo() {
        return this.tipoApoyo;
    }
    public String getIdUsuario() {
        return this.idUsuario;
    }
    public String getUsuario() {
        return this.usuario;
    }

    public String toString()
	{
		return this.nombre;
	}

}
