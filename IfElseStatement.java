





class IfElseStatement{
public static void main(String[]args){

//create variables
// Write an if/else statement for the following requirements:
// If student gets 90 or higher: console log  A
// If students get 80 or above: console log B
// If students get 70 or above: console log C
// If students get 55 or above: console log D
// Any grade lower than 55 is F
int grade=89;

String Score;


if (grade>=90)
      {
       Score ="A";
      }
      else if (grade>79)
      {
       Score = "B";
      }
      else if (grade>69)
      {
        Score = "C";
      }
      else if (grade > 55 )
      {
        Score = "D";
      }
      else 
      {
        Score = "F";
      }

      
      System.out.println("Your score is " + Score);
   
    }

}

