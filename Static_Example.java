class Sample {

    // static block
    static {
        System.out.println("Static block");
    }

    // constructor
    Sample() {
        System.out.println("Constructor");
    }

    // static variable
    public static int count = 10;

    // static method
    public static void increment(){
        count++;
    }

    // normal method
    public int getCount() {
        return count;
    }
}

class Static_Example {
    public static void main(String[] args) {
        Sample obj1 = new Sample();
        Sample obj2 = new Sample();
        Sample.increment();
        Sample.increment();
        Sample.increment();
        System.out.println("Count (obj1): " + obj1.getCount());
        System.out.println("Count (obj2): " + obj2.getCount());
    }
}
