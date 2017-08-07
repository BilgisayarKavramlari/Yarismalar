#include <stdio.h>
#include <math.h>

int main(void) {

    int radius, x, y;

    printf("Yaricap uzunlugu: ");
    scanf("%d", &radius);

    int radius_sqrt2 = (int) (radius * sqrt(2));

    for(x = -radius; x <= - radius_sqrt2 / 2; x++) {
        for (y = -radius; y <= radius; y++){
            if (x * x + y * y == radius * radius)
                printf("* ");
            else
                printf("  ");
        }
        puts("");
    }

    int count_spaces = 0;
    for(y = -radius; y <= - radius_sqrt2 / 2 -1; y++) {
        count_spaces++;
        if (x * x + y * y == radius * radius) {
            printf("* ");
            break;
        } else
            printf("  ");
    }

    for(int i = 0; i < radius_sqrt2; i++)
        printf("* ");

    for(y = radius_sqrt2 / 2 + 1; y <= radius; y++) {
        if (x * x + y * y == radius * radius) {
            printf("* ");
            break;
        } else
            printf("  ");
    }

    x++;
    puts("");

    for(int i = 1; i < radius_sqrt2 / 2; i++) {
        int count = 0, count2 = 0;
        for(y = -radius; y <= -radius + count_spaces; y++) {
            count++;
            if (x * x + y * y == radius * radius) {
                printf("* ");
                break;
            } else
                printf("  ");
        }
        count2 = count;
        for(int j = 0; j < i + count_spaces - count; j++) {
            count2++;
            printf("  ");
        }
        printf("* ");

        for(y = -radius + count2; y <= radius; y++) {
            if (x * x + y * y == radius * radius) {
                printf("* ");
                break;
            } else
                printf("  ");
        }

        puts("");
        x++;
    }

    for(int i = radius_sqrt2 / 2; i > 0; i--) {
        int count = 0, count2 = 0;
        for(y = -radius; y <= -radius + count_spaces; y++) {
            count++;
            if (x * x + y * y == radius * radius) {
                printf("* ");
                break;
            } else
                printf("  ");
        }
        count2 = count;
        for(int j = 0; j < i + count_spaces - count; j++) {
            count2++;
            printf("  ");
        }
        printf("* ");

        for(y = -radius + count2; y <= radius; y++) {
            if (x * x + y * y == radius * radius) {
                printf("* ");
                break;
            } else
                printf("  ");
        }

        puts("");
        x++;
    }

    for(y = -radius; y <= - radius_sqrt2 / 2 -1; y++) {
        if (x * x + y * y == radius * radius) {
            printf("* ");
            break;
        } else
            printf("  ");
    }

    for(int i = 0; i < radius_sqrt2; i++)
        printf("* ");
    puts("");

    for(y = radius_sqrt2 / 2 + 1; y <= radius; y++) {
        if (x * x + y * y == radius * radius) {
            printf("* ");
            break;
        } else
            printf("  ");
    }
    puts("");
    x++;

    for(x = radius_sqrt2 / 2; x <= radius; x++) {
        for (y = -radius; y <= radius; y++){
            if (x * x + y * y == radius * radius)
                printf("* ");
            else
                printf("  ");
        }
        puts("");
    }
}
