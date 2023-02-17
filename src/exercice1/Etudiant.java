/**
 * @author N'ZO LAGOU
 * Dans cet exemple de programme, nous créons une classe Studentet déclarons les variables stdName, stdRollNoet stdIdcomme privées

Déclarez les variables privées dans la classe - stdName, stdRollNoetstdId

Appliquez la méthode getter publique pour chaque variable privée de la classe.

Appliquez la méthode setter publique pour chaque variable privée de la classe.

Créez l'objet de la classe Studenten utilisant le newmot-clé.

Appelez la méthode setter et définissez la valeur des variables.

Appelez la méthode getter pour lire la valeur des variables et l'afficher sur la console.
 */

package exercice1;

public class Etudiant {
	private String studendName;
	private int studendRollNo;
	private int studentID;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String studendName, int studendRollNo, int studentID) {
		super();
		this.studendName = studendName;
		this.studendRollNo = studendRollNo;
		this.studentID = studentID;
	}

	public String getStudendName() {
		return studendName;
	}

	public void setStudendName(String studendName) {
		this.studendName = studendName;
	}

	public int getStudendRollNo() {
		return studendRollNo;
	}

	public void setStudendRollNo(int studendRollNo) {
		this.studendRollNo = studendRollNo;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	
}
