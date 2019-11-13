class Label{
    public static void main(String [] args)
    {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130};

        System.out.println("Printing the value of a: ");
        for(int i = 0; i <= 12; i++ )
        {
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println();

        
       
        System.out.println("After using Label, the value of a: ");

        Task:
        for(int i = 0; i <= 12; i++)
        {
            if(i == 10){
            
            break Task;
            }
            System.out.println(a[i]);

            
        }


    }
}