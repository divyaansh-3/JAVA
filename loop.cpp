#include<iostream>
using namespace std;
class node{
public:
    int data;
    node *prev;
    node *next;

};
void display(node *p){
    if(!p){
        cout<<endl<<"EMPTY LIST";
        return;
    }
    else{
        node *temp=p;
        do{
            cout<<temp->data<<" ";
            temp=temp->next;
        }while(temp!=p);
    }
}
int main(){
    node *head =NULL ,*temp =NULL, *newnode=NULL;
    int n;
    int val;
    cout<<"enter the number of nodes to be created: ";
    cin>>n;
    for(int i=0;i<n;i++){
        newnode = new node;
        cout<<endl<<"enter the data of node "<<i+1<<" : ";
        cin>>val;
        newnode->data=val;
        newnode->prev=newnode->next=NULL;
        if(head==NULL){
            head=newnode;
            temp=head;
            newnode->next=head;
            newnode->prev=head;
        }
        else{
            temp->next =newnode;
            newnode->prev=temp;
            newnode->next=head;
            head->prev=newnode;
            temp=newnode;

        }
    }
    display(head);
    return 0;
}