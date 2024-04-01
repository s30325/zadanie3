import java.util.ArrayList;
public class Student {
    public String fname;
    public String lname;
    public String email;
    public String adress;
    public int indexNumber;
    public ArrayList<Double> grades;

    public double calculatyeAvg(){
        if(grades.size()<20){
            double avg = 0;
                    for(int i = 0; i<grades.size(); i++) {
                        avg+=grades.size();
                    }
                    avg/=grades.size();
                    double grade = Math.round(avg);
                    if(avg>5 || avg==0){
                        throw  new IllegalArgumentException();
                    }
                    return grade;
        }
        return 0;
    }
}
