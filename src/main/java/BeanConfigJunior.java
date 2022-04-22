import org.springframework.context.annotation.Bean;

public class BeanConfigJunior {
    @Bean
    public Programmer programmer() {
        return new Junior() {
        };
    }
    @Bean
    public Program program(Programmer programmer) {
        Program program = new Program();
        program.setProgrammer(programmer);
        return program;
    }
}
