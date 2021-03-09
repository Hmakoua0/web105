
import java.util.Scanner;//needed in order to be able to use the Scanner class to get the user's input

public class Project1_Haida_Makouangou
{
   public static void main(String[] args) {
Scanner sc=new Scanner(System.in); // Scanner Object
// Taking input from the user
System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
int gpu=sc.nextInt();
System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
int cpu=sc.nextInt();
System.out.print(" Please enter the number of cores of your processor: ");
int cores=sc.nextInt();
System.out.println("What is the resolution of your monitor?");
System.out.println("\t 1. 1280 x 720");
System.out.println("\t 2. 1920 x 1080");
System.out.println("\t 3. 2560 x 1440");
System.out.println("\t 4. 3840 x 2160");
System.out.print("Please select from the options above: ");
int ch=sc.nextInt();
double multiplier=0.0;
String resolution="";
// assigning multiplier and resolution depending upon the choice of the user
if(ch==1)
{
multiplier=1;
resolution="1280 x 720";
}
else if(ch==2)
{
multiplier=.75;
resolution="1920 x 1080";
}
else if(ch==3)
{
multiplier=.35;
resolution="2560 x 1440";
}
else if(ch==4)
{
multiplier=.35;
resolution="3840 x 2160";
}
// calculating the Performace score
double score=((5*gpu)+(cores*cpu))*multiplier;
  
String quality="";
// determining the quality depending upon the Performace score
if(score>17000)
quality="Ultra";
else if(score>15000 && score<=17000)
quality="High";
else if(score>13000 && score<=15000)
quality="Medium";
else if(score>11000 && score<=13000)
quality="Low";
else
quality="Unable to Play";
  
// string object for heading
String heading=new String("Computer Hardware Graphics Quality Recommendation Tool");
// printing the details
System.out.println(heading);
System.out.println("GPU Clock Speed: "+gpu+"MHz");
System.out.println("CPU Clock Speed: "+cpu+"MHz");
System.out.println("Number of Cores: "+cores);
System.out.println("Monitor Resolution: "+resolution);
System.out.println("Performace Score: "+score);
System.out.println("Recommended Graphics Quality: "+quality);
  
   }
}