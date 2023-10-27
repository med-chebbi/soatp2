package Packageservice;

import java.nio.charset.CoderMalfunctionError;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Banqueservice {
	
	public Compte compte;
  public ArrayList<Compte>Listecompte;
  
  public Banqueservice() {
	  this.Listecompte = new ArrayList<Compte>();
  }
 public double conversion(double montant) {
	 return montant*3.36;
 }
 
 public Compte getcompte(int code) {
	 return new Compte(code,0,LocalDate.now());
 } 
 public ArrayList<Compte> getComptes() {
	 ArrayList<Compte> ListeCompte = new ArrayList<Compte>();
	 ListeCompte.add(new Compte(10, 5000, LocalDate.now()));
	 ListeCompte.add(new Compte(11, 1500, LocalDate.now()));
	 return ListeCompte;
 }
 public static void main(String[] args) {
	 Banqueservice s = new Banqueservice();
	 
	 System.out.println(s.conversion(400));
	 System.out.println(s.getcompte(5));
	
	
 }
      
 
 }

