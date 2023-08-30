package Main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Relogio {
    private int tempoAtualEmSegundos;


    public Relogio(int horas, int minutos, int segundos) {
        definirTempo(horas, minutos, segundos);
    }


    public void definirTempo(int horas, int minutos, int segundos) {

        tempoAtualEmSegundos = horas * 3600 + minutos * 60 + segundos;
    }


    public void reiniciarMeiaNoite() {
        tempoAtualEmSegundos = 0;
    }


    public String marcarIntervalo(int horas, int minutos, int segundos, int horaFinal, int minutoFinal, int segundosFinal) {
       int tempoAtual = horas * 3600 + minutos * 60 + segundos;
       int tempoFinal = horaFinal * 3600 + minutoFinal * 60 + segundosFinal;
       if (tempoAtual > tempoFinal){
           tempoFinal += 24 * 3600;
       }
       return formato24(tempoFinal - tempoAtual);
    }


    public long tempoDecorrido() {
        return tempoAtualEmSegundos;
    }
    public String formato24(int horarioSegundos) {
        int horas = horarioSegundos / 3600;
        int minutos = (horarioSegundos % 3600) / 60;
        int segundos = horarioSegundos % 60;


        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }



    public String horaFormato24() {
        long horas = tempoAtualEmSegundos / 3600;
        long minutos = (tempoAtualEmSegundos % 3600) / 60;
        long segundos = tempoAtualEmSegundos % 60;

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }


    public String horaFormatoAMPM() {
        SimpleDateFormat formatoAMPM = new SimpleDateFormat("hh:mm:ss a");
        Date data = new Date((tempoAtualEmSegundos + 10800) * 1000L);
        return formatoAMPM.format(data);
    }
    public void tempoSistemaAtul(){
        Date data = new Date();


        SimpleDateFormat formatoHora = new SimpleDateFormat("HH");
        SimpleDateFormat formatoMinutos = new SimpleDateFormat("mm");
        SimpleDateFormat formatoSegundos = new SimpleDateFormat("ss");


        int hora = Integer.parseInt(formatoHora.format(data));
        int minutos = Integer.parseInt(formatoMinutos.format(data));
        int segundos = Integer.parseInt(formatoSegundos.format(data));


        int totalSegundos = hora * 3600 + minutos * 60 + segundos;

        System.out.println("Hora: " + hora);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
        System.out.println("Total de segundos: " + totalSegundos);
        tempoAtualEmSegundos = totalSegundos;
    }
}
