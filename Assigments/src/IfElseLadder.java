
public class IfElseLadder {

	static int passingMarks = 35;

	public static void main(String[] args) {
		int mathsMarks = 20;
		int PhysicsMarks = 99;
		int ChemistryMarks = 60;

		if (mathsMarks < passingMarks) {
			System.out.println("Student failed in maths");
		} else {
			System.out.println("Pass in maths");
		}
		if (PhysicsMarks < passingMarks) {
			System.out.println("Student failed in maths");
		} else {
			System.out.println("Pass in physics");
		}
		if (ChemistryMarks < passingMarks) {
			System.out.println("Student failed in maths");
		} else {
			System.out.println("Pass in chemistry");
		}

		float average = (mathsMarks + PhysicsMarks + ChemistryMarks) / 3;
		if (mathsMarks<=35 ||mathsMarks<=35||ChemistryMarks<=35) {
			System.out.println("Grade will not be calculated as student is fail in any one subject");
		}

		else {
			if (average <= 59) {
				System.out.println("Grade is C");
			} else if (average > 59 & average <= 69) {
				System.out.println("Grade is B");
			} else if (average > 69) {
				System.out.println("Grade is A");
			}
		}
	}
}
