
public class Paper {
     private String  PapersTitle,CourseCode,CourseIncharge,Semester,PrgaramName,ExamType,Location;
    private int PaperId,StudentNumber,day, month, year,hour,min,sec;
    private boolean PaperCollected;

    public Paper(String PapersTitle, String CourseCode, String CourseIncharge, String Semester, String PrgaramName, String ExamType, String Location, int PaperId, int StudentNumber, int day, int month, int year,int hour,int min,int sec, boolean PaperCollected) {
        this.PapersTitle = PapersTitle;
        this.CourseCode = CourseCode;
        this.CourseIncharge = CourseIncharge;
        this.Semester = Semester;
        this.PrgaramName = PrgaramName;
        this.ExamType = ExamType;
        this.Location = Location;
        this.PaperId = PaperId;
        this.StudentNumber = StudentNumber;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour=hour;
        this.min=min;
        this.sec=sec;
        this.PaperCollected = PaperCollected;
    }

    public String getPapersTitle() {
        return PapersTitle;
    }

    public void setPapersTitle(String PapersTitle) {
        this.PapersTitle = PapersTitle;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseIncharge() {
        return CourseIncharge;
    }

    public void setCourseIncharge(String CourseIncharge) {
        this.CourseIncharge = CourseIncharge;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getPrgaramName() {
        return PrgaramName;
    }

    public void setPrgaramName(String PrgaramName) {
        this.PrgaramName = PrgaramName;
    }

    public String getExamType() {
        return ExamType;
    }

    public void setExamType(String ExamType) {
        this.ExamType = ExamType;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getPaperId() {
        return PaperId;
    }

    public void setPaperId(int PaperId) {
        this.PaperId = PaperId;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int day,int month,int year) {
        this.day=day;
        this.month=month;
        this.year = year;
    }   
    public void setTime(int hour,int min,int sec) {
        this.hour=hour;
        this.min=min;
        this.sec = sec;
    }
    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
    public boolean isPaperCollected() {
        return PaperCollected;
    }

    public void setPaperCollected(boolean PaperCollected) {
        this.PaperCollected = PaperCollected;
    }

    @Override
    public String toString() {
        return "Paper{" + "Paper's Title  =" + PapersTitle + ", Course Code is=" + CourseCode + ",Incharge of Course =" + CourseIncharge + ", Semester  is=" + Semester + ", Name of Prgaram =" + PrgaramName + ", Examination Type =" + ExamType + ", Location of paper =" + Location + ", Paper id Number is=" + PaperId + ", Number Of Student In Exam =" + StudentNumber + ", date =" + day + "/" + month + "/" + year + ",time=" + hour + ":" + min + ":" + sec+", PaperCollected or Not=" + PaperCollected + '}';
    }
    
    
}
