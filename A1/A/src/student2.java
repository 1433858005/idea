public class student2 {
    private int id;
    private String nane;
    private char genger;
    private int age;
    private  String nativeplace;

    public student2() {
    }

    public student2(int id, String nane, char genger, int age, String nativeplace) {
        this.id = id;
        this.nane = nane;
        this.genger = genger;
        this.age = age;
        this.nativeplace = nativeplace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public char getGenger() {
        return genger;
    }

    public void setGenger(char genger) {
        this.genger = genger;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

}
