class DisjointSet:
    def __init__(self, n):
        self.parent = [i for i in range(n)]
        self.rank = [0] * n

    def find(self, u):
        if self.parent[u] != u:
            self.parent[u] = self.find(self.parent[u])
        return self.parent[u]

    def union(self, u, v):
        rootU = self.find(u)
        rootV = self.find(v)

        if rootU != rootV:
            if self.rank[rootU] < self.rank[rootV]:
                self.parent[rootU] = rootV
            elif self.rank[rootU] > self.rank[rootV]:
                self.parent[rootV] = rootU
            else:
                self.parent[rootV] = rootU
                self.rank[rootU] += 1


def kruskal(graph):
    graph.sort(key=lambda x: x[2])  # Sort edges based on weight
    n = len(set([u for edge in graph for u in edge[:2]]))
    disjoint_set = DisjointSet(n)
    minimum_spanning_tree = []

    for edge in graph:
        u, v, weight = edge
        if disjoint_set.find(u) != disjoint_set.find(v):
            disjoint_set.union(u, v)
            minimum_spanning_tree.append(edge)

    return minimum_spanning_tree


graph = []
num_edges = int(input("Enter the number of edges: "))

for _ in range(num_edges):
    u, v, weight = map(int, input("Enter edge (u v weight): ").split())
    graph.append((u, v, weight))

minimum_spanning_tree = kruskal(graph)
print("Minimum Spanning Tree:", minimum_spanning_tree)
