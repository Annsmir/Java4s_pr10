public class Program {
    private Programmer programmer;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void programs()
    {
        System.out.println("Program is being written. " + programmer.doCoding() );
    }
}
