import java.util.ArrayList;
import java.util.List;

public class Brand {
    private int id; //Markanın sistemde kayıtlı benzersiz numarası
    private String name;

    public Brand(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    /*Markalar listelenirken her zaman alfabe sırasıyla listelenmelidir.
      Markalar statik olarak kod blokları içerisinden aşağıdaki sıra ile eklenmelidir.
      Markalar : Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster*/

    public static List<Brand> getAllBrands(){
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));

        return brands;
    }

}
