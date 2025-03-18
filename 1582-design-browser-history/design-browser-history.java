class BrowserHistory {
    class Node{
        String val;
        Node next = null;
        Node prev = null;
        Node(String val){
            this.val = val;
        }

    }
    Node head;
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
    }
    
    public void visit(String url) {
        Node prev = head;
        head.next = new Node(url);
        head = head.next;
        head.prev = prev;

    }
    
    public String back(int steps) {
        while(steps-->0 && head.prev!=null){
            head = head.prev;
        }
        return head.val;
    }
    
    public String forward(int steps) {
        while(steps-->0 && head.next!=null){
            head = head.next;
        }
        return head.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */