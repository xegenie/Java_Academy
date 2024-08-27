package Day13_15.Ex04_수강과정등록;

/*
 * 일반인 과정, 직장인 과정, 학생 과정을 등록하는 인터페이스
 */
public interface Manager {
	// 일반인 과정 생성
	public Course<?> createCourse(String name, Course<Person> course);
	// 직자인 과정 생성 - Person, Worker
	public Course<?> createWorkerCourse(String name, Course<? super Worker> course);
	// 학생 과정 생성 - Student, HighStudent, MiddleStudent
	public Course<?> createStudentCourse(String name, Course<? extends Student> course);
	
	// 수강생 목록 출력
	public void printStudentList(Course<?> course);
}
