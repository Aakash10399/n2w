import java.io.*;
class n2w
{
    static String l1[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    static String l2[] = {"Ten","Eleven","Twelve","Thriteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
    static String l3[] = {"None","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};
    public static void main()throws IOException
    {
        BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello!");
        System.out.println("Enter A Number : ");
        int in = Integer.parseInt(y.readLine());
        if(in>=0 && in<=9)
        {
            System.out.println(l1[in]);
        }
        if(in>=10 && in<=19)
        {
            System.out.println(l2[in-10]);
        }
        if(in>=20 && in<=99)
        {
            System.out.print(l3[in/10]);
            if(in%10!=0)
            {
                System.out.print(" "+l1[in%10]+" ");
            }
        }
        if(in>=100 && in<=999)
        {
            System.out.print(" "+l1[in/100]+"Hundred");
            if(in%100>10 && in%100<20)
            {
                System.out.print(" "+l2[(in%100)-10]+" ");
            }
            else{
                if(((in/10)%10)!=0)
                {
                    System.out.print(" "+l3[((in/10)%10)]+" ");
                }
                if(in%10!=0)
                {
                    System.out.print(" "+l1[in%10]+" ");
                }
            }
        }
        if(in>=1000 && in<=9999)
        {
            System.out.print(" "+l1[in/1000]+"Thousand");
            if(((in/100)%10)!=0)
            {
                System.out.print(" "+l1[((in/100)%10)]+"Hundred");
            }
            if(((in%1000)%100)>10 && ((in%1000)%100)<20)
            {
                System.out.print(" "+l2[((in%1000)%100)-10]+" ");
            }
            else{
                if((((in/10)%100)%10)!=0)
                {
                    System.out.print(" "+l3[(((in/10)%100)%10)]+" ");
                }
                if(in%10!=0)
                {
                    System.out.print(" "+l1[in%10]+" ");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Want to Repeat Program?");
        System.out.println("yes/no");
        String in2 = y.readLine();in2 = in2.toLowerCase();
        if(in2.equals("yes")==true)
        {
        main();
        }
        else
        {
        System.exit(0);
        }
    }
}