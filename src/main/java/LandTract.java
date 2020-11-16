/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */
import java.util.*;

class LandTract{

int length,width;
LandTract(int x,int y){

length=x;

width=y;

}

int tractarea(){

return length*width;

}

int equals(LandTract a,LandTract b){

if(a.tractarea()==b.tractarea())

return 1;

else

return 0;

}

public static void main(String args[]){

Scanner scn=new Scanner(System.in);

System.out.println("length for tract 1");

int x1=scn.nextInt();

System.out.println("width for tract 1");

int y1=scn.nextInt();

System.out.println("length for tract 2");

int x2=scn.nextInt();

System.out.println("width for tract 2");

int y2=scn.nextInt();

LandTract T1=new LandTract(x1,y1);

LandTract T2=new LandTract(x2,y2);

System.out.println("\n Area of the Tract 1 " +T1.tractarea() + " \n Area of the Tract 2 "+T2.tractarea());

int s1=T2.equals(T1,T2);

if(s1==1)

System.out.println("\n Tracts are equal");

else

System.out.println("\n Tracts are not equal");

}

}