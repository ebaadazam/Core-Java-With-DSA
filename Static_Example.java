class Static_Example {

    // static variable
    static int count = 0;

    // constructor
    Static_Example(){
        count+=1;
    }

    // method to show the value of count
    static void showCount() {
        System.out.println("Counter: " + count);
    }

    public static void main(String[] args) {
        Static_Example.showCount();

        Static_Example obj = new Static_Example();
        Static_Example obj2 = new Static_Example();
        Static_Example obj3 = new Static_Example();

        Static_Example.showCount();

    }
}
