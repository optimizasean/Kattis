#include <iostream>

int main(){
    int x, y, z = 0;
    std::cin >> x;
    for(int i = 0; i < x; i++){
        std::cin >> y;
        if(y < 0) z++;
    }
    std::cout << z << std::endl;
    return 0;
}