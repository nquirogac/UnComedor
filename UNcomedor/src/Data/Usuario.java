package Data;
public class Usuario {
    public String nombre; //apoyo total o parcial
    private String tipoApoyo;
    private String usuario;
    private String idUsuario;
    private Comedor comedor;
    
    

    public Usuario(String nombre,  String idUsuario, String tipoApoyo, String usuario, Comedor comedor ) {
        this.nombre = nombre;
        this.tipoApoyo = tipoApoyo;
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.comedor = comedor; 
        
    }
    public Comedor getComedor() {
        return comedor;
    }
    public void setComedor(Comedor comedor) {
        this.comedor = comedor;
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
