import queue_1 as qu
l = qu.Queue(2)
l.Enqueue(4)
l.Enqueue(6)
print(l.Peek())
print(l.Dequeue())
print(l.Peek())
print(l.storage)