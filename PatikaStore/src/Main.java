import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Statik olarak önceden tanımlı markalar
        List<Brand> brands = Brand.getAllBrands();

        List<NoteBook> notebooks = new ArrayList<>();
        notebooks.add(new NoteBook(1, "HUAWEI Matebook 14", 7000.0, 10.0, 100, brands.get(3), 16, 512, 14.0));
        notebooks.add(new NoteBook(2, "LENOVO V14 IGL", 3699.0, 15.0, 50, brands.get(1), 8, 1024, 14.0));
        notebooks.add(new NoteBook(3, "ASUS Tuf Gaming", 8199.0, 20.0, 30, brands.get(5), 32, 2048, 15.6));


        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(1, "SAMSUNG GALAXY A51", 3199.0, 5.0, 100, brands.get(0), 6, 128, 6.5, 4000, "Siyah"));
        phones.add(new Phone(2, "iPhone 11 64 GB", 7379.0, 10.0, 50, brands.get(2), 6, 64, 6.1, 3046, "Mavi"));
        phones.add(new Phone(3, "Redmi Note 10 Pro 8GB", 4012.0, 12.0, 75, brands.get(7), 12, 128, 6.5, 4000, "Beyaz"));

        Scanner scanner = new Scanner(System.in);

        int secim;
        do {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            secim = scanner.nextInt();
            scanner.nextLine();  // enter tuşuna basıldığında bir sonraki satıra geçebilmek için

            switch (secim) {
                case 1:
                    System.out.println("Notebook Listesi");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.println("| ID  | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    for (NoteBook notebook : notebooks) {
                        System.out.println(notebook);
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    break;

                case 2:
                    System.out.println("\nCep Telefonu Listesi");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID  | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    for (Phone phone : phones) {
                        System.out.println(phone);
                    }
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    break;

                case 3:
                    System.out.println("\nMarkalar");
                    System.out.println("------------------------------------------------");
                    for (Brand brand : brands) {
                        System.out.println("| " + brand.getId() + " | " + brand.getName() + " |");
                    }
                    System.out.println("------------------------------------------------");
                    break;

                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }

        } while (secim != 0);

        scanner.close();
    }
}
