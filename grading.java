interface grades{
    String getGrade();
}
public class grading implements grades{
    //Basic Exercises: Task yourself with architecting conditions
    // that sort grades (A, B, C, and so forth) anchored on scored marks.
    int marks;
    grading(int marks){
        this.marks=marks;
    }
 @Override
 public String getGrade(){
    if(marks>=80){
        return "Grade A";
    }else if(marks>=70){
        return "Grade B+";
    }else if(marks>=60){
        return "Grade B";
    }else if(marks>=50){
        return "Grade C";
    }else if(marks>=40){
        return "Grade D";
    }else{
        return "FAIL";
    }
 }
public static void main(String []args){
    grading andrew=new grading(45);
    System.out.println("The grades presented are "+andrew.getGrade());
}
}
