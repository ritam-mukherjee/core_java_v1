
--------------------------------------------------------------------------------------------------------------------
												LinkedList
--------------------------------------------------------------------------------------------------------------------

Insert At End
--------------
1. Mainly one Pointer is used:
		A. CURRENT -> the node which is presently processing
2. List is Empty?
		[ HEAD ==NULL] then HEAD= CURRENT;
3. Elements are present?
		Start from HEAD node reach till the particular node which pointing to NULL node	[ while CURRNT.NEXT=NULL ]
4.got last element?
		If it got element then CURRENT.NEXT will point to new NODE;
	

Insert At Particular Position
------------------------------
1. Three pointers mainly used
		A. 	ELEMENT  -> The node which is going to insert
		B. 	PREVIOUS -> The location where is going to insert
		C 	CURRENT -> the node which is presently processing,
2. List is Empty?
		[ HEAD ==NULL] then HEAD= CURRENT;
3. Invalid Position? 
		POSITION >= '0' && POSITION<= length -1   => "Invalid Position"
4. Valid Position?
		A. Is Inserttion and the First Location?
			POSITION == 1? - YES
				ELEMENT.NEXT=HEAD;
				HEAD=ELEMENT;
		B. Is position more than 1?
			I. 	PREVIOUS point to 'HEAD' location & count start from'1' position.
			II. traverse : HEAD --> 'Position -1'  < while (count < position - 1)>
			III. reach destination?
					CURRENT <- PREVIOUS.NEXT;  	 --assigning
					PREVIOUS.NEXT= ELEMENT;		 --cutting
					ELEMENT.NEXT=CURRENT; 		 --joining
					
		

		
Delete At Particular Postion
------------------------------
1. Mainly two pointers needed:
		PREVIOUS -> The location where is going to insert
		CURRENT -> the node which is presently processing,
2. Is th list Empty?
			[LIST==NULL] --'underflow'
3. Invalid Position? 
		POSITION >= '0' && POSITION<= length -1   => "Invalid Position"
4. Valid Position?
	A. Is Inserttion and the First Location?
			POSITION == 1? - YES
			HEAD=HEAD.NEXT
	B. Is position more than 1?
			I. 	PREVIOUS point to 'HEAD' location & count start from'1' position.
			II. traverse : HEAD --> 'Position -1'  < while (count < position - 1)>
			III. Assignment	: PREVIOUS.NEXT= PREVIOUS.NEXT.NEXT
		
		
		
		

	





QUEUE
--------------

1. All QUEUE calls having an inner class NODE which exist only if QUEUE exist.
2. The NODE having two parts one DATA and another reference

















		
		
		
		
		
		
		
		
		
		
		
		
		
		
		