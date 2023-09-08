class Queue:
    def __init__(self, head=None):
        self.storage = [head]

    def Enqueue(self, new_element):
        self.storage.append(new_element)

    def Peek(self):
        return self.storage[0]

    def Dequeue(self):
        cur = self.storage[0]
        self.storage.remove(cur)
        return cur

if __name__ == "__main__":
    # Setup
    q = Queue(1)
    q.Enqueue(2)
    q.Enqueue(3)

    # Test Peek
    # Should be 1
    print(q.Peek())

    # Test Dequeue
    # Should be 1
    print(q.Dequeue())

    # Test Enqueue
    q.Enqueue(4)
    # Should be 2
    print(q.Dequeue())
    # Should be 3
    print(q.Dequeue())
    # Should be 4
    print(q.Dequeue())
    q.Enqueue(5)
    # Should be 5
    print(q.Peek())