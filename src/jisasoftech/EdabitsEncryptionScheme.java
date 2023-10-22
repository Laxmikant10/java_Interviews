package src.jisasoftech;

public class EdabitsEncryptionScheme {
    //static String encryption = "haveaniceday";
    //static String encryption = "feedthedog";
    //static String encryption = "chillout";
    static String encryption = "A Fool and His Money Are Soon Parted.";

    public static void main(String[] args) {
        String prepareEncryption = prepareEncryption(encryption);
        System.out.println("Encryption = " + "\n" + prepareEncryption);
    }

    private static String prepareEncryption(String encryption) {
        /*int encryptionLength = 0;
        for (char c : encryption.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                encryptionLength++;
            }
        }*/
        encryption = encryption.replaceAll(" ", "");
        int encryptionLength = encryption.length();
        int row = ((int) Math.floor(Math.sqrt(encryptionLength)));
        // System.out.println("Row = " + row);

        int column = ((int) Math.ceil(Math.sqrt(encryptionLength)));
        // System.out.println("Column = " + column);

        // Ensure rows x columns >= L
        if (row * column < encryptionLength) {
            row++;
        }

        // Create the grid and fill it with characters
        char[][] charArrayGrid = new char[row][column];
        int charIndex = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (charIndex < encryptionLength) {
                    charArrayGrid[i][j] = encryption.charAt(charIndex);
                    charIndex++;
                }
            }
        }

        /*System.out.println("Grid of Char row & column = " + row +" : "+column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(charArrayGrid[i][j]);
            }
            System.out.println();
        }*/


        //Construct the encrypted message by reading the grid column by column
        StringBuilder encryptedMessage = new StringBuilder();
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                if(charArrayGrid[i][j] != '\u0000') {
                    encryptedMessage.append(charArrayGrid[i][j]);
                }
            }
            if (j < column - 1) {
                encryptedMessage.append(" "); // Insert a space between columns
            }
        }
        return encryptedMessage.toString();
    }
}
