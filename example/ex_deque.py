from collections import deque

d = deque()

#Stack
for i in range(1, 6):
    d.append(i)

for _ in range(6):
    if d:
        print(d.pop())

print()

#Queue
for i in range(1, 6):
    d.append(i)

for _ in range(6):
    if d:
        print(d.popleft())

