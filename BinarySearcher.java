/**
 * Westmont College Spring 2025
 * CS 030 Lab 09
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 * @author Boaty McBoatface bmcboatface@westmont.edu TODO: replace this with your info.
 */

import java.util.NoSuchElementException;

/**
 * Provides indexOf operation on primitive integer arrays using recursive and iterative algorithms.
 */
public class BinarySearcher {

  /**
   * Recursive binary search algorithm to determine the index of <code>target</code> provided
   * in the <code>nums</code> array, if it exists; if not, throws {@link NoSuchElementException}.
   * <br><br>
   * <b>NOTE</b> Use of iteration (loops) is not allowed in this method. Use the <code>startInclusive</code>
   * and <code>endExclusive</code> indices to indicate which portion of the <code>nums</code> array
   * you are performing the binary search in with each recursive invocation.
   *
   * @param nums           integer array to search in
   * @param startInclusive inclusive index for the lower bound of the search
   * @param endExclusive   exclusive index for the upper bound of the search
   * @param target         integer you wish to find the index of, if present in <code>nums</code>
   * @return index of <code>target</code> if it exists in <code>nums</code>
   * @throws NoSuchElementException if <code>target</code> is not present in <code>nums</code>
   */
  public static int indexOfRec(int[] nums, int startInclusive, int endExclusive, int target) {
    return 0;  // TODO: Replace this with your own implementation.
  }

  /**
   * Iterative binary search algorithm to determine the index of <code>target</code> provided
   * in the <code>nums</code> array, if it exists; if not, throws {@link NoSuchElementException}.
   * <br><br>
   * <b>NOTE</b> Use of recursion is not allowed in this method. Use a single <code>while</code> loop
   * to continuously check whether each midpoint of the portion of array you're searching matches the
   * <code>target</code>, further bisecting this portion each time the midpoint does not match it.
   *
   * @param nums   integer array to search in
   * @param target integer you wish to find the index of, if present in <code>nums</code>
   * @return index of <code>target</code> if it exists in <code>nums</code>
   * @throws NoSuchElementException if <code>target</code> is not present in <code>nums</code>
   */
  public static int indexOfIter(int[] nums, int target) {
    return 0; // TODO: Replace this with your own implementation.
  }
}
