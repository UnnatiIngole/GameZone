import java.util.*;

class Main {
public static void main(String[] args) 
{   // YOU  O1=new YOU();
 Scanner S1=new Scanner(System.in);
YOU O2=new YOU();
System.out.println("XOXOXOXOXOXOXOXOX||Tic-Tac-Toe ||XOXOXOXOXOXOXOXOX");
System.out.println();
char [][]arr={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
 System.out.println("------Grid------"); 
        for(int i=0;i<3;i++)
        {System.out.print("|");
        for(int j=0;j<3;j++)
        {System.out.print(arr[i][j]+"|");} 
        System.out.println();} 
        System.out.println("----------------"); 
  System.out.println("");
   System.out.println("-------------------------------------------");       
 System.out.println("!!!!!!Game Rules!!!!!!");
 System.out.println("1.This is a two-player game.Players will play turn by turn");
 System.out.println("2.Player 1 will play with Symbol X");
 System.out.println("3.Player 2 will play with Symbol O");
 System.out.println("4.The game starts with Player 1");
 System.out.println("5.Each player has to enter a number(1–9)to place your symbol (X or O) in that cell"); 
 System.out.println("6.You win by placing three of your symbols in a row —this can be:");
System.out.println("      o Horizontally");
System.out.println("      o Vertically");
System.out.println("      o Diagonal");
System.out.println("7.If any of the player wins,the game stops");
 System.out.println("-------------------------------------------"); 


 System.out.print("Enter the name of Player 1:");
     String Player1=S1.next();
     System.out.print("Enter the name of Player 2:");
     String Player2=S1.next();
  System.out.println("-------------------------------------------");
  
 System.out.println();
 System.out.println("::::::Lets Begin::::::"); 
 System.out.println();
  O2.start(arr,Player1,Player2);
}  
}

class GameZone {
    String win="yes";
void TicTacToe(char [][] arr,String Player_1,String Player_2)
{   //giving X and O to abcd
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
                if(Player_1.charAt(0)==arr[i][j]){
                arr[i][j]='X'; }
                if(Player_2.charAt(0)==arr[i][j]){
                arr[i][j]='O'; }
          
      }
    } 
        
        //displaying tic tac toe grid
        System.out.println("_");
        for(int i=0;i<3;i++)
        {System.out.print("|");
        for(int j=0;j<3;j++)
        {System.out.print(arr[i][j]+"|");} 
        System.out.println();} 
        System.out.println("_"); 
        
        //cheacking the winners
         for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	 //vertical row            
	  if(arr[i][0]==arr[i][1]&&arr[i][1]==arr[i][2]){
	       System.out.println("+=++++==++++==++=++++==++++==+");
	           System.out.println("Won Won Won Won");
	           this.win="no";
	           break;
	       }
	       //horizontal row
	  if(arr[0][i]==arr[1][i]&&arr[1][i]==arr[2][i]){
	       System.out.println("+=++++==++++==++=++++==++++==+");
	           System.out.println("Won Won Won Won");
	            this.win="no";
	            break;
	            
	       }     } }
	       
	       //diagonal 1
	       if(arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2]){
	           this.win="no";
	            System.out.println("+=++++==++++==++=++++==++++==+");
	           System.out.println("Won Won Won Won");
	            
	       }
	       //diagonal 2
	       if(arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0]){
	            System.out.println("+=++++==++++==++=++++==++++==+");
	           System.out.println("Won Won Won Won");
	            this.win="no";
	       }
	       }}
	       
	       
class YOU extends GameZone {
    int y=0;
    int count=0;
    // String t="yes";
     String win = super.win;
     
           GameZone O1=new GameZone();
           Scanner S1=new Scanner(System.in);
           
  
            
            
            
void start(char [][]arr,String Player1,String Player2 ){
               System.out.println("");
do{
    
    count++;
if(O1.win.equals("yes")==true){
   
System.out.print(Player1+":");
String Player_1=S1.next();
String Player_2="Zeb";
O1.TicTacToe(arr,Player_1,Player_2);

if(O1.win.equals("no")==true){
y=1;
System.out.println("Congratulation "+Player1+" you won");
System.out.println("+=++++==++++==++=++++==++++==+");
break;
}
if(count==5){
    System.out.println("####TIE####TIE####TIE####");
    y=1;
    break;
}
    
}

if(win.equals("yes")==true){
System.out.print(Player2+":");
String Player_1="Zeb";
String Player_2=S1.next();
O1.TicTacToe(arr,Player_1,Player_2);

if(O1.win.equals("no")==true){
y=1;System.out.println("Congratulation "+Player2+" you won");
    System.out.println("+=++++==++++==++=++++==++++==+");
    break;
}
}

}
while(y!=1);
       }
       }
