/*#include<stdio.h>
int main(){
    int a[5][5],r,c,i,j,count=0,l=0,k=1, s[5][3];
    printf("Enter the size of matrix:");
    scanf("%d %d",&r,&c);
    printf("Enter elements:");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            scanf("%d",&a[i][j]);
            if(a[i][j]==0){
                count++;
            }
        }
    }
    if(count>=(r*c)/2){
        printf("The sparsh matrix is:");{
            printf("\n Row \t Column \t Element\n");
                            s[0][0]=r;
                            s[0][1]=c;
                            s[0][2]=(r*c)-count;
            for (i=0;i<r;i++){
                for(j=0;j<c;j++){
                    if(a[i][j]!=0){
                        s[k][0] = i;
                    
                        s[k][1] = j;
                        s[k][2] = a[i][j];
                        k++;    
                         
        }
    }
}
        }
    }

    else
    printf("The matrix is not a sparsh matrix.");
    for (k=0;k<=(r*c)-count;k++){
        for(l=0;l<3;l++){
            printf("\t%d",s[k][l] );
        }printf("\n");
    }
return 0;
}*/

/*
#include<stdio.h>
int nonzero(int a[][5], int r, int c);
void transpose(int s[][3], int b[][3], int count);
int main(){
    int r,c,i,j,l;
    int a[5][5];
    int s[25][3];
    int b[25][3];
    int add[25][3];
    printf("Enter number of rows:");
    scanf("%d",&r);
    printf("Enter number of columns:");
    scanf("%d",&c);
    printf("Enter elemts:");
    for (i=0;i<r;i++){
        for(j=0;j<c;j++)
        scanf("%d",&a[i][j]);
    }
    int count = nonzero(a,r,c);
    int k=1;
    printf("The sparsh matrix is:\n");
    {
        s[0][0]=r;
        s[0][1]=c;    
        s[0][2]=count;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(a[i][j]!=0){
                    s[k][0]=i;
                    s[k][1]=j;
                    s[k][2]=a[i][j];
                    k++;
                }
            }
        }
    }
    for(k=0;k<count+1;k++){
        for(l=0;l<3;l++){
            printf("%d",s[k][l]);
        }
        printf("\n");
    }
    transpose(s, b, count);
    addition(s,add,count);
}

int nonzero(int a[][5],int r,int c){
    int count=0,i,j;
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            if(a[i][j]!=0)
            count++;
        }
    }
    return count;
}
void transpose(int s[][3], int b[][3], int count){
    int k,l;
    b[0][0] = s[0][1];
    b[0][1] = s[0][0];
    b[0][2] = s[0][2];
    printf("Transpose is:\n");
    for (k=1;k<count+1;k++){
        b[k][0] = s[k][1];
        b[k][1] = s[k][0];
        b[k][2] = s[k][2];
    }
    for(k=0;k<count+1;k++){
        for(l=0;l<3;l++){
            printf("%d",b[k][l]);
        }
        printf("\n");
    }
}*/

#include<stdio.h>
void add(int s1[][3],int s2[][3],int s3[][3],int r1, int r2);
int main(){
    int s1[5][3], s2[5][3],s3[10][3];
    int r1,r2,i;
    printf(" Enter no. of elements in first matrix:");
    scanf("%d",&r1);
    printf(" Enter no. of elements in second matrix:");
    scanf("%d",&r2);
    printf("Enter row, column and value of 1st matrix");
    for(i=0;i<r1;i++){
        scanf("%d%d%d", &s1[i][0], &s1[i][1], &s1[i][2]);
    }
    printf("Enter row, column and value of 2nd matrix");
    for(i=0;i<r2;i++){
        scanf("%d%d%d", &s2[i][0], &s2[i][1], &s2[i][2]);
    }
    add(s1,s2,s3,r1,r2);
    return 0;
}
void add(int s1[][3],int s2[][3],int s3[][3],int r1, int r2){
    int i,j,k;
    i=j=k=0;
    while (i<r1 && j<r2){
        if(s1[i][0] == s2[j][0] && s1[i][1] == s2[j][1]){
            s3[k][0]=s1[i][0];
            s3[k][1]=s1[i][1];
            s3[k][2]=s1[i][2]+s2[j][2];
            i++,j++,k++;
        }
        else if(s1[i][0]<s2[j][0]){
            s3[k][0]=s1[i][0];
            s3[k][1]=s1[i][1];
            s3[k][2]=s1[i][2];
            i++,k++;
        }
        else if(s2[j][0]<s1[i][0]){
            s3[k][0]=s2[j][0];
            s3[k][1]=s2[j][1];
            s3[k][2]=s2[j][2];
            j++,k++;
        }
        else if(s1[i][1]<s2[j][1]){
            s3[k][0]=s1[i][0];
            s3[k][1]=s1[i][1];
            s3[k][2]=s1[i][2];
            i++,k++;
        }
        else{
            s3[k][0]=s2[j][0];
            s3[k][1]=s2[j][1];
            s3[k][2]=s2[j][2];
            j++,k++;
        }
    }
    printf("added matrix is:");
    for (i=0;i<k;i++){
        for(j=0;j<3;j++){
            printf("%d ",s3[i][j]);
        }
        printf("\n");
    }
}