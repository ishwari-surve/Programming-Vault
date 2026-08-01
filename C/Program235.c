//Tree BST 2. Inorder() means Display function 
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#pragma pack(2)
struct node
{
    int data;
    struct node *lchild;
    struct node *rchild;
};

typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

//L D R
void Inorder(PNODE first)
{
    if(first != NULL)
    {
        Inorder(first->lchild);
        printf("%d\n",first->data);
        Inorder(first->rchild);
    }

}

void Insert(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->lchild = NULL;
    newn->rchild = NULL;

    if(*first == NULL) // permanent root
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while(1)
        {
            if(iNo > temp->data)  //Right
            {
               if(temp->rchild == NULL)
               {
                   temp->rchild = newn;
                   break;
               }
               temp = temp->rchild;
            }
            else if(iNo < temp->data)  // Left
            {
                if(temp->lchild == NULL)
                {
                    temp->lchild = newn;
                    break;
                }
                temp = temp->lchild;
               
            }
            else if(iNo == temp->data)  //duplicate values found
            {
               printf("Unable to insert as element is duplicate:");
               free(newn);
               break;
            }
        }

    }

}

int main()
{
    PNODE head = NULL;

    Insert(&head,11); //root
    Insert(&head,5);  //L
    Insert(&head,17); // R

    printf("Inorder Display :\n");
    Inorder(head); // Call by value because it is data

  

   return 0;
}
