
       
   package com.mycompany.testsottoclasse;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


/*
 *
 * @author SERGIO MURASCO
 */
public class Dipendente extends Persona{
    private int AnniLavoro;
    private float Stipendio;
    
    public Dipendente(String _Nome, String _Cognome, Date _DataNascita, int _AnniLavoro, float _Stipendio)
    {
        super();
        super.setNome(_Nome);
        super.setCognome(_Cognome);
        super.setDataNascita(_DataNascita);
        this.AnniLavoro=_AnniLavoro;
        this.Stipendio=_Stipendio;
        
       
    }
   public String toString()
   {
     String  tmp=super.toString();
     tmp=tmp+"\n AnniDiLavoro"+AnniLavoro;
     tmp=tmp+"\n Stipendio"+Stipendio;
     return tmp;
   }
}
