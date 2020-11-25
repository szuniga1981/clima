package cl.sebastian.elclima;



public class DailyWeather {

    private String Ciudad;
    private String Fecha;
    private String imagenDeClima;
    private String Temperatura;
    private String grados;


    public DailyWeather(String ciudad, String fecha, String imagenDeClima, String temperatura, String grados) {
        Ciudad = ciudad;
        Fecha = fecha;
        this.imagenDeClima = imagenDeClima;
        Temperatura = temperatura;
        this.grados = grados;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getImagenDeClima() {
        return imagenDeClima;
    }

    public void setImagenDeClima(String imagenDeClima) {
        this.imagenDeClima = imagenDeClima;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String temperatura) {
        Temperatura = temperatura;
    }

    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados = grados;
    }

    @Override
    public String toString() {
        return "DailyWeather{" +
                "Ciudad='" + Ciudad + '\'' +
                ", Fecha='" + Fecha + '\'' +
                ", imagenDeClima='" + imagenDeClima + '\'' +
                ", Temperatura='" + Temperatura + '\'' +
                ", grados='" + grados + '\'' +
                '}';
    }

}