package Main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(15, 14, 0);
        Scanner scanner = new Scanner(System.in);
            int flag = 0;
            int choice;
            while (flag != 1){
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Digite os seguintes números para obter:");
                System.out.println("1: Definir tempo atual do relogio");
                System.out.println("2: Reiniciar para meia noite");
                System.out.println("3: Calcular diferença de tempo");
                System.out.println("4: Atualizar relógio para o do SO");
                System.out.println("5: Segundos desde de a última marcação");
                System.out.println("6: Sair");

                choice = scanner.nextInt();
            switch (choice){
                case 1:
                  relogio.definirTempo(11, 6, 20);
                    System.out.println("Tempo atual no formato 24h: " + relogio.horaFormato24());
                    System.out.println("Tempo atual no formato AM/PM: " + relogio.horaFormatoAMPM());
                    break;
                case 2:
                    relogio.reiniciarMeiaNoite();
                    System.out.println("Tempo atual no formato 24h: " + relogio.horaFormato24());
                    System.out.println("Tempo atual no formato AM/PM: " + relogio.horaFormatoAMPM());
                    break;
                case 3:
                    System.out.println("Quanto tempo passou: " + relogio.marcarIntervalo(2, 2, 20, 5, 15, 30));
                    break;
                case 4:
                    relogio.tempoSistemaAtul();
                    break;
                case 5:
                    System.out.println("Tempo decorrido desde a marcação: " + relogio.tempoDecorrido() + " segundos");
                    break;
                case 6:
                    flag = 1;
                    break;
            }
            }





        }
    }
