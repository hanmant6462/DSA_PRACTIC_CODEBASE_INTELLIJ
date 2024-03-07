//package Practice;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Employee1234 {
//    //age ,name sal
//    //list of players  and score, name  sort using score    if same score player
//    //
//    // name
//
//    public static void main(String[] args) {
//        List<Player> list = new ArrayList<>();
//        list.add(new Player("pl1",100));
//
//        list.add(new Player("pl2",100));
//        list.add(new Player("pl3",200));
//
//        Collections.sort(new Comparator<Player>() {
//
//
//            @Override
//            public int compare(Player o1, Player o2) {
//                if (o1.getScore() > o2.getScore())
//                    return 1;
//                else if (o1.getScore() < o2.getScore())
//                    return -1;
//                return 0;
//            }
//        });
//    }
//}
//
//
//class Player implements Comparator{
//    String name;
//    int score;
//
//    public Player(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
//}
//
//
