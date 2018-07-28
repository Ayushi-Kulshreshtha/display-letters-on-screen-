import java.util.Scanner;

public class Magic{
public static void main(String args[])
{
Scanner input=new Scanner (System.in);
String word=input.next();
System.out.println("Your input was :\n" + word );
System.out.println("Here it is in symbols");

System.out.println((((((((((((((((((((((((((((word.toLowerCase()).replace("a", "0 0 # 0 0\n0 # 0 # 0\n0 # # # 0\n0 # 0 # 0\n0 # 0 # 0\n\n")).replace("b", "0 # # # 0\n0 # 0 # 0\n0 # # 0 0\n0 # 0 # 0\n0 # # # 0\n\n")).replace("c", "0 0 # # 0\n0 # 0 0 0\n0 # 0 0 0\n0 # 0 0 0\n0 0 # # 0\n\n")).replace("d", "0 # # 0 0\n0 # 0 # 0\n0 # 0 # 0\n0 # 0 # 0\n0 # # 0 0\n\n")).replace("e", "0 # # # 0\n0 # 0 0 0\n0 # # # 0\n0 # 0 0 0\n0 # # # 0\n\n")).replace("f", "0 # # # 0\n0 # 0 0 0\n0 # # 0 0\n0 # 0 0 0\n0 # 0 0 0\n\n")).replace("g", "0 # # # #\n0 # 0 0 0\n0 # 0 # #\n0 # 0 0 #\n0 # # # #\n\n")).replace("h", "0 # 0 # 0\n0 # 0 # 0\n0 # # # 0\n0 # 0 # 0\n0 # 0 # 0\n\n")).replace("i", "0 0 # 0 0\n0 0 0 0 0\n0 0 # 0 0\n0 0 # 0 0\n0 0 # 0 0\n\n")).replace("j", "0 0 0 # 0\n0 0 0 # 0\n0 0 0 # 0\n0 # 0 # 0\n0 0 # 0 0\n\n")).replace("k", "0 # 0 # 0\n0 # # 0 0\n0 # 0 0 0\n0 # # 0 0\n0 # 0 # 0\n\n")).replace("l", "0 # 0 0 0\n0 # 0 0 0\n0 # 0 0 0\n0 # 0 0 0\n0 # # # 0\n\n")).replace("m", "0 # 0 # 0\n# 0 # 0 #\n# 0 # 0 #\n# 0 # 0 #\n# 0 0 0 #\n\n")).replace("n", "# 0 0 0 #\n# # 0 0 #\n# 0 # 0 #\n# 0 0 # #\n# 0 0 0 #\n\n")).replace("o", "0 0 # 0 0\n0 # 0 # 0\n0 # 0 # 0\n0 # 0 # 0\n0 0 # 0 0\n\n")).replace("p", "0 # # # 0\n0 # 0 # 0\n0 # # # 0\n0 # 0 0 0\n0 # 0 0 0\n\n")).replace("q", "0 0 # 0 0\n0 # 0 # 0\n0 # 0 # 0\n0 # 0 # 0\n0 0 # 0 #\n\n")).replace("r", "0 # # # 0\n0 # 0 # 0\n0 # # # 0\n0 # # 0 0\n0 # 0 # 0\n\n")).replace("s", "0 0 # # 0\n0 # 0 0 0\n0 0 # 0 0\n0 0 0 # 0\n0 # # 0 0\n\n")).replace("t", "0 # # # 0\n0 0 # 0 0\n0 0 # 0 0\n0 0 # 0 0\n0 0 # 0 0\n\n")).replace("u", "0 # 0 # 0\n0 # 0 # 0\n0 # 0 # 0\n0 # 0 # 0\n0 # # # 0\n\n")).replace("v", "0 # 0 # 0\n0 # 0 # 0\n0 # 0 # 0\n0 # 0 # 0\n0 0 # 0 0\n\n")).replace("w", "# 0 0 0 #\n# 0 # 0 #\n# 0 # 0 #\n# 0 # 0 #\n0 # 0 # 0\n\n")).replace("x", "0 # 0 # 0\n0 # 0 # 0\n0 0 # 0 0\n0 # 0 # 0\n0 # 0 # 0\n\n")).replace("y", "0 # 0 # 0\n0 # 0 # 0\n0 0 # 0 0\n0 0 # 0 0\n0 0 # 0 0\n\n")).replace("z", "0 # # # 0\n0 0 0 # 0\n0 0 # 0 0\n0 # 0 0 0\n0 # # # 0\n\n")).replace("0", " "));

}
}