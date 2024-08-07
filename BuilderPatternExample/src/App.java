public class App {
    public static void main(String[] args) throws Exception {
        Computer officeComputer=new Computer.Builder().setRam(4).setCPU("i5 5thgen").setStorage("256gb SSD").build();
        System.out.println(officeComputer.toString());
    }
}
