package telegram;

public class Psuedocode {
	public static int funn(int a,int b)
	{
		if((a-4)<(b&5) && (7+b)<(b^a)) {
			b=a+2;
			b=3+1+b;
			b=3+1+a;
			return funn(a, b)-b+funn(a+b, b);
		}
		return b+1;
	}
	public static void question73()
	{
		int p=8,q=7,r=9;
		r=11+q;
		if((r+p+q)<(p-q-r))
		{
			System.out.println("true");
			q=r+p;
			if((r+9)<8+r)
			{
				p=(r+9)+r;
			}
			else {
				p=(p+12)+p;
			}
		}
		else {
			q=(1+7)+r;
			if((q+p+5)<(p+r+q))
				q=(q+p)+r;
		}
		p=(r+r)+r;
		System.out.println(p+q+r);
	}
	public static void question71()
	{
		int a=3,b=5,c=4;
		c=(5^2)+a;
		for (c = 3; c<=5; c++) {
			b=(a+9)&c;
			a=3&a;
			b=(c^b)+c;
			a=(5+8)&a;
		}
		System.out.println(a+b);
	}
	public static void question70()
	{
		int p=1,q=5,r=10;
		r=(r&q)^q;
		q=11+q;
		r=(4+1)+q;
		System.out.println(p+q+r);
	}
	public static void question69() {
		int a=4,b=7,c=5;
		for (c = 3; c <= 5; c++) {
			if((2&a)<(b+2)) {
				System.out.println("In For");
				System.out.println(a+" "+b+" "+c);
				continue;
			}
			System.out.println("Continue");
			a=(c&6)+c;
			b=(c+11)+b;
		}
		System.out.println(a+b);
	}
	public static void question68() {
		int p=4,q=2,r=5;
		p=(q+p)+p;
		if((q+p)<(r-q)&&3>p)
		{
			p=(q+r)+p;
			if((p+r)+(r+q)>(p+r+q))
				r=q+p;
			else {
				r=(p+r)+p;
			}
			p=(9&6)+q;
		}
		else {
			System.out.println("else");
			q=r&r;
			if((q-5)<(5-q))
			{
				System.out.println("in if");
				r=(6+6)&q;
				q=(q+7)+r;
			}
			
			p=(1^11)+q;
			System.out.println(p+" "+q+" "+r);
		}
		System.out.println(p+q+r);
	}
	public static void question67() {
		int p=4,q=2,r=6;
		if((7+r)<q || (p+r)<q)
		{
			if((2+3)<q)
				r=(7+11)+p;
		}
		else {
			r=(6+4)&p;
			if((p+4)<(9+p))
				q=(p+6)&r;
			r=(q+4)&p;
		}
		q=p^p;
		System.out.println(p+" "+q+" "+r);
		System.out.println(p+q+r);
	
	}
	public static int question66(int a,int b) {
		if(b<4 && 1>a)
		{
			a=a+1;
			a=(a+3)+a;
			return question66(a, b+a);
		}
		return a-b+1;
	}
	public static int question65(int a,int b)
	{
		if(b>6 && b<a)
		{
			b=2+1+a;
			a=b+2;
			b=2+a+b;
			return a-funn(a, b);
		}
		return b-a+1;
	}
	public static int question64(int a, int b) {
		if(b>a && a>3)
		{
			a=(b+1)+a;
			b=1+3+a;
			return a-question64(b, b);
		}
		return b-1;
	}
	public static void question63() {
		int p=3,q=5,r=7;
		for (r = 4; r <= 5; r++) {
			p=p+q;
			q=(11&7)+q;
		}
		p=2&p;
		System.out.println(p+q);
	}
	public static void question77() {
		int p=2,q=4,r=5;
		for (r = 2; r <= 6; r++) {
			if((p+q)<(r+p) || 4>q)
			{
				q=(r+p)+r;
				q=q+p;
			}
			if((q+r)+(r+p)>(q+p))
			{
				q=p+q;
				System.out.println(p+" "+q+" "+r);
				continue;
			}
			p=p+r;
		}
		System.out.println(p+" "+q+" "+r);
		System.out.println(p+q+r);
	}
	public static void question75() {
		System.out.println("Question 75");
		int p=2,q=5,r=4;
		p=(11+8)^q;
		for (r = 2; r <= 5; r++) {
			q=(4+11)+p;
			p=p^p;
		}
		for (r = 2; r <= 4; r++) {
			q=10+r;
			p=(9+6)&p;
		}
		System.out.println(p+" "+q);
		System.out.println(p+q);

	}
	public static void question64() {
		int p=7,q=7,r=6;
		if((q+p+r)<(6-q))
			r=(p^r)^r;
		else {
			r=(r^11)+q;
		}
		if((p^r)<(q+p))
			q=(r+p)+p;
		System.out.println("Question64");
		System.out.println(p+" "+q+" "+r);
		System.out.println(p+q+r);
	}
	public static void question1() {
		int p=5,q=6,r=9;
		if((r+p)<(p-r) || q>r)
		{
			p=(11+5)+r;
			p=1+p;
		}
		else {
			q=(r+1)&q;
		}
		r=11&r;
		System.out.println(p+" "+q+" "+r);
		System.out.println(p+q+r);
	}
	public static void question2()
	{
		int a=1,b=5,c=10;
		a=2+c;
		c=(10+6)^a;
		System.out.println(a+" "+b+" "+c+'\n'+(a+b+c));
	}
	public static void question3() {
		int p=5,q=6,r=9;
		if(5<r || (r&p)<p)
			r=12+p;
		r=(p+11)+p;
		if((p+r)>(q-p))
			r=r+r;
		r=3+q;
		System.out.println(p+" "+q+" "+r+'\n'+(p+q+r));
	}
	public static void question4()
	{
		int a=7,b=8,c=7;
		for (c = 3; c <= 6 ; c++) {
			if((a+c+b)<(c+b+a))
				continue;
			a=10&c;
			b=9+b;
		}
		System.out.println(a+b);
	}
	public static void question5() {
		int p=6,q=2,r=7;
		if((q&p&r)<(r&q))
			r=1+r;
		else
			r=r+r;
		p=(p+r)^p;
		if((p-q)<(r+p))
			r=r+r;
		System.out.println(p+" "+q+" "+r+'\n'+(p+q+r));
	}
	public static void question6() {
		int a=0,b=5,c=5;
		b=(c+a)&b;
		if(c<b || (b^a)<a)
			c=(c+12)+b;
		System.out.println(a+" "+b+" "+c);
		if((c+a)<(a-c))
			b=(b+12)+b;
		System.out.println(a+" "+b+" "+c+" "+(a+b+c));
	}
	public static void question7()
	{
		int p=9,q=5,r=5;
		p=(r&q)&q;
		r=(r&r)&r;
		r=(q+5)+q;
		System.out.println(p+q+r);
	}
	
	public static void main(String[] args) {
		System.out.println(funn(6, 7));
		question73();
		question71();
		question70();
		question69();
		question68();
		question67();
		System.out.println(question66(5, 3));
		System.out.println(question65(9, 8));
		System.out.println(question64(6, 7));
		question63();
		question77();
		question75();
		question64();
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
	}
}
