
package proyecto;


public class ListaUsuarios {
    private int nUsuario;
    private Usuario[] Usuarios;
    
    public ListaUsuarios(){
        this.nUsuario=0;
        Usuarios = new Usuario[10];
    }
    public boolean agregarUsuario(Usuario us){
        boolean r= false;//Creamos una variable de tipo booleana que nos servirà de bandera.
        if(this.nUsuario<10){//Condicionamos que el numero de usuario no sea mayor que 10.
            r=true;//Si cumple con la condicion la bandera cambia a true.
            Usuarios[this.nUsuario]=us;//Y agregamos el parametro recibido en el arreglo.
            this.nUsuario++;//luego aumentamos el numero de usuarios.
        }
        return r; //Retornamos verdadero si nUsuarios es menor a 10 y falso si no. 
    }
    
    public Usuario obtenerUsuario(int index){
        if(index<0 || index>10){//Condicionamos que el indice este dentro del rango del arreglo
            return null;
        }else{
            return Usuarios[index];//Si el indice recibido esta dentro del rango, retornamos el Usuario en
            //ese lugar.
        }
    }
    
    public int getnUsuario() {
        return nUsuario;
    }
}
