
import java.util.*;
public class puzzle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int goal[][]={{1,2,3},{8,0,4},{7,6,5}};
        int init[][]={{2,8,3},{1,4,0},{7,6,5}};
        int temp[][]={{0,0,0},{0,0,0},{0,0,0}};
        int h=0;
        int hs[]={0,0,0,0};
        boolean flag= false;
        System.out.print("\n GOAL \n");
         for(int i = 0 ;i<3;i++)
        {
          for(int j = 0 ;j<3;j++)
          {
          System.out.print(" "+goal[i][j]);
         }
           System.out.print("\n ");
        }
          System.out.print("\n Initial \n");

         for(int i = 0 ;i<3;i++)
        {
         for(int j = 0 ;j<3;j++)
         {
          System.out.print(" "+init[i][j]);
         }
           System.out.print("\n ");
        }
     boolean hp[]={true,true,true,true};
        while(flag == false)
        {
            System.out.print("/////////////////////");
            h=0;
            int select= 0;
            int row=0;
            int col=0;
            for(int i = 0 ;i<3;i++)
            {
             for(int j = 0 ;j<3;j++)
                {
                 if(init[i][j]== 0)
                    {
                     row = i;
                     col = j;
                    }
                  temp[i][j] = init[i][j];

                   if(goal[i][j]== init[i][j] && temp[i][j]!=0)
                    {

                    }
                   else
                     {
                        h++;
                     }
                }
               }
            if(h==1)
            {
             System.exit(0);
            }
            System.out.print("\n h = "+h+" \n");
            
            
        if(col==2)
        {
          hp[0]=false;
        }
        if(col==0)
        {
          hp[1]=false;
        }
        if(row==2)
        {
           hp[2]=false;
        }
        if(row==0)
        {
           hp[3]=false;
        }
        
        
    boolean sel=false;
    if(hp[0] == true)
     {
      temp[row][col] = temp[row][col+1];
              temp[row][col+1]=0;
      for(int i = 0 ;i<3;i++)
        {
         for(int j = 0 ;j<3;j++)
           {
            if(goal[i][j]== temp[i][j] && temp[i][j]!=0)
            {

            }
            else
            {
              select++;
            }
         }
        }
       System.out.print("\n left = "+select+" \n");
        if(select > h)
        {
            select=0;

             for(int i = 0 ;i<3;i++)
            {
             for(int j = 0 ;j<3;j++)
                {
                  temp[i][j] = init[i][j];
                }
             }
            }
        else{
           select=0;
           sel=true;
        }
     }
     if(hp[1] == true && sel==false)
     {
      temp[row][col] = temp[row][col-1];
      temp[row][col-1]=0;
      for(int i = 0 ;i<3;i++)
        {
         for(int j = 0 ;j<3;j++)
           {
            if(goal[i][j]== temp[i][j]&& temp[i][j]!=0 )
            {

            }
            else
            {
              select++;
            }        }        }
      System.out.print("\n right= "+select+" \n");

        if(select > h)
        {
            select=0;
            for(int i = 0 ;i<3;i++)
            {
             for(int j = 0 ;j<3;j++)
                {
                  temp[i][j] = init[i][j];
                }             }       }
        else{
          select=1;
           sel=true;
        }
     }
    if(hp[2] == true && sel==false)
     {
      temp[row][col] = temp[row+1][col];
       temp[row+1][col]=0;
      for(int i = 0 ;i<3;i++)
        {
         for(int j = 0 ;j<3;j++)
           {
            if(goal[i][j]== temp[i][j]&& temp[i][j]!=0)
            {
            }
            else
            {
              select++;
            }
         }
        }
      System.out.print("\n up= "+select+" \n");
       if(select > h)
        {
            select=0;
            for(int i = 0 ;i<3;i++)
            {
             for(int j = 0 ;j<3;j++)
                {
                  temp[i][j] = init[i][j];
                }
             }
        }
        else{
           select=2;
           sel=true;
        }
     }
     if(hp[3] == true && sel==false)
     {
     temp[row][col] = temp[row-1][col];
       temp[row-1][col]=0;
      for(int i = 0 ;i<3;i++)
        {
         for(int j = 0 ;j<3;j++)
           {
            if(goal[i][j]== temp[i][j] && temp[i][j]!=0 )
            {

            }
            else
            {
              select++;
            }
         }
        }
       System.out.print("\n down= "+select+" \n");
        if(select > h)
        {
            select=0;
        }
        else{
           select=3;
           sel=true;
        }
     }
  if(sel == false)
  {
      System.out.print("There is no solution");
      System.exit(0);
  }
  else{
        for(int i = 0 ; i< 4;i++)
        {
            hp[i]=true;
        }
            if(select == 0)
            {
                hp[1]=false;
            }
            else if(select==1)
            {
                hp[0]=false;
            }
            else if(select == 2)
            {
                hp[3]=false;
            }
            else if(select==3)
            {
                hp[2]=false;
            }
        }
    for(int i = 0 ;i<3;i++)
        {
         for(int j = 0 ;j<3;j++)
         {
          init[i][j]=temp[i][j];
          System.out.print(" "+init[i][j]);
         }
           System.out.print("\n ");
       }     }    }}
