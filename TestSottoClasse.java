/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testsottoclasse;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author SERGIO MURASCO
 */
public class TestSottoClasse {

    public static void main(String[] args) {
        String nome="";
        String cognome="";
        String Data="";
        float stip=0;
        int anni=0;
        boolean esito;
        Scanner sc= new Scanner(System.in);
        do{
            esito=true;
        
        try{
                System.out.println("Inserisci nome persona");
                nome=sc.nextLine();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Errore nell inserimento");
            System.out.println("Riprova a inserire i dati");
            esito=false;
        }}
        while(esito==false);
        do{
            esito=true;
            try{
                System.out.println("Inserisci cognome persona");
                cognome=sc.nextLine();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Errore nell inserimento");
                System.out.println("Riprova a inserire i dati");
                esito=false;
            }}
        while(esito==false);
            do{
                esito=true;
                try{
                    System.out.println("Inserisci lo stipendio");
                    stip=sc.nextFloat();
                }
                catch(InputMismatchException e){
                    System.out.println("Errore nell inserimento dati");
                    System.out.println("Rirpva a inserire i dati");
                    esito=false;
                }}
            while(esito==false);
        do{
            esito=true;
            try{
                System.out.println("Inserisci anni lavoro");
                anni=sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Errore nell inserimento dati");
                System.out.println("Riprova ad inserire i dati");
                esito=false;
            }}
        while(esito==false);
        
        do{
            esito=true;
            try{
               
                System.out.println("Inserisci la data");
                   sc.next();
                Data=sc.nextLine();
              
            }
            catch(InputMismatchException e){
                System.out.println("Errore nell inserimento dati");
                System.out.println("Riprova a inserire i dati");
                esito=false;
            }}
        while(esito==false);
        Persona p=new Persona(nome, cognome, Data);
        Date dt=null;
        System.out.println(p.toString());
         SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/aaaa");
       try{
           dt=sdf.parse(Data);
       }
       catch(Exception e)
       {
           System.out.println("Errore nel formato della data");
       }
        Dipendente d=new Dipendente(nome,cognome,dt,anni,stip);
        System.out.println(d.toString());
    }
}
