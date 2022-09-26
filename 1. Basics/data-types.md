### Primitives: 8
* There are 8 types of primitive distributed in 4 categories:
    - boolean: 
    - byte: 1byte -2^7 to 2^7-1
    - short: 2byte -2^15 to 2^15-1
    - char: 2byte
    - int: 4byte -2^31 to 2^31-1
    - float: 4bytes
    - long: 8bytes -2^63 to 2^63-1
    - double: 8bytes
* Character:
    - Character is a unicode text characters, 16 bits to support unicode
    - **ASCII is a subset of UNICODE, Last 8 bits of UNICODE represents ASCII if first 8 are zero**
    - Escape sequence: \n, \t, \\, \uXXX - for new line, tab, \ and hexcode respectively

### Non-Primitive
* String
* Array
* Object
* Class
* Interface

### Big numbers
* For numbers greater than long or double use BigInteger and BigDecimal
* Takes in strings as input
* Normal operators like *,+,- don't work on them

### Operator precedence
 - Expression evaluated from left to right
 - */% > +-
