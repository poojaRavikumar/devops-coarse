class Student{
	long StudId;
	String name, address , course;

	Student(long StudId, String name){
		this.StudId = StudId;
		this.name = name;
		
	}


	Student(){
		
	}

	void setaddress(String address){
		this.address = address;
	}

	void setCourse(String course){
		this.course = course;
	}

	String getaddress(){
		return this.address;
	}

	String getcourse(){
		return this.course;
	}

	long getStudId(){
		return this.StudId;
	}

	String getName(){
		return this.name;
	}
}

class university{
	public static void main(String[] args) {
		Car firstStudent = new Student(677, "pooja");
		Car secondStudent = new Student(272, "ravikumar");

		System.out.println(firstStudent.getStudId());

		firstStudent.setcourse("Mettalic Blue");
		firstStudent.setaddress("2014");


		Student newStudentForAsiaMarket = new Student();



	}
}