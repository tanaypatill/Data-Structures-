for _ in range(int(input())):
    n = int(input())
    lst = list(map(int,input().split()))
    string = ''
    shft = cnt = 0
    mx = -20
    ans = 0
    while mx:
        mx = 0
        for x in lst:
            cnt += 1 if (x >> shft) & 1 else 0
            mx = max(mx,x >> shft)
        if (cnt & 1 and (n - cnt) & 1) or shft > 21:
            print(-1)
            break
        if cnt & 1:
            for x in range(n):
                lst[x] += 1 << shft
            ans += 1 << shft
        shft += 1
        cnt = 0
    else:
        print(ans)
