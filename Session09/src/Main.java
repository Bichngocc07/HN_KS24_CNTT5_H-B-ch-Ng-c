import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Student[] list = new Student[100];   // mảng lưu sinh viên
    static int count = 0;                       // số lượng sinh viên hiện có

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("==== QUẢN LÝ ĐIỂM SINH VIÊN ====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. THOÁT");
            System.out.println("=================================");
            System.out.print("Chọn chức năng: ");

            choice = sc.nextInt();
            sc.nextLine(); // xử lý trôi lệnh

            switch (choice){
                case 1:
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("THOÁT CHƯƠNG TRÌNH");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 5);
    }

    // ===== CHỨC NĂNG 2: HIỂN THỊ =====
    public static void hienThi(){
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }
}
