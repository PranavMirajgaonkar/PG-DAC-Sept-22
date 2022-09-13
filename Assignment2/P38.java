class P38
{
    public static void main(String ar[])  
    {   
        int r = 1;  
        for (int i = 9; i > 0; i--)  
        {  
            for (int j = 1; j <= i*2-2; j++)  
            {  
                System.out.print(" ");  
            }  
            for (int j = 1; j <= r; j++)            
            {  
                System.out.print(j+" ");  
            }   
            for (int j = r-1; j >= 1; j--)  
            {                 
                System.out.print(j+" ");              
            }                           
            System.out.println();  
			r++;  
        }  
    }  
}