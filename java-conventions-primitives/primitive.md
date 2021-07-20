### Primitives:
 * Primitives unlike objects don't have behaviour
 * Primitive type are all signed in java 
 * Only have one state aka values
 * There are 8 types of primitive distributed in 4 categories:
    - Integer type: byte, short, int and long
        * boolean: 1 bit
        * byte: 8bits -2^7 to 2^7-1
        * short: 16bits -2^15 to 2^15-1
        * char: 16bits
        * int: 32bits -2^31 to 2^31-1
        * float: 32bits
        * long: 64bits -2^63 to 2^63-1
        * double: 64bits
    - Float float type: float, double
    - Character type: char
        * Character is a unicode text characters, 16 bits to support unicode
        * ASCII is a subset of UNICODE, Last 8 bits of UNICODE represents ASCII if first 8 are zero
        * Escape sequence: \n, \t, \\, \uXXX - for new line, tab, \ and hexcode respectively
    - Boolean: boolean

### Big numbers
 * For numbers greater than long or double use BigInteger and BigDecimal
 * These are provided by java api
 * Basically java classes 
 * Takes in strings as input
 * Normal operators like *,+,- don't work on them
 * Need to use methods provided by those classes