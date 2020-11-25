public class Grade {
    private Course course;
    // Course object corresponding to this grade.
    private Student student;
    // Student object corresponding to this grade.
    private float grade;
    // The grade (>=0).
    private float gpa;
    // The GPA calculated by grade.

    public Grade(Course course, Student student, float grade){
        this.student = student;
        this.course = course;
        setGrade(grade);
    }

    public static float calGpa(float grade){
        if(grade<60)
            return 0f;
        else if(grade<63)
            return 1.15f;
        else if(grade<67)
            return 1.63f;
        else if(grade<70)
            return 2.08f;
        else if(grade<73)
            return 2.42f;
        else if(grade<77)
            return 2.78f;
        else if(grade<80)
            return 3.09f;
        else if(grade<83)
            return 3.32f;
        else if(grade<87)
            return 3.55f;
        else if(grade<90)
            return 3.73f;
        else if(grade<93)
            return 3.85f;
        else if(grade<97)
            return 3.94f;
        else
            return 4.00f;
    }
    public Course getCourse(){
        return this.course;
    }
    public float getGrade(){
        return this.grade;
    }
    public Student getStudent(){
        return this.student;
    }
    public float getGpa(){
        return this.gpa;
    }
    public void setGrade(float grade){
        this.grade = grade;
        this.gpa = calGpa(grade);
    }
    // After set the grade, update the GPA at the meantime.
@Override
    public String toString(){
    return "sid: "+student.getSid()+", cid: "+course.getCid()+", grade: "+this.grade+", gpa: "+this.gpa;
    }
}
