#include<libpiface-1.0/pfio.h>
#include<stdio.h>
#include<stdlib.h>

int main(int argc, char* argv[])
{
pfio_init();

int i,a1,a2,a3,a4;
FILE *fp; /* używamy metody wysokopoziomowej - musimy mieć zatem identyfikator pliku, uwaga na gwiazdkę! */

a1 = atoi(argv[1]);
a2 = atoi(argv[2]);
a3 = atoi(argv[3]);
a4 = atoi(argv[4]);
  
    	if (a1==1) pfio_digital_write (2,1);
        if (a2==1) pfio_digital_write (3,1);
        if (a3==1) pfio_digital_write (4,1);
        if (a4==1) pfio_digital_write (5,1);

		if (a1==0) pfio_digital_write (2,0);
    	if (a2==0) pfio_digital_write (3,0);
    	if (a3==0) pfio_digital_write (4,0);
    	if (a4==0) pfio_digital_write (5,0);

//f=fopen ("/home/pi/test.txt", "wt");
//fprintf (f, "p1=%d p2=%d p3=%d p4=%d", a1,a2,a3,a4);


   char tekst[] = "TEST\n\n";
   
   if ((fp=fopen("/home/pi/test.txt", "w"))==NULL) {
     printf ("Nie mogę otworzyć pliku test.txt do zapisu!\n");
	 perror("błąd otwarcia pliku");
     exit(1);
     }
   fprintf (fp, "%s", tekst);   /* zapisz nasz łańcuch w pliku */
   fprintf (fp,"To jest testowy plik programu pi.c \n wartości zmiennych:\n p1=%d p2=%d p3=%d p4=%d \n",a1,a2,a3,a4);
   fclose (fp); /* zamknij plik */
	

printf("\nKoniec proogramu\n");

return 77;
}
