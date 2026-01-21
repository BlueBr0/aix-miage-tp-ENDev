package fr.univ.amu.miage.m1.glq.tp.tp1.exo2.compte;

import fr.univ.amu.miage.m1.glq.tp.tp1.exo2.ExceptionSoldeInsuffisant;

public class CompteAnonyme {
		private static int nombreDeComptesCrees = 0;
		public static int nombreDeComptesUtilises = 0;
		private final int numero;
		//private static int inutile1;
		//private int inutile2;
		private double solde;
		private final String debutTexteErreur ;
		
		public CompteAnonyme( double montant) {
			numero = ++nombreDeComptesCrees;
			solde=montant;
			debutTexteErreur=new String("Opération sur le compte n°" + numero + " : ");
		}
		
		public CompteAnonyme( ) {
			this(0);
		}
				
		public double getSolde() {
			return solde;
		}
		
		public int getNumero() {
			return numero;
		}
		
		protected String getTypeToString() {
			return "Compte anonyme" ;
		}
		
		protected String finToString() {
			return ", solde = " + getSolde() + " euros";
		}
		
		@Override public String toString() {
			return getTypeToString() + " n°" + numero + finToString();
		}
		
		protected void afficheTexteErreur(String messageErreur) { 
			System.err.println( debutTexteErreur + messageErreur);
		}

		public boolean depot( double montant ) throws IllegalArgumentException  {
			boolean depotEffectue = false;
			if ( montant <= 0) throw new IllegalArgumentException("Montant invalide");
			else { solde += montant ; depotEffectue = true; }
			return depotEffectue;
		}

		public void retrait( double montant ) throws IllegalArgumentException {
			if ( montant <= 0) throw new IllegalArgumentException("Montant invalide");
			else solde -= montant ;
		}
		
		public static void virement( CompteAnonyme source, CompteAnonyme dest, double montant) throws ExceptionSoldeInsuffisant {
			if ( montant <= 0) throw new IllegalArgumentException("Montant invalide");
			else if ( montant > source.getSolde() ) throw new ExceptionSoldeInsuffisant();
			else if (dest.depot( montant)) source.retrait( montant);
		}
}	
