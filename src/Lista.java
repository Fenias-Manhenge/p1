import java.util.Scanner;

public class Lista {

    public static void preenche(int x[]){
        
        Scanner t=new Scanner(System.in);
        
        for(int i = 0; i < x.length; i++){
            
            System.out.println(".Introduza " + (i+1) + " numero inteiro");
            x[i] = t.nextInt();
        }
    }
    public static int Soma(int x[]){
        
        int y=0;
        for(int i = 0; i<x.length; i++){
            y= y+x[i];
        }
        return y;
    } 
    public static void imprime(int x[]){
        for(int i = 0; i<x.length; i++){
            
            System.out.println( (i+1)+ "." + x[i] );
        }    
            System.out.println();
            System.out.println("Soma" + Soma(x) );
        
    }
   public static void menu(int x[]){
       
        Scanner t=new Scanner(System.in);
        
        int k;
        do{System.out.println("---------------------");
           System.out.println("MENU DO PROGRAMA");
            System.out.println("--------------------");
            System.out.println("1.Preencher lista");
            System.out.println("2.Imprimir lista");
            System.out.println("3.SOMA DA LISTA");
            System.out.println("3.Sair do programa");
            System.out.println("ESCOLHA[1/2/3]:");
           k=t.nextInt();
           switch(k){
                case 1:preenche(x);
                break;
                case 2:imprime(x);
                break;
                case 3:System.exit(0);   
           }
        }while(true);
    }
    public static void main(String[]args){
        int x[]= new int [4];
       menu(x);
    }  
}
    
