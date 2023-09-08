class node:
    def __init__(self,val : int) -> None:
        self.val=val
        self.next=None

class LinkedList:
    def __init__(self, head=None) -> None:
        self.head = head
    
    def extendlist(self, new_elem) -> None:
        if self.head:
            cur = self.head
            while cur.next:
                cur = cur.next
            cur.next = new_elem
        else:
            self.head = new_elem

    def insertNode(self, new_elem, pos):
        cur = self.head
        if pos == 1:
            self.head = new_elem
            new_elem.next = cur
        else:
            while pos-1!=1 and cur:
                cur = cur.next
                pos-=1
            if cur:
                new_elem.next = cur.next
                cur.next = new_elem
    
    def delete(self, pos):
        if pos == 1:
            self.head = self.head.next if self.head else None
        else:
            cur = self.head
            while pos-1!=1 and cur:
                cur = cur.next
                pos-=1
            if cur:
                cur.next = cur.next.next

            
    def Print(self):
        cur = self.head
        while cur:
            print(cur.val,end=" ")
            cur = cur.next
        print()


if __name__ == "__main__":
    e1 = node(1)
    e2 = node(2)
    e3 = node(3)
    e4 = node(4)
    e5 = node(4)
    L = LinkedList(e1)
    L.extendlist(e2)
    L.Print()
    L.extendlist(e3)
    L.extendlist(e4)
    L.insertNode(e5,3)
    L.Print()
    L.delete(3)
    L.Print()
    L.insertNode(e5,4)
    L.Print()
    #print(L.head,"e1=",e1.next,"e2=",e2.next,"e3=",e3.)

