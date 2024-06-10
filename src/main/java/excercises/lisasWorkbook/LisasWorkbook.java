package excercises.lisasWorkbook;

import java.util.List;

/**
 * Daniel Nacher
 * 2024-06-10
 *
 * Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters. Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. The format of Lisa's book is as follows:
 *
 * There are n chapters in Lisa's workbook, numbered from 1 to n.
 * The i^th chapter has arr[i] problems, numbered from 1 to arr[i].
 * Each page can hold up to k problems. Only a chapter's last page of exercises may contain fewer than k problems.
 * Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
 * The page number indexing starts at 1.
 * Given the details for Lisa's workbook, can you count its number of special problems?
 *
 * Example
 * arr = [4, 2]
 * k = 3
 *
 * Lisa's workbook contains arr[1]=4 problems for chapter 1, and arr[2]= 2 problems for chapter 2. Each page can hold
 * k= 3 problems.
 *
 * The first page will hold 3 problems for chapter 1. Problem 1 is on page 1, so it is special. Page 2 contains only
 * Chapter 1, Problem 4, so no special problem is on page 2. Chapter 2 problems start on page 3 and there are 2 problems.
 * Since there is no problem 3 on page 3, there is no special problem on that page either. There is  special problem in
 * her workbook.
 *
 */
public class LisasWorkbook {

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int maxExPerPage = k;
        int totalSpecialExcercise = 0;
        int currentPage = 1;
        for(Integer numExercise: arr) {
            for(int currentEx=1; currentEx<=numExercise; currentEx++) {
                if(currentPage==currentEx) {
                    totalSpecialExcercise++;
                }
                if ((currentEx % maxExPerPage == 0) || (currentEx == numExercise)) {
                    currentPage++;
                }
            }
        }

        return totalSpecialExcercise;
    }

}
