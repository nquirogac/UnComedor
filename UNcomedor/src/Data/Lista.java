package Data;
public class Lista {
    Node head;

  public ListRef(){
    head = null;
  }
  public void insert(int item){
    Node prev, l;
    l=head;
    prev = null;
    while(l !=null && l.data<item){
      prev=l;
      l=l.next;
    }
    if(l==null || l.data!=item){
      Node n =new Node(item);
      n.next=l;
      if(prev!=null){
        prev.next=n;
      }else{
        head = n;
      }
    }
  }
  public void delete(int item){
    Node prev, l;
    l=head;
    prev = null;
    while(l !=null && l.data<item){
      prev=l;
      l=l.next;
    }
    if(prev!=null){
      prev.next=l.next;
    }else{
      head = head.next;
    }
  }

  public void printRecursive() {
    System.out.print("List Recursive: ");
    printR(head);
    System.out.println();
  }
  private void printR(Node p) {
  if(p != null) {
    System.out.print(p.data+" ");
    printR(p.next);
    }
  }
}
 public void pushfront(int item){
     Node prev, l;
     l=head;
     prev = null;
     while(l !=null){
       prev=l;
       l=l.next;
     }
     if(l==null){
       Node n =new Node(item);
       n.next=l;
       if(prev!=null){
         prev.next=n;
       }else{
         head = n;
       }
       tail = n;
     }
}
