/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package com.mycompany.testsottoclasse;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * .
 *
 * @author SERGIO MURASCO
 */
public class Persona {
    private String Nome;
    private String Cognome;
    private Date DataNascita;
    
    public Persona(){}
    
   public Persona(String _Nome, String _Cognome, String _DataNascita)
   {
       this.Nome=_Nome;
       this.Cognome=_Cognome;
       SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/aaaa");
       try{
           DataNascita=sdf.parse(_DataNascita);
       }
       catch(Exception e)
       {
           System.out.println("Errore nel formato della data");
       }
   }
       
       public Persona(String _Nome, String _Cognome, Date _DataNascita){
           this.Nome=_Nome;
           this.Cognome=_Cognome;
           this.DataNascita=_DataNascita;
       }
   
           
         public void setNome(String x)
{
this.Nome=x;
}
public String getNome()
{
return Nome;
}

public void setCognome(String x)
{
this.Cognome=x;
}
public String getCognome()
{
return Cognome;
}
public void setDataNascita(Date x)
{
    this.DataNascita=x;
}
public Date getDataNascita()
{
    return DataNascita;
}



public String toString()
{

String tmp;

tmp="Dati della persona";
tmp=tmp+"Cognome"+Cognome;
tmp=tmp+"\nNome"+Nome;
tmp=tmp+"\nDataNascita"+DataNascita;
return tmp;
}

}

        




