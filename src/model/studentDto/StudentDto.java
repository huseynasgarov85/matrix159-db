package model.studentDto;

public class StudentDto {
    private Integer studentId;
    private String studentName;
    private String studentSurname;
    private Integer studentScore;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public Integer getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(Integer studentScore) {
        this.studentScore = studentScore;
    }

    public StudentDto(Integer studentId, String studentName, String studentSurname, Integer studentScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentScore = studentScore;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentScore=" + studentScore +
                '}';
    }

}
