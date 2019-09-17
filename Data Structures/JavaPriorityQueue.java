import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
class Student{
    private String ID;
    private String name;
    private float spi;
    public Student(String ID,String name,Float spi){
        this.ID=ID;
        this.name=name;
        this.spi=spi;
    } 

    public String  getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public float getSpi(){
        return this.spi;
    }
}
class Priorities {
    
    private final PriorityQueue<Student> queue = new PriorityQueue<>(
            Comparator.comparing(Student::getSpi).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getID));

    public List<Student> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED")) {
                queue.poll();
            } else {
                String[] details = event.split(" ");

                queue.add(new Student(details[3], details[1], Float.parseFloat(details[2])));
            }
        });

        List<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}
class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}