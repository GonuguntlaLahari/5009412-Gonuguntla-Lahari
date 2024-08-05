public class StudentController {
    private Student model;
    private StudentView view;
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void setName(String name){
        model.setName(name);
    }
    public void setId(String id){
        model.setId(id);
    }
    public void setGrade(String grade){
        model.setGrade(grade);;
    }
    public String getName(){
        return model.getName();
    }
    public String getId(){
        return model.getId();
    }
    public String getGrade(){
        return model.getGrade();
    }
    public void updateView(){
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}
