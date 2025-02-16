public class Student{

    private int studentId;
    private String studentName,studentAddress,collegeName;

    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    public String getCollegeName(){
        return collegeName;
    }
    
    public Student(int id,String name,String address){
        studentId = id;
        studentName = name;
        studentAddress=address;
        collegeName = "NIT";
        
    }
    public Student(int id,String name,String address,String college){
        studentId=id;
        studentName=name;
        studentAddress=address;
        collegeName=college;
    }
}