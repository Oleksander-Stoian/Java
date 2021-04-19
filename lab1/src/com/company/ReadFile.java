package com.company;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class ReadFile {
    String[] words;
    int size = 0;

    ArrayList<String> FinalWords = new ArrayList<String>();

    void read() throws FileNotFoundException {

        File file = new File("file3.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";
        while (scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");

        }
        words = fileContent.split("[={}()+-/0123456789#*—“”\"\'\\s.,;:!&?$’‘\\[\\]\\\\]+");
       // System.out.println(Arrays.toString(words));
    }

    void foo() {
        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
        int Vowel;
        double wordsize=0.0;
        size = uniqueWords.size();
        char[] VowelSounds={'A','E','I','O','U','Y','a','e','i','o','u','y'};
        String word;
        char[] bukvy;
        int length;
        for (int i = 0; i <= size; ++i)
        {


                word = words[i];
                //System.out.println("word =" + word);
                bukvy = word.toCharArray();
                Vowel=0;
                length=word.length();
                for (int x = 0; x < bukvy.length; ++x)
                {
                    for(int y=0;y<VowelSounds.length;++y)
                    {
                        if(bukvy[x]==VowelSounds[y])
                        {

                            ++Vowel;
                        }

                    }

                }

                wordsize= length*0.5;
                String print;
                int l;
                if(Vowel> wordsize)
                {

                    l=0;
                    if(FinalWords.size()>0)
                    {
                        for(int k =0; k < FinalWords.size();++k)
                        {
                            print =  FinalWords.get(k);
                            if(print.equals(word))
                            {

                                l=1;
                            }
                        }
                    }

                    if(l==0 && length<=30)
                    {
                        FinalWords.add(word);

                    }

                }




        }

        String print;
        for(int i =0; i < FinalWords.size();++i)
        {
            print=  FinalWords.get(i);
            System.out.println(i + " - "+ print);
        }





    }
}
