package Excecoes.Ex04.SolucaoRuim;

import Excecoes.Ex04.SolucaoMuitoRuim.Model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Numero do quarto");
        int numeroDoQuarto = input.nextInt();
        input.nextLine();
        System.out.println("Data de entrada");
        Date checkin = simpleDateFormat.parse(input.next());
        System.out.println("Data de saida");
        Date checkout = simpleDateFormat.parse(input.next());

        if (!checkout.after(checkin)) {
            System.out.println("A data de checkout precisa ser depois do checkin");
        } else {
            Reserva reserva = new Reserva(numeroDoQuarto, checkin, checkout);
            System.out.println(reserva);


            System.out.println("Atualização da data");
            System.out.println("Data de entrada");
            checkin = simpleDateFormat.parse(input.next());
            System.out.println("Data de saida");
            checkout = simpleDateFormat.parse(input.next());

            String erro = reserva.atualizaDatas(checkin, checkout);
            if (erro != null) {
                System.out.println("Erro ao realizar reserva." + erro);
            } else {
                System.out.println("Reserva atualizada" + reserva);
            }
        }
    }
}
