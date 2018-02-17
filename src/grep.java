import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class grep {
    public static void main(String[] args) {



            Scanner sc=new Scanner(System.in);

            System.out.println("Введите строку");
            String str=sc.nextLine();


            System.out.println("Введите аргумент для поиска");
            String argg=sc.nextLine();

           // System.out.println(str);
            String[] items=str.split("\\.");//Добавить разделение после ! и ?
            ArrayList<String> itemList=new ArrayList<String>();


            for (String item:items)
            {
                itemList.add(item);
                System.out.println(item);
            }

            System.out.println("*******");
            System.out.println("filtred");

         /*   for (String s:itemList)
            {
                if(s.toLowerCase().contains(argg.toLowerCase()))
                {
                    System.out.println(s);
                }
            }*/
           Pattern p=Pattern.compile(argg);
           Matcher m=p.matcher("");
           for(String s:itemList)
           {
               m.reset(s);
               if(p.matcher(s).matches()==true)
               {
                   System.out.println(s);
               }
           }



    }
}