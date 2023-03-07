from asyncio import Queue


class Node:
    def __init__(self, item):
     self.left = None
     self.right = None
     self.val = item
# creating a tree data structure
def inorder(root):
#checking if the root is null or not
   if root:
     inorder(root.left)
# recursively calling left subtree
     print(str(root.val) + " ", end = '')
     inorder(root.right)
# recursively calling right subtree
def postorder(root):
    if root:
     postorder(root.left)
     postorder(root.right)
     print(str(root.val) + " ", end = '')
def preorder(root):
    if root:
     print(str(root.val) + " ", end = '')
     preorder(root.left)
     preorder(root.right)
def levelOrder(root):
     queue = list()
     queue.append(root)
while len(Queue):
    current = Queue[0]
    Queue = Queue[1: ]

print(str(current.val) + " ", end = "")
if current.left:
 Queue.append(current.left)
if current.right:
   Queue.append(current.right)
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)
print("\nLevelOrder traversal:\t", end = " ")
levelOrder(root)
print("\nInorder traversal:\t", end = " ")
inorder(root)
print("\nPreorder traversal:\t", end = " ")
preorder(root)
print("\nPostorder traversal:\t", end = " ")
postorder(root)