
package chess;

/**
 *
 * @author AJAY J
 */
 import java.util.*;
import java.io.*;
import java.lang.*;
public class Chess {
static int[][] ap=new int[5][2];//a pawn postions
static int[][] bp=new int[5][2];// b pawn position
static String app[]=new String[5];//a pawn order
static String bpp[]=new String[5];// b pawn order
static String[][] cb=new String[5][5];
static int flp=0;
static int flag=0;

static void pcb(String[][] a){//function to print chess board;
for(int i=0;i<5;i++){
  for(int j=0;j<5;j++){
    System.out.print(a[i][j]+" ");
  }
  System.out.println();
} }

static void pcb(int[][] a){
for(int i=0;i<5;i++){
  for(int j=0;j<2;j++){
    System.out.print(a[i][j]+" ");
  }
  System.out.println();
} }

static int pos(String pa){
  String[] mpv=pa.split("-", 0);
  pa=mpv[1];
  int k=0;
  if(pa.equals("p1"))
  k=0;
  else if(pa.equals("p2"))
  k=k+1;
  else if(pa.equals("p3"))
  k=k+2;
  else if(pa.equals("p4"))
  k=k+3;
  else if(pa.equals("p5"))
  k=k+4;
  return k;
}

static int pfin(int r,int c){
String plc=cb[r][c];
if(plc.equals("_")){
  return 3;
}
else{
int k=0;
String[] plcc=plc.split("-",0);
if(plcc[0].equals("A")){
  k=1;
}
else
k=2;
return k;}
}

static void amov(String p,String mv){//to update a move
int row=0;
int col=0;
int index=0;
int r=0;
int c=0;
index=index+pos(p);
System.out.println(pos(p));
row=ap[index][0];
col=ap[index][1];
r=row;
c=col;
String paw=cb[row][col];
System.out.println(index+" "+paw+" "+row+" "+col);

int err=0;
if(mv.equals("L")){
  if(col+1<=4 && col+1>=0)
  {col++;flag=1;}
  else
  err=1;
}
else if(mv.equals("R")){
if(col-1>=0 && col-1<=4)
  {col--;flag=1;}
  else
  err=1;
}
else if(mv.equals("F")){
if(row+1>=0 && row+1<=4)
  {row++;flag=1;}
  else
  err=1;
}
else if(mv.equals("B")){
if(row-1>=0 && row-1<=4)
  {row--;flag=1;}
  else
  err=1;
}
else{
  System.out.println("invalid move try again");
}
if(err==0){
  int fw=pfin(row,col);
  if(fw==1){
    System.out.println("Invalid move try again");flag=0;}
  else{
    cb[r][c]="_";
cb[row][col]=paw;
ap[index][0]=row;
ap[index][1]=col;
}

}
pcb(cb);
}//function to move a pawns;

static void bmov(String p,String mv){//to update b move
int row=0;
int col=0;
int index=0;
int r=0;
int c=0;
index=index+pos(p);
System.out.println(pos(p));
row=bp[index][0];
col=bp[index][1];
r=row;
c=col;
String paw=cb[row][col];
System.out.println(index+" "+paw+" "+row+" "+col);

int err=0;
if(mv.equals("L")){
  if(col-1<=4 && col-1>=0)
  {col--;flag=0;}
  else
  err=1;
}
else if(mv.equals("R")){
if(col+1>=0 && col+1<=4)
  {col++;flag=0;}
  else
  err=1;
}
else if(mv.equals("F")){
if(row-1>=0 && row-1<=4)
  {row--;flag=0;}
  else
  err=1;
}
else if(mv.equals("B")){
if(row+1>=0 && row+1<=4)
  {row++;flag=0;}
  else
  err=1;
}
else{
  System.out.println("invalid move try again");
}
if(err==0){
  int fw=pfin(row,col);
  if(fw==2){
    System.out.println("Invalid move try again");flag=1;}
  else{
    cb[r][c]="_";
cb[row][col]=paw;
ap[index][0]=row;
ap[index][1]=col;
}

}
pcb(cb);
}//function to move b pawns
