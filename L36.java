//string buffer and string builder
/*#1
StringBuffer class and StringBuilder class
--  string buffer and string builder class in java used to create mutable string 

#2
Different method
 --First Create StringBuffer object 
        syntax: StringBuffer sb = new StringBuffer("Hello");
 --Find capacity of StringBuffer 
        System.out.println(sb.capacity());
        -- default capacity is 16 characters but now it will be 16+5= 21

--Find the length of StringBuffer Created String
        System.out.println(sb.length());
    
--To append the content in existing StringBuffer object
        sb.append(" World");

--To Convert StringBuffer Object into String Object
        String str=sb.toString();
        System.out.println(str);

-- Delete charcter of particular index
        sb.deleteCharAt(3);
        -- delete character at index 3

-- Insert "hi " at index 0 of existingStringBuffer Object
        sb.insert(0, "Hi ");
        System.out.println(sb);

#3
Difference between StringBuffer and StringBuilder
       -- StringBuffer is thread safe
       -- StringBuilder is not thread safe
Imp: We will discuss thread safe when we study multithreading
*/