import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student st=new Student();
        st.fname = "Jan";
        st.lname = "Kowalski";
        st.email = "12345@hhh";
        st.indexNumber = 12345;
        st.grades=new ArrayList<>();
        st.grades.add(5.0);
        st.grades.add(4.0);
        st.grades.add(3.0);
StudentGroup grupa = new StudentGroup();
grupa.nazwa = "11";
        System.out.println(st.calculatyeAvg());



    }
}