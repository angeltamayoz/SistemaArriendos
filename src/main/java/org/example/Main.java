package org.example;

import org.example.MODELOS.Apartamento;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("****************************");
        System.out.println("SISTEMA DE ARRIENDOS");
        System.out.println("****************************");

        System.out.println("\n Bienvenido !!!");

        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();

        System.out.print("Digite la dirección del apartamento: ");
        apartamento.setDireccion(lea.nextLine());

        System.out.print("Digite el tamaño del apartamento en metros cuadrados: ");
        apartamento.setTamaño(lea.nextDouble());

        System.out.print("Digite el número de habitaciones del apartamento: ");
        apartamento.setNumeroHabitaciones(lea.nextInt());

        System.out.print("Digite el número de baños del apartamento: ");
        apartamento.setNumeroBaños(lea.nextInt());

        System.out.print("Digite el precio mensual del apartamento: ");
        apartamento.setPrecioMensual(lea.nextDouble());

        System.out.println("Fecha de disponibilidad:");
        System.out.print("Año: ");
        Integer anio = lea.nextInt();

        System.out.println("Mes: ");
        Integer mes = lea.nextInt();

        System.out.println("Día: ");
        Integer dia = lea.nextInt();

        apartamento.setFechaDisponible(LocalDate.of(anio, mes, dia));

        System.out.println(apartamento);
    }
}