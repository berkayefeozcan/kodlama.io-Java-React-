package day3Homework2;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("sisteme"+ user.name+"isimli egitmen eklendi");
	}
	public void createACourse(Student student,String courseId) {
		System.out.println("sistemde"+ student.name+"isimli egitmen "+courseId+"id li kursu olusturdu");
	}
}
