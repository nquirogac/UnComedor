package Data;
public class Pila {
  private static final int N = 5;
  private int top, sarray[];

  //constructors
  public Pila() {
  this(N);
  }
  public Pila (int n) {
  top = 0;
  sarray = new int[n];
  }
  public void push(int item){
    if(full()){
      throw new RuntimeException("Stack is full");
    }
    sarray[top]=item;
    top++;
    
  }
  public int pop(){
    int num=-1;
    if(empty()){
      throw new RuntimeException("Stack is empty");      
    }
    top--;
    num = sarray[top];            
    return num;
  }
  public boolean full(){
    return top>= sarray.length;
  }
  public boolean empty(){
    return top<=0;
  }
}
