package day3Homework2;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("sisteme"+ user.name+"isimli ogrenci eklendi");
	}
	public void enrollToCourse(Student student,String courseId) {
		System.out.println("sistemde"+ student.name+"isimli ogrenci "+courseId+"id li kursa kayit oldu");
	}
	// daha cok method eklenebilir vakit kazanmak adina ugrasmadim
}
