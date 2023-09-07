
   
           
         

package com.mycompany.testsottoclasse;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
       
       try{
           SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
           DataNascita=sdf.parse(_DataNascita);
       }
       catch(ParseException e)
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

        






        




