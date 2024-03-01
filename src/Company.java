public class Company {
    public void get(String name, int id ){
        System.out.println("Company Name : " + name);
        System.out.println("company ID : " + id);

    }
    public void get(int id, String name ){
        System.out.println("company ID : " + id);
        System.out.println("Company Name : " + name);

    }


}
class Overload {
    public static void main(String[] args) {
        Company c = new Company();
        c.get("BMW",1);
        c.get("AUDI", 2);

    }
}
