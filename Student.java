//Simple Student details program using OOPs


public class Student {
    
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    
    //Method for AverageMarks
    public double calculateAverage() {
        if (marks.length == 0) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (int mark : marks) {
            sum += mark;
        }
        
        return sum / marks.length;

    }
    
        public static void main(String[] args){
            Student student1 =  new Student("Karen", 100, new int[]{80, 70, 67, 92});
            Student student2 =  new Student("Agastya", 150, new int[]{40, 60, 45, 57});
            //Student 1 details
            System.out.println("Student 1:");
            System.out.println("Name: " + student1.getName());
            System.out.println("Roll Number: " + student1.getRollNumber());
            System.out.print("Marks: ");
            for (int mark : student1.getMarks()) {
                System.out.print(mark + " ");
            }
            System.out.println();
            System.out.println("Average Marks: " + student1.calculateAverage());
            
            // Display details for student2
            System.out.println("\nStudent 2:");
            System.out.println("Name: " + student2.getName());
            System.out.println("Roll Number: " + student2.getRollNumber());
            System.out.print("Marks: ");
            for (int mark : student2.getMarks()) {
                System.out.print(mark + " ");
            }
            System.out.println();
            System.out.println("Average Marks: " + student2.calculateAverage());
}
    }

    
