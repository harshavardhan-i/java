### Default literals
 * 2 is an integer
 * 2L or 2l is long
 * 2.0F or 2.0f is a float
 * 2.0D or 2.0d is a Double
 * 2.0 is a **double by default**, redundant
 * 070  - 70 octal is 56 in decimal
 * 0x7E - 7E hexadecimal is 126 in decimal 
 * 0b101 - 101 binary 5 in decimal
 * 0B101 - 101 in binary 
 * 123_456 - meant to separate numbers into natural groups for readability
    - Underscore cannot be place at the begining or the end
    - Cannot be placed right after or before '.' a decimal

### Conversion
 * Two type of conversions
    - Widening conversion: When lower bit literal/variable is assigned to higher bit variable
        * long b = 8 : 8 is an int assigned to long
        * Assigning int to a float may result in precision loss
    - Narrowing conversion: Not allowed
        * byte a = 8 : here 8 an int(32) is assigned to byte(8). Special case 8 int is converted to byte and this kind of same line literal declaration is allowed. Needs to be typecasted explicitly
    - char a = 4; Numbers assigned to char acts as a code point in unicode and stores the relevant char
 * Narrowing conversions needs to be typecasted explicity. But this might lead to overflow/underflow
    - int x = 200
    - byte y = (byte)x
    