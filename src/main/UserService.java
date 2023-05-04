package main;

public class UserService {
    public String greetUser(String name){
        return String.format("Hey, %s!", name);
    }

    public String sayGoodbyeToUser(String name){
        return String.format("Bye, %s!", name);
    }

    public String wishHappyBirthday(String name, int age){
        return String.format("Happy birthday, %s! Congratulations on turning %s!");
    }
}
