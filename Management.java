import java.io.*;

class Management
{

public static void main (String[] args)throws IOException 

{
    
try
    
{
    
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
System.out.println("Enter the number of students");
    
int n=Integer.parseInt(br.readLine());
    
String name[]=new String[n];
    
int age[]=new int[n];
    
String branch[]=new String[n];
    
int year[]=new int[n];
    
int sem[]=new int[n];
    
float prev_sem[]=new float[n];
    
System.out.println("Enter the name, age, branch, year, semester and prev semester score of the students in order");
    
for(int i=0;i<n;i++)
    
{
        
System.out.println("Student "+(i+1));
        
name[i]=br.readLine();
        
age[i]=Integer.parseInt(br.readLine());
        
branch[i]=br.readLine();
        
year[i]=Integer.parseInt(br.readLine());
        
sem[i]=Integer.parseInt(br.readLine());
        
prev_sem[i]=Float.parseFloat(br.readLine());
    
}
    
System.out.println("NAME"+'\t'+"AGE"+'\t'+"BRANCH"+'\t'+"YEAR"+'\t'+"SEMESTER"+'\t'+"PREV_SEM_SCORE");
    
for(int i=0;i<n;i++)
    
{
        
System.out.println(name[i]+'\t'+age[i]+'\t'+branch[i]+'\t'+year[i]+'\t'+sem[i]+'\t'+'\t'+prev_sem[i]);
    
}
    
System.out.println("Enter the cut off marks for filtering the data");
    
float cutoff=Float.parseFloat(br.readLine());
    
System.out.println("Details of the students clearing the cut off are:");
    
int c=0;
    
for(int i=0;i<n;i++)
    
{
        
if(prev_sem[i]>=cutoff)
        
{
            
if(c==0)
           
{ 
System.out.println("NAME"+'\t'+"AGE"+'\t'+"BRANCH"+'\t'+"YEAR"+'\t'+"SEMESTER"+'\t'+"PREV_SEM_SCORE"); c=-1;
}
            
System.out.println(name[i]+'\t'+age[i]+'\t'+branch[i]+'\t'+year[i]+'\t'+sem[i]+'\t'+'\t'+prev_sem[i]);
        
}
    
}
    
if(c==0)
    
System.out.println("Sorry no student could qualify the cut off");
    
}
    
catch(Exception e)
    
{
        
System.out.println("Enter data in correct format");
    
}
}
}