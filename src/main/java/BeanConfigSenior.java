import org.springframework.context.annotation.Bean;

public class BeanConfigSenior {
    @Bean
    public Programmer programmer() {
        return new Senior() {
        };
    }
    @Bean
    public Program program(Programmer programmer) {
        Program program = new Program();
        program.setProgrammer(programmer);
        return program;
    }
}
