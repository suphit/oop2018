/**
 * Package bài làm cho Câu 2
 * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
 * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
 * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;
class Shape{
    String color="red";
    boolean filled=true;
    public Shape(){
    }
    public Shape(String color, Boolean filled) {
        this.filled = filled;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public Boolean isFilled() {
        return filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "Shape's information : {color = " + color + ", filled = " + filled + "}";
    }
}
class Circle extends Shape{
    private double radius=1.0d;
    private final double Pi=3.14d;
    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Pi*radius*radius;
    }
    public double Perimeter(){
        return 2*Pi*radius;
    }
    public String toString() {

        return "Circle's information : {" + "radius=" + radius + ", color=" + color + ", filled = " + filled + "}";
    }
}
class Rectangle extends Shape{
    double Width = 1.0d;
    private double Length = 1.0d;
    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        Width = width;
        Length = length;
    }
    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        Width = width;
        Length = length;
    }
    public double getWidth() {
        return Width;
    }
    public double getLength() {
        return Length;
    }
    public void setWidth(double width) {
        Width = width;
    }
    public void setLength(double length) {
        Length = length;
    }
    public double setArea(){
        return Width*Length;
    }
    public double Perimeter(){
        return (Width+Length)*2;
    }
    public String toString() {
        return "Rectangle's information : {" + "color = " + color + ", filled = " + filled + ", Width = " + Width + ", Length=" + Length + "}";
    }
}
class Square extends Rectangle{
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);

    }
    public double getSide(){
        return Width;
    }
    public void setSide(double side){
        side = Width;
    }
    public void setWidth(double side){
        side = Width;
    }
    public void setLenght(double side){
        side = Width;
    }
    public String toString() {
        return "Square's information = {" + "color = " + color  + ", filled = " + filled + ", Side = " + Width + "}";
    }
}
class main{
    public static void main(String[] args) {

        Shape s= new Shape();
        Circle c= new Circle();
        Rectangle r = new Rectangle();
        Square sq = new Square();
        System.out.println(s.toString());
        System.out.println(c.toString());
        System.out.println("Circle's area is :"+c.getArea());
        System.out.println("Circle's perimeter is :"+c.Perimeter());
        System.out.println(r.toString());
        System.out.println("Rectangle's area is :"+r.setArea());
        System.out.println("Rectangle's Perimeter is :"+r.Perimeter());
        System.out.println(sq.toString());

    }
}