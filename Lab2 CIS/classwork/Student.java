class Student {
    
    public String name;
    public String id;
    public int age;
    public String grade;
        
    public Student(String id, String name, int age, String grade){
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public void displayDetails(){
        System.out.printf("Id: %s\n", this.id);
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Age: %d\n", this.age);
        System.out.printf("Grade: %s\n", this.grade);
        
        System.out.printf("\n");
    }
}
class Main {
    public static void main(String[] args){
        Student student1 = new Student("221026110","Manoj Shrestha", 21,"A");
        student1.displayDetails();
        
        Student student2 = new Student("221026127", "Aditya Poudel", 20, "B");
        student2.displayDetails();
    }
}