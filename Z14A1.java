import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;
public class Z14A1
{
public static void main(String[] args) throws NumberFormatException, IOException
{
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int liczba1, liczba2, liczba3, liczba4, liczba5, liczba6, liczba7, liczba8;
int liczba1_wynik, liczba2_wynik, liczba3_wynik, liczba4_wynik;
String liczba1_bin,liczba2_bin,liczba3_bin,liczba4_bin,liczba5_bin,liczba6_bin,liczba7_bin,liczba8_bin,zera;
String liczba1_wynikbin, liczba2_wynikbin, liczba3_wynikbin, liczba4_wynikbin;



System.out.print("Podaj 1 liczbe IP:");
liczba1 = Integer.parseInt(reader.readLine());
System.out.println("Pierwszy oktet adresu IP=" +"("+liczba1+")10 = ("+Integer.toBinaryString(liczba1)+")2");
liczba1_bin=Integer.toBinaryString(liczba1);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba1).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba1_bin);
liczba1_bin=zera;
System.out.println("liczba z uzupe³nionym zerami do jednego bajta");
System.out.println("("+zera+")2");


System.out.println("");
System.out.print("Podaj 2 liczbe IP:");
liczba2 = Integer.parseInt(reader.readLine());
System.out.println("Drugi oktet adresu IP=" +"("+liczba2+")10 = ("+Integer.toBinaryString(liczba2)+")2");
liczba2_bin=Integer.toBinaryString(liczba2);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba2).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba2_bin);
liczba2_bin=zera;
System.out.println("liczba z uzupe³nionym zerami do jednego bajta");
System.out.println("("+zera+")2");


System.out.println("");
System.out.print("Podaj 3 liczbe IP:");
liczba3 = Integer.parseInt(reader.readLine());
System.out.println("Trzeci oktet adresu IP=" +"("+liczba3+")10 = ("+Integer.toBinaryString(liczba3)+")2");
liczba3_bin=Integer.toBinaryString(liczba3);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba3).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba3_bin);
liczba3_bin=zera;
System.out.println("liczba z uzupe³nionym zerami do jednego bajta");
System.out.println("("+zera+")2");


System.out.println("");
System.out.print("Podaj 4 liczbe IP:");
liczba4 = Integer.parseInt(reader.readLine());
System.out.println("Czwarty oktet adresu IP=" +"("+liczba4+")10 = ("+Integer.toBinaryString(liczba4)+")2");
liczba4_bin=Integer.toBinaryString(liczba4);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba4).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba4_bin);
liczba4_bin=zera;
System.out.println("liczba z uzupe³nionym zerami do jednego bajta");
System.out.println("("+zera+")2");


System.out.println("");
System.out.print("Podaj 1 liczbe maski podsieci:");
liczba5 = Integer.parseInt(reader.readLine());
System.out.println("Pierwszy oktet maski podsieci=" +"("+liczba5+")10 = ("+Integer.toBinaryString(liczba5)+")2");
liczba5_bin=Integer.toBinaryString(liczba5);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba5).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba5_bin);
liczba5_bin=zera;
System.out.println("liczba z uzupe³nionym zerami do jednego bajta");
System.out.println("("+zera+")2");


System.out.println("");
System.out.print("Podaj 2 liczbe maski podsieci:");
liczba6 = Integer.parseInt(reader.readLine());
System.out.println("Drugi oktet maski podsieci=" +"("+liczba6+")10 = ("+Integer.toBinaryString(liczba6)+")2");
liczba6_bin=Integer.toBinaryString(liczba6);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba6).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba6_bin);
liczba6_bin=zera;
System.out.println("liczba z uzupe³nionym zerami do jednego bajta");
System.out.println("("+zera+")2");


System.out.println("");
System.out.print("Podaj 3 liczbe maski podsieci:");
liczba7 = Integer.parseInt(reader.readLine());
System.out.println("Trzeci oktet maski podsieci=" +"("+liczba7+")10 = ("+Integer.toBinaryString(liczba7)+")2");
liczba7_bin=Integer.toBinaryString(liczba7);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba7).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba7_bin);
liczba7_bin=zera;
System.out.println("liczba z uzupe³nionym zerami do jednego bajta");
System.out.println("("+zera+")2");


System.out.println("");
System.out.print("Podaj 4 liczbe maski podsieci:");
liczba8 = Integer.parseInt(reader.readLine());
System.out.println("Czwarty oktet maski podsieci=" +"("+liczba8+")10 = ("+Integer.toBinaryString(liczba8)+")2");
liczba8_bin=Integer.toBinaryString(liczba8);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba8).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba8_bin);
liczba8_bin=zera;
System.out.println("liczba z uzupe³nionym zerami do jednego bajta");
System.out.println("("+zera+")2");

System.out.println("");
System.out.println("Adres IP w postaci binarnej="+liczba1_bin+"."+liczba2_bin+"."+liczba3_bin+"."+liczba4_bin);

System.out.println("Maska podsieci w postaci binarnej="+liczba5_bin+"."+liczba6_bin+"."+liczba7_bin+"."+liczba8_bin);



liczba1_wynik=liczba1&liczba5;
liczba1_wynikbin=Integer.toBinaryString(liczba1_wynik);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba1_wynik).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba1_wynikbin);
liczba1_wynikbin=zera;


liczba2_wynik=liczba2&liczba6;
liczba2_wynikbin=Integer.toBinaryString(liczba2_wynik);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba2_wynik).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba2_wynikbin);
liczba2_wynikbin=zera;


liczba3_wynik=liczba3&liczba7;
liczba3_wynikbin=Integer.toBinaryString(liczba3_wynik);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba3_wynik).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba3_wynikbin);
liczba3_wynikbin=zera;


liczba4_wynik=liczba4&liczba8;
liczba4_wynikbin=Integer.toBinaryString(liczba4_wynik);
zera="";
for (int i=1; i<9-Integer.toBinaryString(liczba4_wynik).length();i++)
{
zera=zera.concat("0");
}
zera=zera.concat(liczba4_wynikbin);
liczba4_wynikbin=zera;


System.out.println("              "+liczba1_bin+" "+liczba2_bin+" "+liczba3_bin+" "+liczba4_bin);
System.out.println("              "+liczba5_bin+" "+liczba6_bin+" "+liczba7_bin+" "+liczba8_bin);
System.out.println("--------------------------------------------------");
System.out.println("AND           "+liczba1_wynikbin+" "+liczba2_wynikbin+" "+liczba3_wynikbin+" "+liczba4_wynikbin);
}
}