public class Student extends Person{
    private int rollno;
    public void setRollno(int r){
        rollno = r;
    }
    public void showRollno(){
        System.out.println("Rollno : " + rollno);
    }
}