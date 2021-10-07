public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    for(int i=0;i<5;i++){//empty palces filled with _;
      for(int j=0;j<5;j++){
        cb[i][j]="_";
      }
    }
    for(int i=0;i<5;i++){//pawn a places filled
app[i]=sc.next();
app[i]="A-"+app[i];
cb[0][i]=app[i];
ap[i][0]=0;
ap[i][1]=i;
    }
    for(int i=0;i<5;i++){//pawn b places filled
      bpp[i]=sc.next();
      bpp[i]="B-"+bpp[i];
      cb[4][i]=bpp[i];
      bp[i][0]=4;
      bp[i][1]=i;
    }
    pcb(cb);
String move;
while(flp==0){
move=sc.next();
String[] mys=move.split(":", 0);
System.out.println(mys[0]+" "+mys[1]);
if(flag==0){
  String ps=" ";
  ps=ps+"A-";
  ps=ps+mys[0];
  amov(ps,mys[1]);
}
else{
  String ps1=" ";
  ps1=ps1+"B-";
  ps1=ps1+mys[0];
bmov(ps1,mys[1]);
}
}
  }
}
