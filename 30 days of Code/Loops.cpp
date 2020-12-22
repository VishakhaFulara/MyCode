#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,res;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    for(int i=1;i<=10;i++){
        res=n*i;
        cout<<n<<" x "<<i<<" = "<<res<<'\n';
    }
    return 0;
}
