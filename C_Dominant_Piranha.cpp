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
std::vector<int>::iterator it; 
for(ll i=0; i<n; i++) cin>>a[i];

ll ans = 0, max_element = 0;
for(ll i=0; i<n-1; i++){
    if(a[i]<a[i+1]){
        if(a[i+1]>max_element){
            max_element = a[i+1];
            ans = i+1+1;
        }
        
        

    }
    else if(a[i]>a[i+1])
    {
        if(a[i]>max_element){
            max_element = a[i];
            ans = i+1;
            
        }
         
         
    }
    
}

if(ans>0)
cout<<ans<<endl;
else
cout<<-1<<endl;


}
return 0;
}