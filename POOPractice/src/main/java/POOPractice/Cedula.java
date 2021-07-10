package POOPractice;

public class Cedula {
    private String number;
    private int checkDigit;
    
    public String GetNumber(){
        return number;
    }
    
    public void Setnumber(String number){
        this.number = number;
    }
    
    public Cedula(String number){
        this.number = number;
    }
}
