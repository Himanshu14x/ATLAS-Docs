package PracticeSet.atlaslearnings.day26.publisherSubscriberPattern;

public interface Publisher {
    void addSub(Subscriber subscriber);
    void removeSub(Subscriber subscriber);
    void notifySub(String msg);
}