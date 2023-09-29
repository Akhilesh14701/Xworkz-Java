class ArrayOperations{
	public static void main(String a[]){
		int [][]number={{13,25,76,45},{3,2,9,76,345},{3,4},{89,100,14,10,57}};
		int sum=0,count=0,l=0;	
	for(int i=0;i<number.length;i++)
	{
		for(int j=0;j<number[i].length;j++)
		{
			System.out.println(number[i][j]);
			sum=sum+number[i][j];
			count++;
			l++;
			
			if(number[i][j]%2==0)
			{	
				System.out.println("number is even"+number[i][j]);
			}
			else
			{
				System.out.println("number is odd"+number[i][j]);
			}
		}
		System.out.println("length of an array"+l);
		l=0;
		
	}
	System.out.println("sum of all elements    "+sum);
	System.out.println("count     "+count);
	}
}