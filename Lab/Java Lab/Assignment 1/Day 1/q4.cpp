#include<bits/stdc++.h>
using namespace std;

class cricketer{
	protected:
	string name;
	string dob;
	int matches;
	public:
	virtual void setData(string, string, int)=0;
	virtual void display()=0; 	
};

class batsman : virtual public cricketer{
	protected:
	int runs;
	float Ravg;
	public:
	void setData(string n, string d, int m){
		name=n;
		dob=d;
		matches=m;	
		cout<<"enter the no. of runs scored by the batsman: ";
		cin>>runs;
		Ravg=(runs/matches);	
	}
	void display(){
		cout<<name<<" "<<dob<<" "<<matches<<" "<<runs<<" "<<Ravg<<endl;
	}		
};

class bowler : virtual public cricketer{
	protected:
	int wickets;
	float Bavg;
	public:
	void setData(string n, string d, int m){
		name=n;
		dob=d;
		matches=m;	
		cout<<"enter the no. of wickets taken by the bowler: ";
		cin>>wickets;
		Bavg=(wickets/matches);	
	}
	void display(){
		cout<<name<<" "<<dob<<" "<<matches<<" "<<wickets<<" "<<Bavg<<endl;
	}
};

class all_rounder : public batsman, public bowler{
	public:
	void setData(string n, string d, int m){
		name=n;
		dob=d;
		matches=m;
		cout<<"enter the no. of runs scored by the batsman: ";
		cin>>runs;
		Ravg=(runs/matches);		
		cout<<"enter the no. of wickets taken by the bowler: ";
		cin>>wickets;
		Bavg=(wickets/matches);	
	}
	void display(){
		cout<<name<<" "<<dob<<" "<<matches<<" "<<runs<<" "<<wickets<<" "<<Ravg<<" "<<Bavg<<endl;
	}
};

	void pair(batsman b, bowler B){
		cout<<"a pair is formed of a batsman and a bowler"<<endl;
		cout<<b.name<<"     "<<B.name<<endl;
		cout<<b.dob<<"       "<<B.dob<<endl;
		cout<<b.matches<<"      "<<B.matches<<endl;
		cout<<"runs scored: "<<b.runs<<"      "<<"wickets taken: "<<B.wickets<<endl;
		cout<<b.Ravg<<"      "<<B.Bavg<<endl;	
	}

int main(){

return 0;
}
