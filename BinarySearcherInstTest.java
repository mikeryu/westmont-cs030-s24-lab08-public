/**
 * Westmont College Spring 2024
 * CS 030 Lab 08
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

/* ***************************************
 *   DO NOT MODIFY ANYTHING IN THIS FILE
 * **************************************/

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BinarySearcherInstTest {

  static int[] seqArr;
  static List<Integer> seqList;

  static int[] randArr;
  static List<Integer> randList;

  @BeforeAll
  static void setUp() {
    seqArr = IntStream.range(0, 1000).toArray();
    seqList = new ArrayList<>(Arrays.stream(seqArr).boxed().toList());

    randArr = IntStream.generate(() -> new Random().nextInt(1000)).limit(1000).toArray();
    randList = Arrays.stream(randArr).boxed().distinct().collect(Collectors.toList());
    randArr = randList.stream().mapToInt(i -> i).toArray();
  }

  @Test
  void indexOfRecSeq() {
    Arrays.sort(seqArr);
    Collections.sort(seqList);

    for (int i = 0; i < seqArr.length; i++) {
      int expected = seqList.indexOf(i);
      int actual = BinarySearcher.indexOfRec(seqArr, 0, seqArr.length, i);
      assertEquals(expected, actual,
          String.format("expected index of %d for the target value of %d, but got %d as the index instead",
              expected, i, actual));
    }

    assertThrows(NoSuchElementException.class,
        () -> BinarySearcher.indexOfRec(seqArr, 0, seqArr.length, seqArr.length));
  }

  @Test
  void indexOfRecRand() {
    Arrays.sort(randArr);
    Collections.sort(randList);

    for (int target : randArr) {
      int expected = randList.indexOf(target);
      int actual = BinarySearcher.indexOfRec(randArr, 0, randArr.length, target);
      assertEquals(expected, actual,
          String.format("expected index of %d for the target value of %d, but got %d as the index instead",
              expected, target, actual));
    }

    assertThrows(NoSuchElementException.class,
        () -> BinarySearcher.indexOfRec(randArr, 0, randArr.length, 1001));
  }

  @Test
  void indexOfIterSeq() {
    Arrays.sort(seqArr);
    Collections.sort(seqList);

    for (int i = 0; i < seqArr.length; i++) {
      int expected = seqList.indexOf(i);
      int actual = BinarySearcher.indexOfIter(seqArr, i);
      assertEquals(expected, actual,
          String.format("expected index of %d for the target value of %d, but got %d as the index instead",
              expected, i, actual));
    }

    assertThrows(NoSuchElementException.class, () -> BinarySearcher.indexOfIter(seqArr, seqArr.length));
  }

  @Test
  void indexOfIterRand() {
    Arrays.sort(randArr);
    Collections.sort(randList);

    for (int target : randArr) {
      int expected = randList.indexOf(target);
      int actual = BinarySearcher.indexOfIter(randArr, target);
      assertEquals(expected, actual,
          String.format("expected index of %d for the target value of %d, but got %d as the index instead",
              expected, target, actual));
    }

    assertThrows(NoSuchElementException.class,
        () -> BinarySearcher.indexOfIter(randArr,1001));
  }
}