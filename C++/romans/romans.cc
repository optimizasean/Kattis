#include <iostream>
int main() {
    float X;
    int z;
    std::cin>>X;
    z = X * 1000. * (5280. / 4854.) + 0.5;
    std::cout<<z<<"\n";
    return 0;
}