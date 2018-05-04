/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Administrador
 */
import java.util.Random;
public class Ex3 {

    public static int[] Contador(int vet[]){
        int cont[]=new int[11];
        for(int i=0; i<1000; i++){
            /* for(int j=0;j<101;j++{
                    if(vet[i]==j){
                        cont[j]++;
                    }
                }           
            */
               switch(vet[i]){
                 case 0: cont[0]++; 
                     break;
                 case 1: cont[1]++;
                     break;
                 case 2: cont[2]++;
                     break;
                 case 3: cont[3]++;
                     break;
                 case 4: cont[4]++;
                     break;
                 case 5: cont[5]++;
                     break;
                 case 6: cont[6]++;
                     break;
                 case 7: cont[7]++;
                     break;
                 case 8: cont[8]++;
                     break;
                 case 9: cont[9]++;
                     break;
                 case 10: cont[10]++;
                     break;
                }
        }
       return cont;
    }
    
    public static int MaisVezes(int vet[]){
        int mais=vet[0], num=0;        
        for(int i=0; i<11; i++){
            if(mais<vet[i]){
                mais=vet[i];
                num=i;
            }
        }
        return num;
    }
    
    public static int MenosVezes(int vet[]){
        int numvezes=vet[0], num=0;        
        for(int i=0; i<11; i++){
            if(numvezes>vet[i]){
                numvezes=vet[i];
                num=i;
            }
        }
        return num;
    }
    
    public static int MaiorNum(int vet[]){
        int maiornum=0;        
        for(int i=10; i>=0; i--){
            if(vet[i]!=0){
                maiornum=i;
                break;
            }
        }
        return maiornum;
    }
    
    public static int MenorNum(int vet[]){
        int menornum=0;        
        for(int i=0; i<11; i++){
            if(vet[i]!=0){
                menornum=i;
                break;
            }
        }
        return menornum;
    }
    
    public static void main(String[] args) {
        
        int maisvezes, menosvezes, maior, menor;
        int sorteio[]=new int[1000];
        Random num=new Random();
        
        for(int i=0; i<1000; i++){
            sorteio[i]=num.nextInt(11);
        }
        
        int cont[]=Contador(sorteio);
        
        maisvezes=MaisVezes(cont);
        menosvezes=MenosVezes(cont);
        maior=MaiorNum(cont);
        menor=MenorNum(cont);
        
        System.out.println("O número que apareceu mais vezes foi "+maisvezes);
        System.out.println("O número que apareceu menos vezes foi "+menosvezes);
        System.out.println("O maior número que apareceu foi "+maior);
        System.out.println("O menor número que apareceu foi "+menor);
        
        
    }
    
}
