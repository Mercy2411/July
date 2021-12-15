package org.phone;

public class Phone {
private void phoneInfo(String name, int rate) {
	System.out.println("phone name is :"+name +"\n"+"phone rate is:"+rate);

}
private void phoneInfo(int frontcamerasize ,String OSname) {
	System.out.println("phone camera size:"+frontcamerasize +"\n" +"phone os name is :"+OSname);

}
public static void main(String[] args) {
	Phone p = new Phone();
	p.phoneInfo("oppo", 10000);
	p.phoneInfo(32, "ram");
}
}
