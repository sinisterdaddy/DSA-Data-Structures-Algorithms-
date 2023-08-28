#include <bits/stdc++.h>

using namespace std;

int solution(int N, int A[], int B[], int M)
{
    int n = N, m = M;
    vector<vector<int>> adjlist(n);
    vector<int> degree(n, 0);
    for (int i = 0; i < m; i++)
    {
        int u = A[i], v = B[i];
        degree[u]++;
        degree[v]++;
        adjlist[u].push_back(v);
        adjlist[v].push_back(u);
    }
    queue<pair<int, int>> q;
    vector<bool> vis(n, 0);
    for (int i = 0; i < n; i++)
        if (degree[i] < 2)
        {
            q.push({i, 1});
            vis[i] = 1;
        }

    int ans = 0;
    while (q.size())
    {
        int u = q.front().first, t = q.front().second;
        q.pop();
        ans = max(ans, t);
        for (auto v : adjlist[u])
        {
            if (!vis[v])
            {
                degree[v]--;
                if (degree[v] < 2)
                {
                    q.push({v, t + 1});
                    vis[v] = 1;
                }
            }
        }
    }
    return ans;
}