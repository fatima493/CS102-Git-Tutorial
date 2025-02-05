public class Cipher {
        public static final String ORIGINAL_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        public static final String CIPHER_ALPHABET = "dfxyhrklvwuasgimnojpqetbcz";
    
        // Encrypting the string
        public String encrypt(String inputString) {
            String outputString = "";
    
            // Loop was empty
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                // replaceChar
                outputString += replaceChar(currentChar, true);
            }
    
            return outputString;
        }
    
        // Decrypting the string
        public String decrypt(String inputString) {
            String outputString = "";
    
            // Loop was empty
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                // Updating the output
                outputString += replaceChar(currentChar, false);
            }
    
            return outputString;
        }
    
        // replaceChar
        private char replaceChar(char inputChar, boolean isEncrypt) {
            // check case-senstivity
            char lowerChar = Character.toLowerCase(inputChar);
    
            //Replaced for loops with if/else + check if the character is in the alphabet
            if (ORIGINAL_ALPHABET.indexOf(lowerChar) != -1) {
                if (isEncrypt) {
                    // Alphabet to the cipher
                    int index = ORIGINAL_ALPHABET.indexOf(lowerChar);
                    return CIPHER_ALPHABET.charAt(index);
                } else {
                    // Cipher to the alphabet
                    int index = CIPHER_ALPHABET.indexOf(lowerChar);
                    return ORIGINAL_ALPHABET.charAt(index);
                }
            }
    
            // If alphabet does not contain the char
            return inputChar;
        }
    }
