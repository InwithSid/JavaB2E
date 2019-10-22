
package test2;

public class Assignment_1 {

    public String pt;
    
    public String printAssign( String name, int age, String school, int grade){
        
        pt = "\nThis is the output of the Assignment_1Oct'19" +
                            "\nName : " + name + "\nAge : " + age + "\nSchool : " + 
                            school + "\nGrade : " + grade;
        
        return pt;
    }
    
    public double calculateInterest (double ammount, double interestRate) {
        return(ammount * (interestRate / 100));
    }
    
    
}
