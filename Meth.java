package UsefullFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Bunch of useful methods.
 *
 * @author Daniel Krauskopf
 */
/*
 * @author [author name] - identifies author(s) of a class or interface.
 * @version [version] - version info of a class or interface.
 * @param [argument name] [argument description] - describes an argument of method or constructor.
 * @return [description of return] - describes data returned by method (unnecessary for constructors and void methods).
 * @exception [exception thrown] [exception description] - describes exception thrown by method.
 * @throws [exception thrown] [exception description] - same as @exception.
 * {@link #file(prams)}
 */

/*
 * Modifier    | Class | Package | Subclass | World
 * ————————————+———————+—————————+——————————+———————
 * public      |  yes  |   yes   |   yes    |   yes
 * ————————————+———————+—————————+——————————+———————
 * protected   |  yes  |   yes   |   yes    |   no
 * ————————————+———————+—————————+——————————+———————
 * no modifier |  yes  |   yes   |    no    |   no
 * ————————————+———————+—————————+——————————+———————
 * private     |  yes  |    no   |    no    |   no
 */
public class Meth {
    
    /**
     * A normal scanner.
     */
    public static Scanner scanner = new Scanner(System.in);
    //_---------------------------------------------------------------_\\
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String BLUE = "\033[34m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String BLUE_B = "\033[44m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String CYAN = "\033[36m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String CYAN_B = "\033[46m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String GREEN = "\033[32m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String MAGENTA = "\033[35m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String MAGENTA_B = "\033[45m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String RED = "\033[31m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String RED_B = "\033[41m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String RESET = "\033[0m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String WHITE = "\033[37m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String WHITE_B = "\033[47m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String YELLOW = "\033[33m";
    /**
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String YELLOW_B = "\033[43m";
    /**
     * <b>DO NOT USE ... BROKEN </b>
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String BLACK = "\033[30m"; // broken
    /**
     * <b>DO NOT USE ... BROKEN </b>
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String BLACK_B = "\033[40m"; // broken
    /**
     * <b>DO NOT USE ... BROKEN </b>
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String BLINK = "\033[5m"; // broken
    /**
     * <b>DO NOT USE ... BROKEN </b>
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String BOLD = "\033[1m"; // broken
    /**
     * <b>DO NOT USE ... BROKEN </b>
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String INVISIBLE = "\033[8m"; // broken
    /**
     * <b>DO NOT USE ... BROKEN </b>
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String REVERSED = "\033[7m"; // broken
    /**
     * <b>DO NOT USE ... BROKEN </b>
     * Strings of colour editing. The name of the variable is the colour that it
     * makes.
     */
    public static final String UNDERLINED = "\033[4m"; // broken

    //_-----------------------------------------------------------_\\
    /**
     * Prints strings on one line.
     *
     * @param print The to print.
     */
    public static void print(String print) {
        System.out.print(print);
    } // print string

    /**
     * Prints strings with new line.
     *
     * @param print The to print.
     */
    public static void println(String print) {
        System.out.println(print);
    } // println string

    /**
     * Prints using colour. (end the colour)
     *
     * @param print The String to print.
     * @param colour The colour code
     */
    public static void print(String print, String colour) {
        System.out.print(colour + print + Meth.RESET);
    } // print string colour

    /**
     * Prints using colour and new line. (end the colour)
     *
     * @param print The String to print.
     * @param colour The colour code
     */
    public static void println(String print, String colour) {
        System.out.println(colour + print + Meth.RESET);
    } // println string colour

    /**
     * Prints integers on one line.
     *
     * @param print The to print.
     */
    public static void print(int print) {
        System.out.print(print);
    } // print int

    /**
     * Prints integers with new line.
     *
     * @param print The to print.
     */
    public static void println(int print) {
        System.out.println(print);
    } // println int

    /**
     * Prints using colour. (end the colour)
     *
     * @param print The String to print.
     * @param colour The colour code
     */
    public static void print(int print, String colour) {
        System.out.print(colour + print + Meth.RESET);
    } // print int colour

    /**
     * Prints using colour and new line. (end the colour)
     *
     * @param print The String to print.
     * @param colour The colour code
     */
    public static void println(int print, String colour) {
        System.out.println(colour + print + Meth.RESET);
    } // println int colour

    /**
     * Prints doubles on one line.
     *
     * @param print The to print.
     */
    public static void print(double print) {
        System.out.print(print);
    } // print double

    /**
     * Prints doubles with new line.
     *
     * @param print The to print.
     */
    public static void println(double print) {
        System.out.println(print);
    } // println double

    /**
     * Prints using colour. (end the colour)
     *
     * @param print The String to print.
     * @param colour The colour code
     */
    public static void print(double print, String colour) {
        System.out.print(colour + print + Meth.RESET);
    } // print double colour

    /**
     * Prints using colour and new line. (end the colour)
     *
     * @param print The String to print.
     * @param colour The colour code
     */
    public static void println(double print, String colour) {
        System.out.println(colour + print + Meth.RESET);
    } // println double colour

    //_--------------------------------------_\\
    /**
     * <b>DO NOT USE .. OLD</b>
     * Gets all of the data in a file.
     *
     * @param fileLocation The position of the file on the disk.
     * @return The string array of data.
     */
    public static String[] getFileOld(String fileLocation) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            int fileNumberValue = 0;
            while (true) {
                try {
                    if (bufferedReader.readLine().isEmpty()) {
                        break;
                    } else {
                        fileNumberValue++;
                    }
                } catch (NullPointerException error) {
                    break;
                }
            }
            bufferedReader.close();

            String[] fileData = new String[fileNumberValue];
            bufferedReader = new BufferedReader(new FileReader(fileLocation));
            for (int fileLine = 0; fileLine < fileNumberValue; fileLine++) {
                fileData[fileLine] = bufferedReader.readLine();
            }
            bufferedReader.close();
            return fileData;
        } catch (FileNotFoundException error) {
            Meth.println("file not found: " + error);
        } catch (IOException error) {
            Meth.println("an error occoured: " + error);
        }
        return null;
    } // getFileOld

    /**
     * Gets all of the data in a file. (works better then the {@link #getFileOld(java.lang.String)
     * })
     *
     * @param fileLocation Where the file is.
     * @return The array from the file.
     */
    public static String[] getFile(String fileLocation) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            ArrayList<String> arrayList = new ArrayList<String>();
            while (bufferedReader.ready()) {
                arrayList.add(bufferedReader.readLine());
            }
            return arrayList.toArray(new String[arrayList.size()]);
        } catch (FileNotFoundException error) {
            Meth.println("file not found: " + error);
        } catch (IOException error) {
            Meth.println("an error occoured: " + error);
        }
        return null;
    } // getFile

    //_----------------------------------_\\
    /**
     * Puts into an array the entire alphabet following option.
     *
     * @param option The options: <br />
     * <ul>
     * <li>0 - Random order; random case</li>
     * <li>1 - Random order; uppercase</li>
     * <li>2 - Random order; lowercase</li>
     * <hr />
     * <li>10 - Real order; random case</li>
     * <li>11 - Real order; uppercase</li>
     * <li>12 - real order; lowercase</li>
     * <hr />
     * <li>20 - Allow duplicate; random case</li>
     * <li>21 - Allow duplicate; upper case</li>
     * <li>22 - Allow duplicate; lower case</li>
     * </ul>
     * @return The array of the alphabet based on option.
     */
    public static String[] alphabet(int option) {
        int rand, count = 0;
        String[][] alpha = new String[36][2];
        alpha[0][0] = "A";
        alpha[1][0] = "B";
        alpha[2][0] = "C";
        alpha[3][0] = "D";
        alpha[4][0] = "E";
        alpha[5][0] = "F";
        alpha[6][0] = "G";
        alpha[7][0] = "H";
        alpha[8][0] = "I";
        alpha[9][0] = "J";
        alpha[10][0] = "K";
        alpha[11][0] = "L";
        alpha[12][0] = "M";
        alpha[13][0] = "N";
        alpha[14][0] = "O";
        alpha[15][0] = "P";
        alpha[16][0] = "Q";
        alpha[17][0] = "R";
        alpha[18][0] = "S";
        alpha[19][0] = "T";
        alpha[20][0] = "U";
        alpha[21][0] = "V";
        alpha[22][0] = "W";
        alpha[23][0] = "X";
        alpha[24][0] = "Y";
        alpha[25][0] = "Z";
        alpha[26][0] = "0";
        alpha[27][0] = "1";
        alpha[28][0] = "2";
        alpha[29][0] = "3";
        alpha[30][0] = "4";
        alpha[31][0] = "5";
        alpha[32][0] = "6";
        alpha[33][0] = "7";
        alpha[34][0] = "8";
        alpha[35][0] = "9";


        alpha[0][1] = "true";
        alpha[1][1] = "true";
        alpha[2][1] = "true";
        alpha[3][1] = "true";
        alpha[4][1] = "true";
        alpha[5][1] = "true";
        alpha[6][1] = "true";
        alpha[7][1] = "true";
        alpha[8][1] = "true";
        alpha[9][1] = "true";
        alpha[10][1] = "true";
        alpha[11][1] = "true";
        alpha[12][1] = "true";
        alpha[13][1] = "true";
        alpha[14][1] = "true";
        alpha[15][1] = "true";
        alpha[16][1] = "true";
        alpha[17][1] = "true";
        alpha[18][1] = "true";
        alpha[19][1] = "true";
        alpha[20][1] = "true";
        alpha[21][1] = "true";
        alpha[22][1] = "true";
        alpha[23][1] = "true";
        alpha[24][1] = "true";
        alpha[25][1] = "true";
        alpha[26][1] = "true";
        alpha[27][1] = "true";
        alpha[28][1] = "true";
        alpha[29][1] = "true";
        alpha[30][1] = "true";
        alpha[31][1] = "true";
        alpha[32][1] = "true";
        alpha[33][1] = "true";
        alpha[34][1] = "true";
        alpha[35][1] = "true";

        String[] value = new String[36];
        do {
            if (option >= 20) {
                rand = (int) (Math.random() * value.length);
                if (option - 20 == 0) {
                    if ((int) (Math.random() * 2) == 0) {
                        value[count] = alpha[rand][0].toUpperCase();
                    } else {
                        value[count] = alpha[rand][0].toLowerCase();
                    }
                } else if (option - 20 == 1) {
                    value[count] = alpha[rand][0].toUpperCase();
                } else if (option - 20 == 2) {
                    value[count] = alpha[rand][0].toLowerCase();
                } else {
                    Meth.printError("Wrong Option Number: " + option + "!");
                    break;
                }
                count++;
            } else if (option >= 10) {
                if (option - 10 == 0) {
                    if ((int) (Math.random() * 2) == 0) {
                        value[count] = alpha[count][0].toUpperCase();
                    } else {
                        value[count] = alpha[count][0].toLowerCase();
                    }
                } else if (option - 10 == 1) {
                    value[count] = alpha[count][0].toUpperCase();
                } else if (option - 10 == 2) {
                    value[count] = alpha[count][0].toLowerCase();
                } else {
                    Meth.printError("Wrong Option Number: " + option + "!");
                    break;
                }
                count++;
            } else if (option >= 0) {
                rand = (int) (Math.random() * value.length);
                if (Boolean.parseBoolean(alpha[rand][1])) {
                    if (option == 0) {
                        if ((int) (Math.random() * 2) == 0) {
                            value[count] = alpha[rand][0].toUpperCase();
                        } else {
                            value[count] = alpha[rand][0].toLowerCase();
                        }
                    } else if (option == 1) {
                        value[count] = alpha[rand][0].toUpperCase();
                    } else if (option == 2) {
                        value[count] = alpha[rand][0].toLowerCase();
                    } else {
                        Meth.printError("Wrong Option Number: " + option + "!");
                        break;
                    }
                    count++;
                }
            } else {
                Meth.printError("Wrong Option Number: " + option + "!");
                break;
            }
        } while (count < value.length);
        return value;
    } // alphabet

    /**
     * The alphabet but only until the given length.
     * @param option The alphabet options {@link #alphabet(int) }
     * @param length The maximum letter to return (max 36).
     * @return The array of the alphabet from 0 to the length.
     */
    public static String[] alphabet(int option, int length) {
        String[] ret = new String[length];
        System.arraycopy(Meth.alphabet(option), 0, ret, 0, length);
        return ret;
    }

    //_---------------------------------------------_\\
    /**
     * Uses regular expressions to search for text in a string.
     *
     * @param theRegex The regular expression to use for searching.
     * @param theString The string to look for the data.
     * @param returnValue The number for the match to return.
     * @return The given match for the given regular expression in the string.
     */
    public static String getRegex(String theRegex, String theString, int returnValue) {
        String[] ret = getRegexAll(theRegex, theString);
        return ret[returnValue];
    } // getRegex return value

    /**
     * Uses regular expressions to search for text in a string.
     *
     * @param theRegex The regular extheRegex The regular pression to use for
     * searching.
     * @param theString The string to look for the data.
     * @return The first match for the given regular expression in the string.
     */
    public static String getRegex(String theRegex, String theString) {
        String[] ret = getRegexAll(theRegex, theString);
        return ret[0];
    } // getRegex first

    /**
     * Uses regular expressions to search for text in a string.
     *
     * @param theRegex The regular extheRegex The regular pression to use for
     * searching.
     * @param theString The string to look for the data.
     * @return All of the matches for the given regular expression.
     */
    public static String[] getRegexAll(String theRegex, String theString) {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(theString);
        ArrayList<String> ret = new ArrayList<String>();
        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                ret.add(regexMatcher.group().trim());
            }
        }
        if (ret.isEmpty()) {
            String[] nill = {"[~NILL~]"};
            return nill;
        }
        return ret.toArray(new String[ret.size()]);
    } // getRegexAll

    /**
     * <b>DO NOT USE... OLD</b>
     *
     * @param theRegex
     * @param theString
     * @return
     */
    public static String[] getRegexAllOld(String theRegex, String theString) {
        int count = 0;
        Pattern checkRegex1 = Pattern.compile(theRegex);
        Matcher regexMatcher1 = checkRegex1.matcher(theString);
        while (regexMatcher1.find()) { // 11
            if (regexMatcher1.group().length() != 0) {
                count++;
            }
        }
        Pattern checkRegex2 = Pattern.compile(theRegex);
        Matcher regexMatcher2 = checkRegex2.matcher(theString);
        String[] ret = new String[count];
        count = 0;
        while (regexMatcher2.find() & count < ret.length) { // 11
            if (regexMatcher2.group().length() != 0) {
                ret[count] = regexMatcher2.group().trim();
                count++;
            }
        }
        return ret;
    } // getRegexAllT

    //_-------------------------------------------------------------------_\\
    /**
     * Converts ArrayList<int> to integer[]
     *
     * @param list the ArrayList<int>
     * @return the integer[]
     */
    public static int[] arrayListToInt(ArrayList<Integer> list) {
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    } // arrayListToInt

    /**
     * COmbins an int and a string array into a 2 dim array.
     *
     * @param first the integer array.
     * @param second the string array.
     * @return the 2 dim array.
     */
    public static String[][] combineArray(int[] first, String[] second) {
        ArrayList<String[]> ret = new ArrayList<String[]>();
        String[] adds = new String[2];
        for (int i = 0; i < first.length; i++) {
            adds[0] = Integer.toString(first[i]);
            adds[1] = second[i];
            ret.add(adds);
        }
        return ret.toArray(new String[2][]);
    } // combineArray

    /**
     * Puts data into a file.
     *
     * @param location Where the file is located.
     * @param data An array of the data to put into the file.
     */
    public static void insertFile(String location, String[] data) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(location));
            for (String i : data) {
                printWriter.println(i);
            }
            printWriter.close();
        } catch (FileNotFoundException error) {
            Meth.printError(error.toString());
        } catch (IOException error) {
            Meth.printError(error.toString());
        }
    } // insertFile

    /**
     * Prints in an error format.
     *
     * @param error The error as a string.
     */
    public static void printError(String error) {
        Meth.print("You have an error", Meth.BLUE);
        Meth.println(": " + error, Meth.RED);
    } // printError

    public static void main(String[] args) {
        Meth.insertFile("F:/Pie.txt", Meth.alphabet(20));
    }
    
    //_---------------------------------_//
    
    
    /**
     * Converts primitive data types. <br /> String => integer.
     * @param convert A String.
     * @return An integer.
     */
    public static int[] strint (String[] convert) {
        int[] ret = new int[convert.length];
        for (int i = 0; i < convert.length; i++) {
            ret[i] = Integer.parseInt (convert[i]);
        }
        return ret;
    }
    
    /**
     * Converts primitive data types. <br /> integer => String.
     * @param convert An integer.
     * @return A String.
     */
    public static String[] intstr (int[] convert) {
        String[] ret = new String[convert.length];
        for (int i = 0; i < convert.length; i++) {
            ret[i] = Integer.toString(convert[i]);
        }
        return ret;
    }
    
    /**
     * Converts primitive data types. <br /> double => integer.
     * @param convert A double.
     * @return An integer.
     */
    public static int[] doubint (double[] convert) {
        int[] ret = new int[convert.length];
        for (int i = 0; i < convert.length; i++) {
            ret[i] =  (int) Math.round(convert[i]);
        }
        return ret;
    }
    
    /**
     * Converts primitive data types. <br /> integer => double.
     * @param convert An integer.
     * @return A double.
     */
    public static double[] intdouble (int[] convert) {
        double[] ret = new double[convert.length];
        for (int i = 0; i < convert.length; i++) {
            ret[i] = convert[i];
        }
        return ret;
    }
    
    /**
     * Converts primitive data types. <br /> double => String.
     * @param convert A double.
     * @return A String.
     */
    public static String[] doubstr (double[] convert) {
        String[] ret = new String[convert.length];
        for (int i = 0; i < convert.length; i++) {
            ret[i] = Double.toString(convert[i]);
        }
        return ret;
    }
    
    /**
     * Converts primitive data types. <br /> String => double.
     * @param convert A String.
     * @return A double.
     */
    public static double[] strdouble (String[] convert) {
        double[] ret = new double[convert.length];
        for (int i = 0; i < convert.length; i++) {
            ret[i] = Double.parseDouble(convert[i]);
        }
        return ret;
    }
    
}
