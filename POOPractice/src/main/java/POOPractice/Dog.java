package POOPractice;

public class Dog implements LivingBeing{
    private String name;
    private String race;
    private int age;
    private String gender;
    
    public String GetName(){
        return name;
    }
    
    public void SetNAme(String name){
        this.name = name;
    }

    public String GetRace(){
        return race;
    }

    public void SetRace(){
        this.race = race;
    }

    public int GetAge(){
        return age;
    }

    public void SetAge(int age){
        this.age = age;
    }

    public String GetGender(){
        return gender;
    }

    public void SetGender(){
        this.gender = gender;
    }
    
    @Override
    public void BirthDay(){
        this.age = this.age + 1;
    }
    
    @Override
    public boolean IsAdult(){
        boolean isAdult = this.age >= 13 ? true : false;
        return isAdult;
    }
    
}
