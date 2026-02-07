package in.pinku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pinku.entity.Student;
import in.pinku.rerpository.StudentReposatory;

@SpringBootApplication
public class Application {

    private final StudentReposatory studentReposatory;

    Application(StudentReposatory studentReposatory) {
        this.studentReposatory = studentReposatory;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		StudentReposatory bean = run.getBean(StudentReposatory.class);
		
//		Student s=new Student();
//		s.setPkid(109);
//		s.setPkemp_name("PINTU");
//		s.setSalary((long) 60000);
//		s.setCity("BBSR");
//		
//		bean.save(s);
//		System.out.println("Record Inserted");
//		Student s1=new Student();
//		s1.setPkid(100);
//		s1.setPkemp_name("CHINU");
//		s1.setSalary((long) 45000);
//		s1.setCity("BDK");
//		
//		bean.save(s1);
//		System.out.println("Second Recordis  Inserted");
//		(retrive by id )
//      Optional<Student> optional = bean.findById(100);
//		if(optional.isPresent())
//		{
//			System.out.println(optional.get());
//		}
		 
//		Student s2=new Student(101,"lizun","kjr",(long) 35000);
//		Student s3=new Student(102,"bidyut","kjr",(long)30000);
//		Student s4=new Student(103,"santosh","bdk",(long)35000);
//		Student s5=new Student(104,"pinkunapp","bbsr",(long)69000);
//		Student s6=new Student(105,"ck","bdk",(long)33000);
//		Student s7=new Student(106,"mamina","bbsr",(long)43000);
//		Student s8=new Student(107,"susant","kjr",(long)100000);
//		Student s9=new Student(108,"chinmayee","bbsr",(long)30000);
//		
//		List<Student> asList = Arrays.asList(s2,s3,s4,s5,s6,s7,s8,s9);
//		bean.saveAll(asList);
		System.out.println("First Record Insertes Sucessfull9");
		
//		find by method
//		List<Student> byCity = bean.findByCity("bdk");
//		byCity.forEach(System.out::println);
		
//		List<Student> bySalaryGreaterThanEqual = bean.findBySalaryGreaterThanEqual(40000);
//		bySalaryGreaterThanEqual.forEach(System.out::println);
//		List<Student> allStudents = bean.getAllStudents();
//		List<Student> allStudents2 = bean.getAllStudents();
//		allStudents2.forEach(System.out::println);
		
//		List<Student> all = bean.findAll();
//		all.forEach(System.out::println);
//		
//		System.out.println("if you want to paginaction then go throuth below syntax");
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter a page Number");
//		int pageNo = s.nextInt();
//		int pageSize=3;
//		PageRequest page = PageRequest.of(pageNo-1,pageSize );
//		Page<Student> findAll = bean.findAll(page);
//		List<Student> students = findAll.getContent();
//		students.forEach(System.out::println);
		
		
// if you Want to Shorting Order then Go throuth ShortingBtyOrder		
//		List<Student> students = bean.findAll(Sort.by("city"));
//		students.forEach(System.out::println);
		
//		Student s=new Student();
//		s.setCity("bdk");
//		Example<Student> example = Example.of(s);
//		List<Student> student = bean.findAll(example);
//		student.forEach(System.out::println);
//		System.out.println("Jpa Reposatory  is inserted 10");
		
//		bean.deleteStudent(105);
//		bean.deleteStudent(103);
//		System.out.println("Deleted Recored.....");
		
	 	Student s1= new Student(1, "ak", (long) 1234, "male", "Y");
		bean.save(s1);
		
		System.out.println("Record Inserted ");
	}

}
