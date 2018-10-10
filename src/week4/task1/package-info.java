/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;
//lớp cha
class HoaQua{
    protected int price;
    protected String from;
    protected String D_import;
    protected int amount;
}

//tạo Các lớp con
class QuaCam extends HoaQua{

}
class QuaTao extends HoaQua{

}
class CamCaoPhong extends HoaQua{

}
class CamSanh extends HoaQua{

}
class main{
    public static void main(String[] args) {
        // đặt các đối tượng cho các lớp con
        QuaCam fruit1=new QuaCam();
        fruit1.price=50000;
        fruit1.from="Hanoi";
        fruit1.D_import="23/09/2018";
        fruit1.amount=50;

        QuaTao fruit2=new QuaTao();
        fruit2.price=65000;
        fruit2.from="China";
        fruit2.D_import="02/10/2018";
        fruit2.amount=80;


        CamCaoPhong fruit3=new CamCaoPhong();
        fruit3.price=45000;
        fruit3.from="HoaBinh";
        fruit3.D_import="01/08/2018";
        fruit3.amount=74;


        CamSanh fruit4=new CamSanh();
        fruit4.price=55000;
        fruit4.from="Vien Chan";
        fruit4.D_import="26/08/2018";
        fruit4.amount=65;


        //in ra màn hình
        System.out.println("=======================");
        System.out.println("Qua Cam : ");
        System.out.println("Price = "+fruit1.price+" VND/kg");
        System.out.println("Import from = "+fruit1.from);
        System.out.println("Date of Import = "+fruit1.D_import);
        System.out.println("Amount import = "+fruit1.amount+" Kg");

        System.out.println("=======================");
        System.out.println("Qua Tao : ");
        System.out.println("Price = "+fruit2.price+" VND/Kg");
        System.out.println("Import from = "+fruit2.from);
        System.out.println("Date of Import = "+fruit2.D_import);
        System.out.println("Amount import = "+fruit2.amount+" Kg");

        System.out.println("=======================");
        System.out.println("Cam Cao Phong : ");
        System.out.println("Price = "+fruit3.price+" VND/Kg");
        System.out.println("Import from = "+fruit3.from);
        System.out.println("Date of Import = "+fruit3.D_import);
        System.out.println("Amount import = "+fruit3.amount+" Kg");

        System.out.println("=======================");
        System.out.println("Cam Sanh : ");
        System.out.println("Price = "+fruit4.price+" VND/Kg");
        System.out.println("Import from = "+fruit4.from);
        System.out.println("Date of Import = "+fruit4.D_import);
        System.out.println("Amount import = "+fruit4.amount+" Kg");

        }
}