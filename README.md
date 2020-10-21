
# Contests
# CODEFORCES ROUND 677 ( DIV 3 ) DATED : 20 OCTOBER 2020

<center>#1 A BORING APARTMENTS <br>
A. Boring Apartments <br>
time limit per test1 second<br>
memory limit per test256 megabytes<br>
inputstandard input<br>
outputstandard output<br></center>
<p>
There is a building consisting of 10 000 apartments numbered from 1 to 10 000, inclusive.

Call an apartment boring, if its number consists of the same digit. Examples of boring apartments are 11,2,777,9999 and so on.

Our character is a troublemaker, and he calls the intercoms of all boring apartments, till someone answers the call, in the following order:

First he calls all apartments consisting of digit 1, in increasing order (1,11,111,1111).
Next he calls all apartments consisting of digit 2, in increasing order (2,22,222,2222)
And so on.
The resident of the boring apartment x answers the call, and our character stops calling anyone further.

Our character wants to know how many digits he pressed in total and your task is to help him to count the total number of keypresses.

For example, if the resident of boring apartment 22 answered, then our character called apartments with numbers 1,11,111,1111,2,22 and the total number of digits he pressed is 1+2+3+4+1+2=13.

You have to answer t independent test cases.
</p>

Input
The first line of the input contains one integer t (1≤t≤36) — the number of test cases.

The only line of the test case contains one integer x (1≤x≤9999) — the apartment number of the resident who answered the call. It is guaranteed that x consists of the same digit.

Output
For each test case, print the answer: how many digits our character pressed in total.

<b> input</b>
<pre>
4
22
9999
1
777
</pre>

<b> output</b>
<pre>
13
90
1
66</pre>

<br><br><br>

<b> SOLUTION </b>

<pre>
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

</pre>
