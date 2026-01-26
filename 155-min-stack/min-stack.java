class MinStack {
    Node head;
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public MinStack() {    
    }
    
    public void push(int val) {
        Node newNode =new Node(val);
    if(head==null)
    {
        head=newNode;
        return;
    } 
    newNode.next=head;
    head=newNode;
    return;
    }
    
    public void pop() {
     if(head==null)
     {
        return;
     }   
     Node curr=head;
     head=curr.next;
     return;
    }
    
    public int top() {
      if(head==null)
      {
        return -1;
      }  
      return head.data;
    }
    
    public int getMin() {
     int mini=Integer.MAX_VALUE;
     Node currnode=head;
     while(currnode!=null)
     {
        mini=Math.min(mini,currnode.data);
        currnode=currnode.next;
     } 
     return mini;  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */