package Excecoes.Ex04.SolucaoBoa;

import Excecoes.Ex04.SolucaoBoa.model.exceptions.DomainExceptions;
import Excecoes.Ex04.SolucaoMuitoRuim.Model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Numero do quarto");
            int numeroDoQuarto = input.nextInt();
            input.nextLine();
            System.out.println("Data de entrada");
            Date checkin = simpleDateFormat.parse(input.next());
            System.out.println("Data de saida");
            Date checkout = simpleDateFormat.parse(input.next());

            Reserva reserva = new Reserva(numeroDoQuarto, checkin, checkout);
            System.out.println(reserva);

            System.out.println("Atualização da data");
            System.out.println("Data de entrada");
            checkin = simpleDateFormat.parse(input.next());
            System.out.println("Data de saida");
            checkout = simpleDateFormat.parse(input.next());

            reserva.atualizaDatas(checkin, checkout);
            System.out.println("Reserva atualizada" + reserva);
        } catch (ParseException e) {
            System.out.println("Data invalida");
        } catch (DomainExceptions e) {
            System.out.println("Erro ao reservar" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado.");
        }
    }
}
