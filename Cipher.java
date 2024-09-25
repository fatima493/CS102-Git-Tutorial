public class Cipher {
        // Strings for keeping the alphabets, one for the original letters and the other for the encrypted ones
        public static final String ORIGINAL_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        public static final String CIPHER_ALPHABET = "dfxyhrklvwuasgimnojpqetbcz";
    
        // Method to encrypt a string
        public String encrypt(String inputString) {
            String outputString = "";
    
            // Fill in the for loop
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                // Replace the character
                outputString += replaceChar(currentChar, true);
            }
    
            return outputString;
        }
    
        // Decrypt method
        public String decrypt(String inputString) {
            String outputString = "";
    
            // Fill in the for loop
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                // Make sure the outputString is updates
                outputString += replaceChar(currentChar, false);
            }
    
            return outputString;
        }
    
        // Replace the input
        private char replaceChar(char inputChar, boolean isEncrypt) {
            // Convert to lowercase to handle case-insensitive matching
            char lowerChar = Character.toLowerCase(inputChar);
    
            //Replace the for loops with if/else statements
            // Check if the character is in the alphabet
            if (ORIGINAL_ALPHABET.indexOf(lowerChar) != -1) {
                if (isEncrypt) {
                    // Revert alphabet to the cipher alphabet
                    int index = ORIGINAL_ALPHABET.indexOf(lowerChar);
                    return CIPHER_ALPHABET.charAt(index);
                } else {
                    // Revert cipher to the alphabet
                    int index = CIPHER_ALPHABET.indexOf(lowerChar);
                    return ORIGINAL_ALPHABET.charAt(index);
                }
            }
    
            // If the character is not in the alphabet (e.g., space, punctuation), return it as is
            return inputChar;
        }
    }
