package Random_Code;

public class reverse_wbw {

	public static void main(String[] args) 
	{
		String str="My Name is Roshan Singh";
		int len= str.length(),k=0;
		char ch[] = new char[len]; 
		for(int j=len-1;j>=0;j--)
		{
			ch[k]= str.charAt(j);
			k++;
			//System.out.println(ch[j]);
		}
		String str2 = String.valueOf(ch);
		System.out.println(str2);
		
		String[] str_rev= str2.split(" ");
		/*
		 * for(int j=(str_rev.length)-1;j>=0;j--) { System.out.print(str_rev[j]);
		 * System.out.print(" "); }
		 */
		
	}

}
