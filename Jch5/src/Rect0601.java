public class Rect0601 extends Shape0601{
	double l,w,cost;
	Rect0601(String n,double l, double w,double c){super(n);this.l=l;this.w=w;this.cost=c;}
	double getArea() {return l*w;}
	double getPer() {return 2*(l+w);}
	double getCost() {return cost*getArea();}
	
	public static void main(String[] args) {
		Rect0601 myRect=new Rect0601("�� ��",30,20,50000);
		Rect0601 yourRect=new Rect0601("�� ��",10,20,30000);

		System.out.println(myRect.getName()+" / ���� : "+myRect.getArea()+" / �ѷ� : "+myRect.getPer()+" / ���� : "+myRect.getCost());
		System.out.println(yourRect.getName()+" / ���� : "+yourRect.getArea()+" / �ѷ� : "+yourRect.getPer()+" / ���� : "+yourRect.getCost());
	}
}