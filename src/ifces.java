interface i2
{
    void show();
}
class Samar implements i2
{
    public void show()
    {
        System.out.println("Hii i am learning Java");
    }

    public static void main(String[] args) {
        Samar a = new Samar();
        a.show();
    }

}