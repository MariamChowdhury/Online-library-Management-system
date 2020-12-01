
package online.library;
import java.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.lang.*;

 class MemberRegistration {
        Scanner cin= new Scanner(System.in);
    public
       Set <String> username= new HashSet<String>();     
        HashMap<String,String> user = new HashMap<String,String>();
        MemberRegistration()
        {
            user.put("Roy","19511034");
            user.put("Asif", "19511005");
            user.put("Mariam", "19511020");
            user.put("Tuba", "19511023");
            user.put("admin","123456");
             
            username.add("Roy");
             username.add("Asif");
              username.add("Tuba");
               username.add("Mariam");
                username.add("admin");
        }
        
        int registration()
        {
            String s1,s2;
            System.out.println("Enter user name:(regi)");
            s1= cin.next();
            
            if(username.contains(s1))
            {
                System.out.println("The entered user name is already in use");
                return 0;
            }
            else 
            {
                System.out.println("Enter a password:");
                s2= cin.next();
                user.put(s1,s2);
                username.add(s1);
                return 1;
            }
        }
            
}
 class MemberLog extends MemberRegistration
{

     Set <String> boi= new HashSet<String>();  
     MemberLog()
     {
        boi.add("Mathematics-1");
        boi.add("Bangla");
        boi.add("English");
        boi.add("Physics");
        boi.add("Chemistry");
        boi.add("Biology");
        boi.add("Financial and Managerial Accounting");
        boi.add("Ethics and Cyber Law");
        boi.add("Electrical Devices and Circuits");
        boi.add("Teach yourself c");
        boi.add("Complete reference c++");
        boi.add("The complete reference Java");
        boi.add("C programming");
        boi.add("Partial differentiation");
        boi.add("Math-2");
        boi.add("Economics");
        boi.add("Statistics");
        boi.add("French");
        boi.add("Learn python");
        boi.add("Machine learning");  
     }
    int login()
    {
        String s1,s2;
        System.out.println("Enter user name:");
        s1= cin.next();
        System.out.println("Enter password:");
        s2= cin.next();
        if(!username.contains(s1))
        {
            System.out.println("Couldn't find user name");
            return 0;
        }
        else if(user.get(s1) == null ? s2 != null : !user.get(s1).equals(s2))
        {
            System.out.println("Password Didnt match");
            return 0;
        }
        
        return 1;
    }
    int librarianlogin()
    {
        String s1,s2;
        System.out.println("Enter user name:");
        s1= cin.next();
        System.out.println("Enter password:");
        s2= cin.next();
        if(!"admin".equals(s1))
        {
            System.out.println(" user name didnt match");
            return 0;
        }
        else if(user.get(s1) == null ? s2 != null : !user.get(s1).equals(s2))
        {
            System.out.println("Password Didnt match");
            return 0;
        }
        
        return 1;
    }
}

class bookedit extends MemberLog
{
    public
            int press;
    void display()
    {
        System.out.println("Welcome to library management system:");
        System.out.println("What do you want to do: ");
        System.out.println("To see all the available books press :1");
        System.out.println("For Adding new books Press :2 ");
        System.out.println("For adding a new teacher id Press :3");
        System.out.println("If you want to exit or end precess press :0 ");
        
        press= cin.nextInt();
        
        if(press==1)
        {
            System.out.println(boi);
                
        }
        else if(press==2)
        {
            String s;
            System.out.println("Enter the name of the Book:");
            s= cin.next();
            
            while(true)
            {
                if(boi.contains(s))
                {
                    System.out.println("Entered book is already in the library");
                    System.out.println("enter the name again");
                    s= cin.next();
                }
                
                else
                {
                    boi.add(s);
                    break;
                }
            }
        }
        else if(press==3)
        {
            String s,x;
            System.out.println("Enter the user name:");
            s= cin.next();
            while(true)
            {
                if(username.contains(s))
                {
                    System.out.println("THe entered name already exists");
                    System.out.println("Please try with a different name:");
                    s= cin.next();
                }
                else 
                {
                    username.add(s);
                    System.out.println("Enter a password:");
                    x=cin.next();
                    user.put(s,x);
                    System.out.println("Account added successfully");
                    break;
                }
            }
        }
            
    }
}

class booksearch extends bookedit
{
    public
            int NumberOfBooks=0;
    int [] issu = new int[3];
     int [] give = new int[3];
            int decide;
    int searchbook()
    {
        int sum=1;
        System.out.println("If you want to issue a book Press: 1");
        System.out.println("If you want to give a book back Press: 2");
        System.out.println("If you want to exit Press: 0");
        decide= cin.nextInt();
        
        if(decide==1)
        {
            System.out.println("Available books are :");
            System.out.println(boi);
            
            System.out.println("Enter the name of the book you want to issu: ");
            String book;
            book = cin.next();
            NumberOfBooks++;
            while(true)
            {
                System.out.println("Would you like to issu another book : if yes press 'Y' else press 'N' ");
                char ch;
                ch= cin.next().charAt(0);
                
                if(ch=='n' || ch== 'N')
                {
                    System.out.println("Enter the date of issue:");
                    for(int i=0; i<3; i++)
                    {
                        issu[i] = cin.nextInt();

                    }
                    return 0;
                }
                 else
                {
                    if(NumberOfBooks>=4)
                    {
                        System.out.println("Sorry you've already reached your limit of issuing");
                        
                        if(issu[0]==0 && issu[1]==0 && issu[2]==0)
                        {
                            System.out.println("Enter the date of issue:");
                    for(int i=0; i<3; i++)
                    {
                        issu[i] = cin.nextInt();

                    }
                        }
                        break;
                    }
                    System.out.println("Enter the name of the book you want to issue:");
                    String bois;
                    bois= cin.next();
                    NumberOfBooks++;
                    //System.out.println("Enter the date of issue:");
                }
            }
        }
         else if(decide==2)
        {
            System.out.println("How many books would you like to return :");
            int ReturnBooks;
            ReturnBooks= cin.nextInt();
            NumberOfBooks-=ReturnBooks;

            System.out.println("Enter the date of returning the books:");
            for(int i=0; i<3; i++)
            {
                give[i]= cin.nextInt();
                //math+=give[i];
            }
//            for(int i=0; i<3; i++)
//            {
//                cout<<abs(give[i]-issu[i])<<endl;
//            }
            if(give[2]-issu[2]>=1)
            {
                sum=1;
            }
            else if(give[0]-issu[0]>=7)
            {
                sum=1;
            }
            else if(Math.abs(give[1]-issu[1])>=1)
            {
                sum=1;
            }

            if(sum==1)
            {
                System.out.println("You have to pay penalty of 500TK \n Please pay the penalty amount:");
                int taka;
                taka= cin.nextInt();
                if(taka==500)
                    System.out.println("Thank you for paying the penalty");
            }
            else
            {
                System.out.println("Thank you for returning the issued books");

            }
            return 0;
        }
        else
            return 1;
        
        return 0;
    }
}

public class OnlineLIbrary {

    public static void main(String[] args) {
         Scanner cin = new Scanner(System.in);
        booksearch ob = new booksearch();
       
        while(true)
        {
         System.out.println("Welcome to X online library.\n Are you a student or a librarian ?\n If librarian Press: 1 \n if student or teacher Press: 2 \n If you want to exit press: 3 ");
    int n;
    n= cin.nextInt();
    if(n==1)
    {
        while(true)
        {
            int x= ob.librarianlogin();
            if(x==1)
            {
                System.out.println("Login successful");
                
                break;
            }
        }
        //bookedit obj;
        while(true)
        {
            ob.display();
            if(ob.press==0)
                break;

        }

    }

    else if(n==2) {
        System.out.println("Are you a member? if yes press Y or press N");
    char c;
    c = cin.next().charAt(0);
    if(c=='N' || c=='n')
    {
        while(true)
        {
            int x= ob.registration();
            
            if(x==1)
            {
                System.out.println("Registration successful");

                System.out.println("Now please login using your ID and password:");
                break;
            }
        }

    }

    while(true)
    {
        int x= ob.login();
        if(x==1)
        {
            System.out.println("Login successfull");
            break;
        }
    }

    while(true)
    {
        int x= ob.searchbook();
        if(x==1)
        {
            System.out.println("Thank you very much, Have a safe day you cutie pie *____* ... Take love *__* ");
            break;
        }

    }
        System.out.println("Logging out");
        }
   
    else if(n==3)
    {
        System.out.println("Thank you for visiting us");
        break;
    }
        
    }
    
}
    
}
