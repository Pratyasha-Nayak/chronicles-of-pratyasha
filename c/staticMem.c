#include <stdio.h>
#include <stdlib.h>
int main(){
    int n, a[n];
    scanf("%d",&n);
    int *ptr = (int*)calloc(5, sizeof(int));
    for (int i = 0; i < 5; i++) {
        scanf("%d",(ptr+i));
    }
    for (int j = 0; j <= n+1; j++) {
        printf("%d  ",*(ptr+j));
    }
    return 0;
}
