package POOPractice;

public class Chileno extends Person{
    private String dni;
    private String region;
    private String comuna;

    public Chileno(){
    }
    
    public String GetDNI(){
        return dni;
    }

    public void SetDNI(String dni){
        this.dni = dni;
    }

    public String GetRegion(){
        return region;
    }

    public void SetRegion(String region){
        this.region = region;
    }

    public String GetComuna(){
        return comuna;
    }

    public void SetComuna(String comuna){
        this.comuna = comuna;
    }
}
