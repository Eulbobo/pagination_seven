# Pagination seven

https://codingdojo.org/kata/PaginationSeven/

## Part I

First of all, we need to represent all pages until 7, the goal is to show the current page between ( and ), as examples:

Page 2 of 5: <br />`1 (2) 3 4 5`

Page 6 of 7: <br />`1 2 3 4 5 (6) 7`

## Part II

Now we need to see first, last, previous and next page, but only using 7 slots when total pages number is above 7. So we
need to replace group of pages with …, here are some examples:

Page 42 of 100 : <br />`1 … 41 (42) 43 … 100`

Page 5 of 9: <br />`1 … 4 (5) 6 … 9`

## Part III

Sometimes we don’t need to show … because we are in the first part of the pagination, so we will have:

Page 2 of 9: <br />`1 (2) 3 4 5 … 9`

Page 4 of 9: <br />`1 2 3 (4) 5 … 9`

## Part IV

As you may notice, there is the same idea but for the last part of the pagination:
Page 8 of 9: <br />`1 … 5 6 7 (8) 9`

Page 6 of 9: <br />`1 … 5 (6) 7 8 9`