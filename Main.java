public class Main {
    public static void main(String[] args){
        User user = new User();
        User user1 = new User("Sylvester", 1946, 7, 6);
        User John = new User("John", 1954, 2, 18);

        user.displayInfo();
        user1.displayInfo();
        user1.displayHappyBirthday();
        John.displayInfo();
        John.displayHappyBirthday();

        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);

        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        nicolas.displayHappyBirthday();

        Admin egg = new Admin("egg", 1999, 3, 7);
        egg.displayInfo(true);
        egg.displayHappyBirthday();

        Admin f = new Admin("f", 1999, 1, 9);
        f.displayInfo(true);
        f.displayHappyBirthday();

    }
}

