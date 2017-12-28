Operators:
----------
		Equality operators are ==,!=


Property:
---------
1. We can apply equality operators for every primitive type including Boolean type also.
2. We can apply equality operator for object type also, for object references r1, r2 the r1== r2 returns true if
and only if both pointing same object ( This is called “reference comparison” or “address comparison”).
3. If we apply equality operators for object types then compulsory there should be some relations between argument types
( either child to parent or parent to child or same type) otherwise we will get compile time error saying
 “Incomparable types”:

 Notes:
 ------
 1. In general we can use == operator for reference comparison ( address comparison)
 and .equals() method for content comparison.
 2. For any object reference r, r== null is always false but null == null always return true.