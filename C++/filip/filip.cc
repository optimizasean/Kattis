#include <cstdio>
int main() {
    char x[7], *a, *b;
    for (int i = 0; i < 7; i++) {
        std::scanf("%c", &x[i]);
    }
    a = x;
    b = x + 4;
    int A = a[2] - '0', B = b[2] - '0';
    if (A < B) {
        std::printf("%c%c%c", b[2], b[1], b[0]);
    } else if (A > B) {
        std::printf("%c%c%c", a[2], a[1], a[0]);
    } else {
        A = a[1] - '0';
        B = b[1] - '0';
        if (A < B) {
            std::printf("%c%c%c", b[2], b[1], b[0]);
        } else if (A > B) {
            std::printf("%c%c%c", a[2], a[1], a[0]);
        } else {
            A = a[2] - '0';
            B = b[2] - '0';
            if (A < B) {
                std::printf("%c%c%c", b[2], b[1], b[0]);
            } else if (A > B) {
                std::printf("%c%c%c", a[2], a[1], a[0]);
            } else {
                std::printf("%c%c%c", a[2], a[1], a[0]);
            }
        }
    }
    return 0;
}
