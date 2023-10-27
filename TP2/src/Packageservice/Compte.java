package Packageservice;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
public class Compte {
	
     private int code;
     private double solde ;; 
     private LocalDate date;
     
   public Compte(int code , double solde , LocalDate date)  {
	   
	   this.code=code;
	   this.solde=solde;
	   this.date=date;
   }
public String toString() {
	return "code : "+this.code+ "solde : "+this.solde+" date cration " +this.date;
}
     
}