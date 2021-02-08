import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class pola_figur_plaskich {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String ms_dzialanie = "";
        System.out.print("======Prosty kalkulator pola kwadratu i prostokata======");
        while(!ms_dzialanie.equals("EXIT")){
            System.out.print("\nProsze wybrac dzialanie 1 Pole kwadratu 2 Pole prostokata: ");
            ms_dzialanie = sc.next();
            if(ms_dzialanie.equals("1")){
                System.out.print("\nProsze podac bok kwadratu: ");
                ms_szer = sc.nextInt();
                ms_wys = ms_szer;
                ms_pole = ms_szer * ms_wys;
                ms_obwod = ms_szer*4;
                for (int i = 0; i < ms_wys; i++)
                {
        
                    for (int j = 0; j < ms_szer; j++)
        
                        System.out.print('*');
        
                    System.out.println();
        
                }
                System.out.print("Pole: "+ms_pole+" Obwod: "+ms_obwod);
                zapiszdzialaniekwadrat();
            }else if(ms_dzialanie.equals("2")){
                System.out.print("\nProsze podac szerokosc prostokata: ");
                ms_szer = sc.nextInt();
                System.out.print("\nProsze podac wysokosc prostokata: ");
                ms_wys = sc.nextInt();
                ms_pole = ms_szer * ms_wys;
                ms_obwod = (ms_szer*2)+(ms_wys*2);
                for (int i = 0; i < ms_wys; i++)
                {
        
                    for (int j = 0; j < ms_szer; j++)
        
                        System.out.print('*');
        
                    System.out.println();
        
                }
                System.out.print("Pole: "+ms_pole+" Obwod: "+ms_obwod);
                zapiszdzialanieprostokat();
            }else{
                System.out.print("\nNiema takiego dzialania");
            }
        }
    }
    private static void zapiszdzialanieprostokat(){
        try{
            FileWriter fw = new FileWriter(prostokat, true);
            fw.write("Pole:"+ms_pole+"; Obwod:"+ms_obwod+"\n");
            for (int i = 0; i < ms_wys; i++)
                {
        
                    for (int j = 0; j < ms_szer; j++)
        
                        fw.write("*");
        
                    fw.write("\n");
        
                }
            fw.close();
        }catch (IOException ex) {
            System.out.println("Blad: "+ex.toString());
        }
    }
    private static void zapiszdzialaniekwadrat(){
        try{
            FileWriter fw = new FileWriter(kwadrat, true);
            fw.write("Pole:"+ms_pole+"; Obwod:"+ms_obwod+"\n");
            for (int i = 0; i < ms_wys; i++)
                {
        
                    for (int j = 0; j < ms_szer; j++)
        
                        fw.write("*");
        
                    fw.write("\n");
        
                }
            fw.close();
        }catch (IOException ex) {
            System.out.println("Blad: "+ex.toString());
        }
    }
    public static int ms_pole;
    public static int ms_obwod;
    public static int ms_wys;
    public static int ms_szer;
    public static File kwadrat  = new File("kwadrat.txt");
    public static File prostokat  = new File("prostokat.txt");
}