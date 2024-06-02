import com.google.gson.annotations.SerializedName;
public class Moneda {
    @SerializedName("base_code")
    public String valorPartida;
    @SerializedName("target_code")
    public String valorllegada;
    @SerializedName("conversion_rate")
    public String conversion;
    @SerializedName("conversion_result")
    public String resultado;

    public void datos(int cantidad){
        System.out.println("1["+valorPartida+"] equivale a "+conversion+"["+valorllegada+"]");
        System.out.println("La conversión de "+cantidad+"["+valorPartida+"] a ["+valorllegada+"] es de "+resultado+"["+valorllegada+"]");
    }
}
