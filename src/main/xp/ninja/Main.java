package main.xp.ninja;

import exercice1.Etudiant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Etudiant xEtudiant = new Etudiant();
		        xEtudiant.setStudendName("Kiran");
		        xEtudiant.setStudendRollNo(4);
		        xEtudiant.setStudentID(12345);

		        System.out.println("Student's Name : " + xEtudiant.getStudendName());
		        System.out.println("Student's RollNo : " + xEtudiant.getStudendRollNo());
		        System.out.println("Student's ID : " + xEtudiant.getStudentID());
		    }

	}


