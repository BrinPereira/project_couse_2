import java.io.*;
import java.util.*;
class Paging
{
public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
  
System.out.println("Enter linear address");

String st=sc.nextLine();

    String bin = "";
    String binFragment = "";
    int iHex;
    st = st.trim();
    st = st.replaceFirst("0x", "");

    for(int i = 0; i < st.length(); i++){
        iHex = Integer.parseInt(""+st.charAt(i),16);
        binFragment = Integer.toBinaryString(iHex);

        while(binFragment.length() < 4){
            binFragment = "0" + binFragment;
        }
        bin += binFragment;
       }

System.out.println(bin);

String directory=bin.substring(0,10);
String table=bin.substring(10,20);
String offset=bin.substring(20);
System.out.println("\nDirectory is "+directory);
System.out.println("\nTable is "+table);
System.out.println("\nOffset is "+offset);

String cr="00000000000000000000";

String Tab[]=new String[2];
String Dir[]=new String[2];

Tab[0]="00000000000000000000000011000010";
Tab[1]="00000000000000000000";
Dir[0]="00000000000000000000000110001010";
Dir[1]="10000000000000000011";

int dr= Integer.parseInt(directory,2);

int tb=Integer.parseInt(table,2);
int of=Integer.parseInt(offset,2);
int Tb1=Integer.parseInt(Tab[0],2);
int Tb2=Integer.parseInt(Tab[1],2);
int Dr1=Integer.parseInt(Dir[0],2);
int Dr2=Integer.parseInt(Dir[1],2);

StringBuffer cor=new StringBuffer(cr);
while (cor.length() <32) {   
               cor.insert(0, '0');   
        } 
int cr3= Integer.parseInt(cr,2);

int dirb=cr3+dr;

if(dirb==Tb1)
{System.out.println("\nPage directory base address "+cr);
   if(Dr1==tb)
    System.out.println("\nPage table base address "+Dir[0]);
  else
    {System.out.println("\npage not present");
      System.exit(0);
     }
}
else
{System.out.println("\npage not present");
  System.exit(0);
}

int phy=Dr2+of;
String pp=Integer.toBinaryString(phy);
StringBuffer py=new StringBuffer(pp);
while (py.length() <32) {   
               py.insert(0, '0');   
        } 
System.out.println("Physical address:"+py);

}
}