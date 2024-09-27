class Student {
    String name;
    int age;
    String address;
    static String college = "TMU";
    static int count = 0;

    static {
        System.out.println("This is Static Block that also gets executed once!");
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Static method
    static void StudentCount() {
        count += 1;
    }

    // Getter method for Static method
    public int getCount() {
        return count;
    }

}

public class StaticKeyword {
    public static void main(String[] args) {
        Student obj = new Student("Ebaad", 21, "High Street Moradabad");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.address);
        System.out.println(Student.college); // Static variable gets called with the Class name
        System.out.println(Student.college);
        System.out.println(obj.getCount());

        Student obj2 = new Student("Ebaad", 21, "High Street Moradabad");
        System.out.println(Student.college);
        obj2.getCount();
        Student.StudentCount();
        System.out.println(obj.getCount());
        System.out.println(obj2.getCount());

        Student.StudentCount(); // Static Method
        System.out.println(obj.getCount());
    }
}