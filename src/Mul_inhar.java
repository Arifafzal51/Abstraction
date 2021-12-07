interface a8
{
    void show();
}
interface a3
{
    void display();
}
class Test implements a8,a3
{
    public void show()
    {
        System.out.println("Multiple inheritance");
    }
   public void display()
    {
        System.out.println("Is importent");
    }

    public static void main(String[] args) {
        Test s= new Test();
        s.show();
        s.display();

    }
}