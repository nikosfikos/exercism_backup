import static java.lang.Character.*;

class SqueakyClean {
    static String clean(String identifier) {
        boolean isDash = false;
        StringBuilder builder = new StringBuilder();
        char[] asArray = identifier.toCharArray();
        for (char ch : asArray){
            if (isDigit(ch)){
                if(ch == '4'){
                    ch = 'a';
                } else if (ch == '3') {
                    ch = 'e';
                } else if (ch == '0') {
                    ch = 'o';
                } else if (ch == '1') {
                    ch = 'l';
                } else if (ch == '7') {
                    ch = 't';
                }
            } else if (!isLetter(ch) && !isWhitespace(ch) && ch !='-') {
                continue;
            }
            if (isDash){
                ch = toUpperCase(ch);
                isDash = false;
            }
            if(isWhitespace(ch)){
                builder.append('_');
            } else if (ch == '-'){
                isDash = true;
            }
            else builder.append(ch);
        }

        return builder.toString();
    }
}
