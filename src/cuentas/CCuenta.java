package cuentas;

public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    /**
     * Nombre del titular de la cuenta
     */
    private String nombre;
    
     /**
     * Identificador de la cuenta
     */
    private String cuenta;
    
     /**
     * Saldo actual de la cuenta
     */
    
    private double saldo;
     /**
     * Tipo de interés asociado a la cuenta 
     */
    private double tipoInterés;

    /**
     * Metodo constructor de la clase CCuenta
     */
    
    public CCuenta()
    {
    }
    
    /**
     * Metodo constructor de la clase CCuenta
     * 
     * @param nom nombre del titular de la cuenta
     * @param cue identificador de la cuenta 
     * @param sal saldo actual de la cuenta
     * @param tipo tipo de interés de la cuenta
     */
    
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo disponible en la cuenta
     * 
     * @return el saldo de la cuenta bancaria
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Al saldo de la cuenta se le suma la cantidad indicada y muestra por pantalla un mensaje en caso de no ser posible
     * 
     * @param cantidad suma de dinero que se quiere ingresar
     * @throws java.lang.Exception
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Al saldo de la cuenta se le retira la cantidad indicada y muestra por pantalla un mensaje en caso de no ser posible
     * 
     * @param cantidad suma de dinero que se quiere retirar
     * @throws Exception si no se puede realizar la retirada de la suma indicada
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
