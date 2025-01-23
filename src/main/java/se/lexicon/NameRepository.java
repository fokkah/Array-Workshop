package se.lexicon;

import java.lang.reflect.Array;

/**
 * The NameRepository class provides methods to manage a list of names.
 * It offers functionalities such as adding, removing, finding, and updating names.
 */
public class NameRepository {

    private static String[] names = new String[1]; // element format should be ["firstName lastName", "firstName lastName"]

        public static void print(String[] arr){ //Testing purpose
            for (String element : arr){
                System.out.println(element);
            }
        }
    /**
     * Retrieves the current size of the names array.
     *
     * @return The number of elements in the names array.
     */
    public static int getSize() {
        //todo: PART 1: implement getSize method

        return names.length;
    }


    /**
     * Sets the names array to the provided array of names & it should replace all existing names.
     *
     * @param names The array of names to set.
     */
    public static void setNames(final String[] names) {
        //todo: PART 1: implement setNames method

        String[] setNames = {"", "", ""};
        System.out.println("Be4Set : ");
        for (String x : setNames){
            System.out.println(x);
        }
        System.out.println("\nAfter Set : ");
        Array.set(setNames,0,"First Name");
        Array.set(setNames,1,"last name");
        for (String x : setNames);{
            System.out.println();
        }

    }


    /**
     * Clears the names array by creating a new empty array.
     */
    public static void clear() {
        //todo: PART 1: implement clear method
        String[] names = new String[]{};
        names = null;
    }


    /**
     * Returns all names in a new array (Retrieves a copy of the names array).
     *
     * @return A new array containing all elements from the names array.
     */
    public static String[] findAll() {
        //todo: PART 1: implement findAll method
        String[] names = new String [4];
        names[0] = new String("tompa");
        names[1] = new String("Leif");
        names[2] = new String("jonas");
        names[3] = new String("carro");
        print(names); //Testing purpose
        return names;
    }


    /**
     * Finds a name that matches the given fullName case-insensitively.
     *
     * @param fullName The full name to search for.
     * @return The matching name if found; otherwise, null.
     */
    public static String find(final String fullName) {
        //todo: PART 2: implement find method
        return null;
    }


    /**
     * Adds a new fullName to the names array if it doesn't already exist.
     *
     * @param fullName The full name to add.
     * @return True if the fullName is added successfully; false if it already exists.
     */
    public static boolean add(final String fullName) {
        //todo: PART 2: implement add method
        return false;
    }


    /**
     * Find all names that match the given firstName.
     *
     * @param firstName The first name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByFirstName(final String firstName) {
        //todo: PART 3: findByFirstName method
        return null;
    }


    /**
     * Find all names that match the given lastName.
     *
     * @param lastName The last name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByLastName(final String lastName) {
        //todo: PART 3: implement findByLastName method
        return null;
    }


    /**
     * Updates a name in the names array from the original name to the updated name.
     *
     * @param original    The original name to update.
     * @param updatedName The updated name to set.
     * @return True if the name is updated successfully; false if the updated name already exists or the original name is not found.
     */
    public static boolean update(final String original, final String updatedName) {
        //todo: PART 3: implement update method
        return false;
    }


    /**
     * Removes a name from the names array, case-insensitively.
     *
     * @param fullName The full name to remove.
     * @return True if the name is removed successfully; false if the name is not found in the array.
     */
    public static boolean remove(final String fullName) {
        //todo: PART 4: implement remove method
        return false;
    }


}