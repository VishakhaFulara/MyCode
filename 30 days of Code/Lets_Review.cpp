#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<string>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t;
    cin>>t;
    while(t--){
        string str;
        cin>>str;
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0){
                  cout<<str[i];
            }
        } 
        cout<<" ";
        for(int i=0;i<str.length();i++)
          {
              if(i%2!=0){
                  cout<<str[i];
              }
          } 
        cout<<"\n";
    }
    return 0;
}
