'''
14. Implement a priority queue that sorts items by a given priority and always returns the 
item with the highest priority on each pop operation.
'''

class PriorityQueue:
    def __init__(self):
        self._queue = []

    def is_empty(self):
        return len(self._queue) == 0

    def push(self, item):
        self._queue.append(item)

    def pop(self):
        if self.is_empty():
            print("The queue is empty")
            return     
        self._queue.sort(reverse=True)
        return self._queue.pop(0)

pq=PriorityQueue()
pq.push(3)
pq.push(5)
pq.push(1)
pq.push(2)
pq.push(7)
while(not pq.is_empty()):
    print(pq.pop())