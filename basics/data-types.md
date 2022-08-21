### Primitives:
* There are 8 types of primitive distributed in 4 categories:
    - boolean: 
    - byte: 8bits -2^7 to 2^7-1
    - short: 16bits -2^15 to 2^15-1
    - char: 16bits
    - int: 32bits -2^31 to 2^31-1
    - float: 32bits
    - long: 64bits -2^63 to 2^63-1
    - double: 64bits
* Character:
    - Character is a unicode text characters, 16 bits to support unicode
    - **ASCII is a subset of UNICODE, Last 8 bits of UNICODE represents ASCII if first 8 are zero**
    - Escape sequence: \n, \t, \\, \uXXX - for new line, tab, \ and hexcode respectively

### Big numbers
* For numbers greater than long or double use BigInteger and BigDecimal
* Takes in strings as input
* Normal operators like *,+,- don't work on them