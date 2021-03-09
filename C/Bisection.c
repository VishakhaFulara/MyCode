//Program for Bisection Method
#include<stdio.h>
#include<math.h>

float fun(float x){
	return (x*x*x-2*x-5);
}

float bisection(float x,float y){
	return ((x+y)/2);
}

int main(){
	int max_it,i=1;
	float a,b,x;
	printf("enter max. iteration:");
	scanf("%d",&max_it);
	while(1){
		printf("enter a & b:");
		scanf("%f%f",&a,&b);
		if(fun(a)*fun(b)<0){
			printf("\nThe root lies between %f & %f ",a,b);
			break;
		}
		else
			printf("\nInvalid root.....\n");
	}

	while(i<=max_it){
		x=bisection(a,b);						//find mid point
		if(fun(x)>0){                           //if value is positive then b=x
			b=x;
		}
		else{									//if value is negative then a=x
			a=x;
		}
		printf("\nIterations=%d  Roots=%f", i,x);
		i++;
	}
	printf("\n\nTotal Iterations=%d  Roots=%f", --i,x);
	return 0;
}




/*

#include<stdio.h>
#include<stdlib.h>
#include<math.h>
float findValueAt(float x)      
{
	return(x*x*x - 2*x - 5);
}
float bisect(float x1, float x2)
{
	return((x1+x2)/2);
}

int main()
{
	int maxIteration, i=1;
	float x1, x2, x;
	printf("\nEnter Maximum no. of Iterations: ");
	scanf("%d", maxIteration);
	do
 	{
		printf("\nEnter the value of x1 and x2(starting boundary): \n");   // x1, x2 are roots
		scanf("%f%f", &x1, &x2);
		if(findValueAt(x1)*findValueAt(x2)>0)
   		{
			printf("\nRoots are Invalid: ");
			continue;
   		}
		else
   		{
			printf("\nRoots lie between %f and %f", x1,x2);
			break;
   		}
	}
 	while(1);
/////////////////////////////////////////////////////////////////////////////////////////////////////
	while(i<=maxIteration)
 	{
  		x = bisect(x1,x2);    //find the mid point
		if(findValueAt(x)*findValueAt(x1)<0)
			x2=x;    // x2 is shifted
		else if(findValueAt(x)*findValueAt(x2)<0)
			x1=x;    // x1 is shifted
		printf("\nIterations=%d  Roots=%f", i,x);
			i++;
 	}
	printf("Roots=%f  Total Iterations=%d", x,--i);
	return 0;
}


*/
