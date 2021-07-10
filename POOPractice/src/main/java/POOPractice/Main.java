package POOPractice;

public class Main {
    public static boolean AmIUruguayoOrChileno(Person person){
        boolean isFrom = person instanceof Uruguayo ? true : false;
        return isFrom;
    }
    
    public static void main(String arg[]){
        Uruguayo uruguayo = new Uruguayo();
        uruguayo.SetName("Federico");
        uruguayo.SetLastName("Valverde");
        uruguayo.SetAge(22);
        uruguayo.SetGender("Male");
        uruguayo.SetCI(new Cedula("123456789"));
        uruguayo.SetDepartment("Montevideo");
        uruguayo.SetNeighborhood("Peñarol");
        uruguayo.Move("Madrid", "Real Madrid");
        uruguayo.PrintInfo();
        System.out.println("is "+uruguayo.GetName() + " uruguayo? " + AmIUruguayoOrChileno(uruguayo)+"\n");
        
        Chileno chileno = new Chileno();
        chileno.SetName("Arturo");
        chileno.SetLastName("Vidal");
        chileno.SetAge(34);
        chileno.SetGender("Male");
        chileno.SetDNI("12345678");
        chileno.SetRegion("Santiago");
        chileno.SetComuna("Colo-Colo");
        System.out.println("is "+chileno.GetName() + " uruguayo? " + AmIUruguayoOrChileno(chileno));
        System.out.println("is "+chileno.GetName() + " an adult? "+chileno.IsAdult()+"\n");
        
        Dog doggy = new Dog();
        doggy.SetAge(12);
        System.out.println("is Doggy an adult? "+doggy.IsAdult());
        doggy.BirthDay();
        System.out.println("Doggy birthdays "+doggy.GetAge()+", now is an adult? "+doggy.IsAdult());
        
    }
}
