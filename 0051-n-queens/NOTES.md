​Initialize sets col, diagonal1, and diagonal2 to keep track of the occupied columns and diagonals.

Initialize an empty list res to store the solutions.

Create an empty NxN chessboard represented as a list of lists of strings called board.

Define the backtrack function, which takes an integer r representing the current row being considered.

If r equals n, it means that queens have been successfully placed in all rows (0 to n-1), so a solution has been found. Convert the board configuration to a list of strings and append it to the res list. Then, return from the function.

Iterate through each column c in the current row r.

Check if placing a queen at row r and column c would result in any conflicts. If c is in the col set or if (r+c) is in the diagonal1 set (representing the diagonal from top-left to bottom-right) or if (r-c) is in the diagonal2 set (representing the diagonal from top-right to bottom-left), skip this column and continue with the next one.

If there are no conflicts, mark the current position on the board as 'Q', add c to the col set, add (r+c) to the diagonal1 set, and add (r-c) to the diagonal2 set.

Recursively call the backtrack function for the next row by incrementing r.

After the recursive call, remove the queen from the current position by setting the corresponding square on the board back to '.' and removing c from the col set, (r+c) from the diagonal1 set, and (r-c) from the diagonal2 set.

Backtrack by considering the next column for the current row.

Finally, call the backtrack function initially with r set to 0 to start the exploration from the first row.

Return the res list containing all the valid solutions.
