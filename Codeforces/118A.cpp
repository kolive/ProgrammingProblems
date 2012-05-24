#include <iostream>
using namespace std;

/* This program takes in a string input and reformats it according to the problem description */
int main()
{
    string petin;
    cin >> petin;
    char vowels[] = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
    char tmp;
    int i = 0;
    while(petin[i])
    {
        tmp = petin[i];
        for(int j = 0; j < 12; j++)
            if(tmp == vowels[j])
            {
                tmp = 'O';
                break;
            }
        if(tmp != 'O')
            cout << '.' << (char)tolower(petin[i]);
        i++;

    }

    return 0;
}
