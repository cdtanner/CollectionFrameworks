import java.util.Stack;
import java.util.Scanner;

public class PreFixEvaluator
{
  public static int PreEval(String express)
  {
    Stack <Integer> operand = new Stack <Integer>();
    Stack <Character> operator = new Stack<Character>();
    
    int i, counter = 0, left, right, result;
    char optor;
    
    for (i = 0; i<express.length(); i++)
    { char a = express.charAt(i); 
      if (a == '+' || a == '-' || a == '/' || a == '*')
      { operator.push(a);
        counter = 0;
      }
      else
      { operand.push((int)a-48);
        counter++;
        if (counter ==2)
        { right = operand.pop();
          left = operand.pop();
          counter -=2;
          optor = operator.pop();
          switch (optor)
          {case '+': operand.push (left+right); break;
            case '-': operand.push(left - right); break;
            case '*': operand.push(left * right); break;
            case '/': operand.push(left/right); break;
          }
          counter++;
        }
      }
    }
    while (!operator.isEmpty())
    {
      right = operand.pop();
      left = operand.pop();
      optor = operator.pop();
      switch (optor)
          {case '+': operand.push (left+right); break;
            case '-': operand.push(left - right); break;
            case '*': operand.push(left * right); break;
            case '/': operand.push(left/right); break;
          }
    }    
    return operand.pop();
  }
  
 


 public static void main(String [] args)
  {
    String ex;
    Scanner sc = new Scanner(System.in);
    int i = 1;
    
    while (i!=0)
    { System.out.print ("Enter the pre-fix expression to be evaluated: ");
      ex = sc.next();
      System.out.println ("the result of your expression is: " + PreEval(ex));
      System.out.println ("enter another expression: 1 Yes; 0 No");
      i = sc.nextInt();
    }
  }
}
                            
