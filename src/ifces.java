interface i1
{
    void show();
}
class Arif implements i1
{
    public void show()
    {
        System.out.println("Hii i am learning Java");
    }

    public static void main(String[] args) {
        Arif a = new Arif();
        a.show();
    }

}