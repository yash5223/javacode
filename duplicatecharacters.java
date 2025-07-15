class duplicatecharacters{
    public static void main(String[] args) {
        String str1="hello";
        char duplicate = '\0';
        for(int i=0;i<=str1.length()-2;i++){
            for(int j=i+1;j<=str1.length()-1;j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    duplicate=str1.charAt(i);
                    System.out.println("Duplicate character: " + duplicate);
                }
            }
        }
    }
}


Reverse each word in a sentence:
Write a program to reverse every word in a given sentence, but keep the word order the same.
Example: Input: "hello world" → Output: "olleh dlrow"

Check for palindrome:
Write a program to check if a given string is a palindrome (reads the same forwards and backwards).

Count vowels and consonants:
Write a program to count the number of vowels and consonants in a given string.

Remove duplicate characters:
Write a program to remove all duplicate characters from a string.

Find the most frequent character:
Write a program to find the character that appears most frequently in a string.

Replace spaces with underscores:
Write a program to replace all spaces in a string with underscores.

Check if two strings are anagrams:
Write a program to check if two strings are anagrams of each other.

Capitalize the first letter of each word:
Write a program to capitalize the first letter of every word in a sentence.