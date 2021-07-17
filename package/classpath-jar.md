* **Class path** - It's a system variable that tell your compiler and class loader where to look for them
   - Not recomended to set it explicitly

* JAR - Java Archive
 * Jar format allows multiple files to be bundeled together in single Java archive
 * It's just a zip file with jar extension
 * Why jar:
   - Security - Allows to be digitally signed
   - Compression - Zip files are more compact in terms of size
   - Package versioning 
   - Portability - Handling jar files is a standard part of Java platforms's core api.

 * Within JDK's bin folder a tool called jar is present, used for zipping and unzipping.
   - It allows us to create jar files
   - cmd: jar cf KjarFileName> <inputFileName> <inputFileName> ... 
      * c here stands for create JAR file
      * f indicates output should go to a file and not standard output
