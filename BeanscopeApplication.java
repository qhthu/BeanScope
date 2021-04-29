package demo.spring.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanscopeApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationBeans.class);
        People people = applicationContext.getBean("people", People.class);
        System.out.println("ID: "+people.getId());
        System.out.println("Ten: "+people.getName());

        People people1 = (People) applicationContext.getBean("singletonPeople");
        System.out.println("ID: "+people1.getId());
        System.out.println("Ten: "+people1.getName());

        Student student = (Student) applicationContext.getBean("requestStudent");
        System.out.println("Lop: "+student.getGrade());

        People people2 = (People) applicationContext.getBean("prototypePeople");
        System.out.println("ID: "+people2.getId());
        System.out.println("Ten: "+people2.getName());


        Employee employee = (Employee) applicationContext.getBean("sessionEmployee");
        System.out.println("Cong ty: "+employee.getCompanyName());

        ApplicationScope applicationScope = (ApplicationScope) applicationContext.getBean("applicationScope");
        System.out.println("So: "+applicationScope.getNumber());
    }

}
