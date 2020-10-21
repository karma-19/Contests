#include <bits/stdc++.h>
#include <iostream>
using namespace std; 
typedef long long int ll;
//**************main starts ********************
int main(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);



ll t; cin>>t;
while(t--){
//***************** type here *************** 

vector<vector<ll>> a = {
    {1, 11, 111, 1111}, 
    {2, 22, 222, 2222},
    {3, 33, 333, 3333}, 
    {4, 44, 444, 4444}, 
    {5, 55, 555, 5555}, 
    {6, 66, 666, 6666}, 
    {7, 77, 777, 7777},
    {8, 88, 888, 8888},
    {9, 99, 999, 9999}
};


ll x ; cin>>x;
ll count = 0;
ll rem = x%10;
while(x > 0){
    count++;
    x = x/10;
}

ll ans = (rem-1)*10;

if(count ==1){
    ans += 1;
}
else if(count == 2){
    ans += 3;
}
else if(count==3){
    ans += 6;
}
else if(count == 4){
    ans += 10;
}

cout<<ans<<endl;



}
return 0;
}