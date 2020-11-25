package cl.sebastian.elclima;



public class DailyWeather {

     String Ciudad;
     String Fecha;
     int imagenDeClima;
     String Temperatura;
     String grados;


    public DailyWeather(String ciudad, String fecha, int imagenDeClima, String temperatura, String grados) {
       this.Ciudad = ciudad;
        this.Fecha = fecha;
        this.imagenDeClima = imagenDeClima;
        this.Temperatura = temperatura;
        this.grados = grados;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        this.Ciudad= ciudad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

    public int getImagenDeClima() {
        return imagenDeClima;
    }

    public void setImagenDeClima(int imagenDeClima) {
        this.imagenDeClima = imagenDeClima;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.Temperatura = temperatura;
    }

    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados = grados;
    }

   /* @Override
    public String toString() {
        return "DailyWeather{" +
                "Ciudad='" + Ciudad + '\'' +
                ", Fecha='" + Fecha + '\'' +
                ", imagenDeClima='" + imagenDeClima + '\'' +
                ", Temperatura='" + Temperatura + '\'' +
                ", grados='" + grados + '\'' +
                '}';*/
    }

