class Test
{
 int sum=0;
  void add(int a)
	{
	  System.out.println(a);
	}
  void add(int a,int b)
	{
	  System.out.println(a+b);
	}
  void add(int a,int b,int c)
	{
	  System.out.println(a+b+c);
	}
  void add(int a[],int b)
	{
	  for(int i=0;i<b;i++)
	  {
		sum+=a[i];
	  }
	  System.out.println(sum);
	}
 public static void main(String...a)
	{
	  Test t1=new Test();
	  int arr[]={1,2,3,4,5};
	  int n=5;
	  t1.add(1);
	  t1.add(1,2);
	  t1.add(1,2,3);
	  t1.add(arr,n);
	}
}
