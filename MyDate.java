package Practice;

import java.util.Scanner;

public class MyDate 
{
	private  int day;
	private  int month;
	private int year;
	MyDate()
	{
		day=20;
		month=10;
		year=2020;
	}
	MyDate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void display()
	{
		System.out.println(day+"/"+month+"/"+year);
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day");
		int day=sc.nextInt();
		System.out.println("Enter Day");
		int month=sc.nextInt();
		System.out.println("Enter Day");
		int year=sc.nextInt();
		System.out.println(day+"/"+month+"/"+year);
	}
	public static void main(String[] args) {
		System.out.println("Using Default Constructor Date is:");
		MyDate d=new MyDate(20,10,2020);
		d.display();
		d.accept();
		System.out.println("Using Paramerized Constructor Date is:");
		MyDate d1=new MyDate();
		d1.setDay(20);
		d1.setMonth(10);
		d1.setYear(2020);
		d1.display();
		
	}
	

}
