public class App {
    public static void main(String[] args) throws Exception {
        Student model=new Student();
        model.setName("Soham Dutta");
        model.setId("ID15");
        model.setGrade("O");

        StudentView view=new StudentView();
        StudentController controller=new StudentController(model, view);
        controller.updateView();
        controller.setGrade("E");
        controller.updateView();
    }
}
