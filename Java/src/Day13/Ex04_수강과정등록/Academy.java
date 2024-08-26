package Day13.Ex04_수강과정등록;

import java.util.ArrayList;
import java.util.List;

public class Academy {

	public static void main(String[] args) {
		
		// 일반인 과정 생성
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("김조은"));
		personList.add(new Worker("박조은"));
		personList.add(new Student("이조은"));
		personList.add(new HighStudent("황조은"));
		personList.add(new MiddleStudent("권조은"));
		Course<Person> personCourse = new Course<Person>(personList);
		personCourse.createCourse("일반인과정", personCourse);
		personCourse.printStudentList(personCourse);
		
		// 직장이 과정
		List<Worker> workerList = new ArrayList<Worker>();
		workerList.add(new Worker("안기욱"));
		workerList.add(new Worker("김부장"));
		workerList.add(new Worker("장그래"));
		Course<? super Worker> workerCourse = new Course<Worker>(workerList);
		Course<? super Worker> createWorkerCourse = workerCourse.createWorkerCourse("직장인과정",workerCourse);
		Course<? super Worker> createWorkerCourse2 = workerCourse.createWorkerCourse("직장인과정2",personCourse);
		
		workerCourse.printStudentList(createWorkerCourse);
		workerCourse.printStudentList(createWorkerCourse2);
		
		// 학생 과정
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("김학생"));
		studentList.add(new HighStudent("이고딩"));
		studentList.add(new MiddleStudent("장중딩"));
		
		Course<? extends Student> studentCourse = new Course<Student>("학생과정", studentList);
		
		List<MiddleStudent> middlestudentList = new ArrayList<MiddleStudent>();
		middlestudentList.add(new MiddleStudent("이중딩"));
		Course<MiddleStudent> middleStudentCourse = new Course(studentList);
		middleStudentCourse.createStudentCourse("학생과정", middleStudentCourse);
		
		studentCourse.printStudentList(studentCourse);
		studentCourse.printStudentList(middleStudentCourse);
		
//		workerCourse.createWorkerCourse("직장인과정3", studentCourse); (에러) 스튜던트 포함x
	}
	
}
