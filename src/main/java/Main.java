import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext1=new AnnotationConfigApplicationContext(BeanConfigJunior.class);
        Program program1=applicationContext1.getBean(Program.class);
        program1.programs();

        ApplicationContext applicationContext2=new AnnotationConfigApplicationContext(BeanConfigMiddle.class);
        Program program2=applicationContext2.getBean(Program.class);
        program2.programs();

        ApplicationContext applicationContext3=new AnnotationConfigApplicationContext(BeanConfigSenior.class);
        Program program3=applicationContext3.getBean(Program.class);
        program3.programs();
    }
}