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

ll n ; cin>>n;

vector<ll> a(n);


for(ll i=0; i<n; i++) cin>>a[i];

ll i=0, j= a.size()-1;
ll start = 0, end = 0;
while(i<a.size()){
    if(a[i]==0){
        i++;
    }else{
        start = i;
        break;
    }
}

while(j>=0){
    if(a[j]==0){
        j--;
    }else{
        end = j;
        break;
    }
}

ll ans = 0;
for(ll i= start; i<end; i++){
    if(a[i]==0){
        ans++;
    }
}


cout<<ans<<endl;

}
return 0;
}