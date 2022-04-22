import org.springframework.context.annotation.Bean;

public class BeanConfigMiddle {
    @Bean
    public Programmer programmer() {
        return new Middle() {
        };
    }
    @Bean
    public Program program(Programmer programmer) {
        Program program = new Program();
        program.setProgrammer(programmer);
        return program;
    }
}
