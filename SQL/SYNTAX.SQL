SELECTION:-Retrival of data by the help of only cloumn_name.

SELECT */[DISTINCT] COLUMN NAME/ EXPRESSION[ALIAS]
FROM TABLE_NAME

------------------------------------------------------------------------------------------------
PROJECTION :-

SELECT */[DISTINCT] COLUMN NAME/ EXPRESSION[ALIAS]
FROM TABLE_NAME
WHERE<filter condition>

---------------------------------------------------------------------------------------------------

SELECTION:-								ORDER & NATURE OF EXECUTION		
									1.FROM
									2.WHERE=>ROW BY ROW
									3.SELECT=>ROW BY ROW
SELECT */[DISTINCT] COLUMN_NAME/ EXPRESSION [ALIAS]
FROM TABLE_NM

------------------------------------------------------------------------------------------------------

GROUP BY:-
SELECT */[DISTINCT] COLUMN NAME/ EXPRESSION[ALIAS]			ORDER & NATURE OF EXECUTION		
									1.FROM
									2.WHERE{ IF ANY}=>ROW BY ROW
									3.GROUP BY=>ROW BY ROW
									4.HAVING=>GROUP BY GROUP
									
FROM TABLE_NAME
[WHERE<filter condition>]
GROUP BY COLUMN_NAME


------------------------------------------------------------------------------------------------------------
HAVING CLAUSE:-





SELECT */[DISTINCT] COLUMN NAME/ EXPRESSION[ALIAS]			ORDER & NATURE OF EXECUTION		
									1.FROM
									2.WHERE{ IF ANY}=>ROW BY ROW
									3.GROUP BY=>ROW BY ROW
									4.HAVING=>GROUP BY GROUP
									5.SELECT=>GROUP BY GROUP
									
FROM TABLE_NAME
[WHERE<filter condition>]
GROUP BY COLUMN_NAME
HAVING <GROUP FILTER CONDITION>
-------------------------------------------------------------------------------------------
ORDER BY:-


SELECT */[DISTINCT] COLUMN NAME/ EXPRESSION[ALIAS]			ORDER & NATURE OF EXECUTION		
									1.FROM
									2.WHERE{ IF ANY}=>ROW BY ROW
									3.GROUP BY=>ROW BY ROW
									4.HAVING=>GROUP BY GROUP
									5.SELECT=>GROUP BY GROUP
									6.ORDER BY=>ROW BY  ROW
FROM TABLE_NAME
[WHERE<filter condition>]
[GROUP BY COLUMN_NAME]
[HAVING <GROUP FILTER CONDITION>]
ORDER BY COLUMN_NM
