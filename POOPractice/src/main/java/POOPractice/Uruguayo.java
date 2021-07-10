package POOPractice;

public class Uruguayo extends Person{
    private Cedula ci;
    private String department;
    private String neighborhood;

    public Uruguayo(){
    }
    
    public Cedula GetCI(){
        return ci;
    }

    public void SetCI(Cedula ci){
        this.ci = ci;
    }

    public String GetDepartment(){
        return department;
    }

    public void SetDepartment(String department){
        this.department = department;
    }

    public String GetNeighborhood(){
        return neighborhood;
    }

    public void SetNeighborhood(String neighborhood){
        this.neighborhood = neighborhood;
    }

    public void PrintInfo(){
        System.out.println("name: "+this.GetName()+" "+this.GetLastName());
        System.out.println("gender: "+this.GetGender());
        System.out.println("age: "+this.GetAge());
        System.out.println("CI: "+this.ci.GetNumber());
        System.out.println("Department: "+this.department);
        System.out.println("Neighborhood: "+this.neighborhood);
    }
    
    public void Move(String newDepartment, String newNeighborhood){
        this.SetDepartment(newDepartment);
        this.SetNeighborhood(newNeighborhood);
    }
}
