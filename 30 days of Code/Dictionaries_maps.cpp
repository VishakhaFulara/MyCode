#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
#include <string>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    map<string,long> a;
    string name;
    int pn,n;
    cin>>n;
    while(n--){
        cin>>name;
        cin>>pn;
        a[name]=pn;
        
    }
    while(cin>>name){
        if(a.find(name)!=a.end()){
            cout<<name<<"="<<a.find(name)->second<<"\n";
        }
        else{
            cout<<"Not found"<<"\n";
        }
    }   
    return 0;
}
