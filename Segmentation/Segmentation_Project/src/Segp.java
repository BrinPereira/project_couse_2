import java.io.*;
import java.util.*;
class Segp
{
public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
  
System.out.println("Enter virtual address");
String hex=sc.nextLine();

    String bin = "";
    String binFragment = "";
    int iHex;
    hex = hex.trim();
    hex = hex.replaceFirst("0x", "");

    for(int i = 0; i < hex.length(); i++){
        iHex = Integer.parseInt(""+hex.charAt(i),16);
        binFragment = Integer.toBinaryString(iHex);

        while(binFragment.length() < 4){
            binFragment = "0" + binFragment;
        }
        bin += binFragment;
       }


System.out.println(bin);

String selctor=bin.substring(0,16);
String ofset=bin.substring(16,48);
System.out.println("\nSelector:\n"+selctor);
System.out.println("\nOffset:\n"+ofset);

String l=selctor.substring(14,16);
char t=selctor.charAt(13);

if((l.compareTo("00"))==0)
{System.out.println("\nkernel\n");
}
else if((l.compareTo("01"))==0)
{System.out.println("\nsystem service\n");
}
else if((l.compareTo("10"))==0)
{System.out.println("\nOS extension\n");
}
else if((l.compareTo("11"))==0)
{System.out.println("\nApplication\n");
}
else{}

if(t=='0')
System.out.println("Global access");
else
System.out.println("Local access");

int Gdt[][]={{44,1},{29,2},{38,3},{47,4},{56,5}};
int Ldt[][]={{110,1},{92,2},{83,3},{74,4},{65,5}};

int sl= Integer.parseInt(selctor,2);
int ofh=Integer.parseInt(ofset,2);
int base=0,j=1;
if(t==0)
{
 for(int i=0;i<5;i++) 
     if(sl==Gdt[i][j])
        base=Gdt[i][0];
}
else
{    for(int i=0;i<5;i++) 
     if(sl==Ldt[i][j])
        base=Ldt[i][0];
}

int poy=base+ofh;
String p=Integer.toBinaryString(poy);
StringBuffer pp=new StringBuffer(p);
while (pp.length() <32) {   
               pp.insert(0, '0');   
        } 
System.out.println("Linear address:"+pp);

String directory=pp.substring(0,10);
String table=pp.substring(10,20);
String offset=pp.substring(20);
System.out.println("\ndirectory:\n"+directory);
System.out.println("\ntable:\n"+table);
System.out.println("\noffset:\n"+offset);

String cr="00000000000000000000";

String Tab[]=new String[2];
String Dir[]=new String[2];

Tab[0]="00000000000000000000000011010001";
Tab[1]="00000000000000000000";
Dir[0]="00000000000000000000000101101010";
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
    {System.out.println("\npage not found");
      System.exit(0);
     }
}
else
{System.out.println("\npage not found");
  System.exit(0);
}

int phy=Dr2+of;
String pi=Integer.toBinaryString(phy);
StringBuffer py=new StringBuffer(pi);
while (py.length() <32) {   
               py.insert(0, '0');   
        } 
System.out.println("Physical address:"+py);

}
}
