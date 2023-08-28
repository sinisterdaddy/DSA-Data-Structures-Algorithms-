def max_length_substring(s, t, K):
    n = len(s)
    max_length = 0

    for i in range(n):
        cost = 0
        j = i
        while j < n and cost + abs(ord(s[j]) - ord(t[j])) <= K:
            cost += abs(ord(s[j]) - ord(t[j]))
            j += 1
        max_length = max(max_length, j - i)

    return max_length


# Taking input from the user
s = input("Enter string s: ")
t = input("Enter string t: ")
K = int(input("Enter integer K: "))

result = max_length_substring(s, t, K)
print("The maximum length of a substring with total cost less than or equal to K:", result)
