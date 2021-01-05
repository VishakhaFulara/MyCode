#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,remainder,c=0;
    vector<int>s;
    vector<int>p;
    vector<int>::iterator it;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    while(n>=1){
        remainder=n%2;
        n=n/2;
        s.push_back(remainder);
    }
    for(it=s.begin();it<s.end();it++){
        if(*it!=0){
            c++;
        }
        else{
            p.push_back(c);
            c=0;
        }
    }
    if(c>0){
        p.push_back(c);
    }
    cout<<*max_element(p.begin(),p.end());
    return 0;
}


