/*Reading information from particular website

Create WebCrawler
*/

/*import java.io.*;
import java.util.Scanner;
import java.net.*;
public class WebCrawler{
	
	public static void main(String []args)throws MalformedURLException{
		
		String[] line=new String[100];
		int cc=0;
		char[] fullch=new char[5000];
		int flag=1;
		int i=0;
		try{
			Scanner sc = new Scanner(System.in);
			String rawurl = sc.next();
			System.out.println(rawurl);
			java.net.URL url = new java.net.URL(rawurl);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNextLine()){	
				line[i]=input.nextLine();
				System.out.println(line[i]);
				char[] ch = (line[i]).toCharArray();
				cc+=ch.length;
				i++;
			}			
			System.out.println("Characters: "+cc);
		}
		catch(MalformedURLException e){
			System.out.println("URL not found");
		}
		catch(IOException e){
			System.out.println("IOException found"+e);
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException found"+e);
		}
	}
}*/
import java.io.*;
import java.util.Scanner;
import java.net.*;
public class WebCrawler{
	
	public static void main(String []args)throws MalformedURLException{
		
		String[] line=new String[10000];
		int cc=0;
		char[] fullch=new char[5000];
		int flag=1;
		int i=0;
		try{
			Scanner sc = new Scanner(System.in);
			String rawurl = sc.next();
			System.out.println(rawurl);
			java.net.URL url = new java.net.URL(rawurl);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNextLine()){	
				line[i]=input.nextLine();
				System.out.println(line[i]);
			}			
			System.out.println("flag: "+flag);
		}
		catch(MalformedURLException e){
			System.out.println("URL not found");
		}
		catch(IOException e){
			System.out.println("IOException found"+e);
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException found"+e);
		}
	}
}
