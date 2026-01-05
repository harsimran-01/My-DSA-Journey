
import java.util.PriorityQueue;

// package priorityQueue;

public class objects {
    static class Student implements Comparable<Student>{
        int rank;
        String name;

        public Student(int rank,String name) {
            this.name = name;
            this.rank = rank;
        }

        //overriding

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }

        
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(5, "ab"));
        pq.add(new Student(15, "cd"));
        pq.add(new Student(2, "ef"));
        pq.add(new Student(30, "gh"));
        pq.add(new Student(45, "ij"));

        while(!pq.isEmpty()){
            System.out.print(pq.peek().rank + " -> " + pq.peek().name);
            pq.remove();
            System.out.println();

        }
    }
}
