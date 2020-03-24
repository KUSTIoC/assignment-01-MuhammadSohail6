
public class ExamManagementSystem {

    public static void main(String[] args) {
      
        Paper p1=new Paper("Java","CS103","Sir Roman","2nd","BS CS","Annual"," dept IIT room no 2 ",125,600,7,3,2020,9,00,0,false);
        
        Paper p2=new Paper("Maths","CS203","sir ali","2nd","BS CS","Annual"," dept IIT room no 4",125,600,8,3,2020,9,00,0,false);
        
        Paper p3=new Paper("English","CS101","Sir asif","2rd","BS CS","Annual"," dept IIT room no 9",125,600,9,3,2020,9,00,0,false);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        System.out.println(p1.toString()+new Course("java","CS101","MCS"));
        System.out.println(p2.toString()+new Course("Math","CS102","MSC"));
        System.out.println(p3.toString()+new Course("English","CS201","MSC"));
    }
    
}
