#include <iostream>
int main() {
    int N;
    std::cin >> N;
    float q, y, z = 0;
    for (int i = 0; i < N; i++) {
        std::cin >> q >> y;
        z += q * y;
    }
    std::cout << z << "\n";
    return 0;
}