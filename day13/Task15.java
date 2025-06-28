        package PracticeSet.atlaslearnings.day13;
        import java.util.LinkedList;
        import java.util.Spliterator;
        public class Task15 {
        public static void main(String[] args) {
        LinkedList<String> llobj = new LinkedList<>();
        llobj.add("Prasunamba");
        llobj.add("Meher");
        llobj.add(".MK");
        llobj.add("MP");
        for (int i = 0; i < 100000; i++) {
            llobj.add(i + " Adding");
        }
        // Correct splitting
        Spliterator<String> itobj1 = llobj.spliterator();
        Spliterator<String> itobj2 = itobj1.trySplit(); // This splits the list



        itobj1.forEachRemaining(n -> System.out.println(n + " from spliterator 1")); // ✅ consumes its elements
        itobj2.forEachRemaining(n -> System.out.println(n + " from spliterator 2")); // ✅ consumes its elements

            }
        }
