/*GAUSS ELIMINATION METHOD
Q.x+y-z=7
   x-y+2z=3
  2x+y+z=9

Program:-*/
#include<stdio.h>
#include<conio.h>

int main()
{
	float a[10][10],x[10],s,t;
	int i,j,n,k;
	printf("enter the number of unknowns=>");
	scanf("%d",&n);
	
	printf("enter the elements=>\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<=n;j++)
		{				 
			scanf("%f",&a[i][j]);
		}
	}
	// upper triangular matrix
	
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			t=a[j][i]/a[i][i];
			for(k=0;k<=n;k++)
			{
				a[j][k]=a[j][k]-a[i][k]*t;
			}
		}
	}
	printf("The upper triangular matrix is=>\n");
	for(i=0;i<n;i++)
	{
		printf("\n");
		for(j=0;j<=n;j++)
		{
			printf("%.4f  ",a[i][j]);
		}
	}
	
	//backward substitution
	
	for(i=n-1;i>=0;i--)
	{
		s=0;
		for(j=i+1;j<n;j++)
		{
			s=s+a[i][j]*x[j];
		}
		x[i]=(a[i][n]-s)/a[i][i];
	}
	
	printf("\n\n\n the solution is....\n");
	for(i=0;i<n;i++)
	{
		printf("X[%d]=%.4f\n",i+1,x[i]);
	}
	return 0;
}



