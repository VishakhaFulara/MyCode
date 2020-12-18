#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

int main() {
    int i = 4;
    double d = 4.0;
    string s = "HackerRank ";
    int a;
    double b;
    string c;
    cin>>a;
    cin>>b;
    cin.ignore();
    getline(cin,c);
    cout<<i+a<<"\n";
    cout<<fixed<<setprecision(1)<<d+b<<"\n";
    cout<<s+c<<"\n";

    return 0;
