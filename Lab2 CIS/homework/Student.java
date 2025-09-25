class Student{
    private String name;
    private int id;
    private int age;
    private String grade;

    Student(String name, int id, int age, String grade){
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    Student(){
        this.name = "Aditya";
        this.id = 123;
        this.age = 21;
        this.grade = "A";
    }

    void displayInfo(){
        System.out.printf("Id: %d\n", this.id);  
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Age: %d\n", this.age);
        System.out.printf("Grade: %s\n\n", this.grade);
    }


    public static void main(String args[]){
        
        // default constructor
        Student student1 = new Student();
        student1.displayInfo();

        // parameterized constructor
        Student student2 = new Student("Manoj", 112, 20, "B");
        student2.displayInfo();
    }
}