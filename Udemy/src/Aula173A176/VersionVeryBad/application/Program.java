package Aula173A176.VersionVeryBad.application;

import Aula173A176.VersionVeryBad.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Room numberr:");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }else{
            Reservation reservation = new Reservation(number,checkIn,checkOut);
            System.out.println("Resevation: " + reservation);
            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyyy): ");
            checkOut = sdf.parse(sc.next());


            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }else{

                if(!checkOut.after(checkIn)){
                    System.out.println("Error in reservation: Check-out date must be after check-in date");
                }else {
                    reservation.updateDays(checkIn, checkOut);
                    System.out.println("Resevation updated: " + reservation);
                }
            }


        }



        sc.close();
    }



}
