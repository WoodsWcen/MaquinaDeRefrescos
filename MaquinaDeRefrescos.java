public class MaquinaDeRefrescos
{
    private int costo;
    private int cantidad;
    private int caja;

    public MaquinaDeRefrescos(int costo, int cantidad, int caja)
    {
       this.costo=costo;
       this.cantidad=cantidad;
       this.caja=caja;
    }
    
    public int getCosto(){
        return costo;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getCaja(){
        return caja;
    }
    
    public void setCosto(int costo){
        this.costo=costo;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public void setCaja(int caja){
        this.caja=caja;
    }
    
    public void solicitarRefresco(){
        if(cantidad>0){
            System.out.println("Refrescos disponibles");
        }else{
            System.out.println("Lo sentimos, no hay refrescos disponibles");
        }
    }
    
    public void actualizarPrecio(int costoActual){
        costo+=costoActual;
        System.out.println("Se ha actualizado precio: "+costoActual+" Bs");
    }
    
    public void llenarMaquina(int cantRefrescos){
        cantidad+=cantRefrescos;
        System.out.println("Se han llenado "+cantRefrescos+" refrescos");
    }
    
        public void entregarRefresco(){
        if(cantidad>0){
            caja+=costo;
            cantidad--;
            System.out.println("Dispensando un refresco");
        }
    }
}
