import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now(); // Set to current date
    }
    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public LocalDate getDob(){
        return this.dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public boolean isBirthday(){
        return true;
    }
    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }

    public void displayInfo(){
        System.out.println("--------");
        System.out.println("name = " + name);
        System.out.println("dob = " + dob);

    }

}
