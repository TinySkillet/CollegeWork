#include <stdio.h>
#include <stdlib.h>
#include <string.h>

const char *random_stream = "/dev/random";

void generatePassword(char *memory, int length)
{
    FILE *file = fopen(random_stream, "r");
    int c = fgetc(file);

    if (c == EOF)
    {
        printf("%s could not be read\n", random_stream);
        exit(-1);
    }

    int char_min = 33;
    int char_max = 126;

    unsigned int r;
    for (int i = 0; i < length; i++)
    {
        r = fgetc(file);

        // limit r to 33 - 126
        r = (r % (char_max - char_min + 1)) + char_min;

        *(memory + i) = r;
    }
    memory[length] = '\0';
}

int main(int argc, const char *argv[])
{
    if (argc != 2)
    {
        printf("Usage: passgen <num-of-bytes>\n");
        return 0;
    }

    int length = atoi(argv[1]);
    printf("Generating password of %d bytes\n", length);

    char *password = malloc(length + 1);

    generatePassword(password, length);
    printf("Generated Password: \n%s\n", password);

    free(password);
    return 0;
}
