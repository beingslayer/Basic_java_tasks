package day4_student;

public class Student {


	private String studentId,studentName;
	private int  DBMSMarks, CMarks, studentFees, marksPercent;

	public int calculateMarks() {
		// ......
		int sum = 0;
		sum = DBMSMarks + CMarks;
		marksPercent = (int) Math.ceil((sum / 200.0) * 100);
		if (marksPercent < 50) {
			calculateFees();
		}
		return marksPercent;
	}

	public int getMarksPercent() {
		return marksPercent;
	}

	public void setMarksPercent(int marksPercent) {
		this.marksPercent = marksPercent;
	}

	public Student(String studentName, String studentId, int DbmsMarks, int cMarks) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.DBMSMarks = DbmsMarks;
		this.CMarks = cMarks;
		this.marksPercent = 0;
		this.studentFees = 50000;
	}

	public void printDetails() {
		System.out.println("\n\n********Student Details*********" + "\n\tStudent ID: " + studentId + "\n\tStudent Name: " + studentName
				+ "\n\tStudent DBMS Marks: " + DBMSMarks + "\n\tStudent C++ Marks: " + CMarks + "\n\tStudent Percentage: "
				+ marksPercent + "%" + "\t\nStudent Fees: " + studentFees);
	}

	public int getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(int studentFees) {
		this.studentFees = studentFees;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getEnglishMarks() {
		return DBMSMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.DBMSMarks = englishMarks;
	}

	public int getMathMarks() {
		return CMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.CMarks = mathMarks;
	}

	public void calculateFees() {
		studentFees *= 1.5;

	}

}