package PracticeSet.atlaslearnings.day26.publisherSubscriberPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pub sub Pattern ");

        Messaging messaging = new Messaging();

        User user1 = new User("Prasunamba");
        User user2 = new User("Sheerisha DC");
        User user3 = new User("Sheerisha Perapagu");
        User user4 = new User("Hari Gopal");
        User user5 = new User("Arun Kumar");
        User user6 = new User("Sarath");


        messaging.addSub(user1);
        messaging.addSub(user2);
        messaging.addSub(user3);
        messaging.addSub(user4);
        messaging.addSub(user5);
        messaging.addSub(user6);


        messaging.sendMsg("Good Afternoon every one ");


        messaging.removeSub(user1);


        messaging.sendMsg("Good Luck to you all for your Milestone ");

    }
}
