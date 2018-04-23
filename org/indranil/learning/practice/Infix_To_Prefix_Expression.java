package org.indranil.learning.practice;

public class Infix_To_Prefix_Expression {

	public static void main(String[] args) {
		//1.	Reverse	the	infix	expression. 2.	Read	this	reversed	expression	from	left	to	right,	one	character	at	a	time. 3.	If	the	input	symbol	being	read	is	an	operand	then	place	it	in	the	prefix	expression. 4.	If	the	input	symbol	read	is	an	operand	then (a)	Check	if	the	priority	of	the	operator	in	the	stack	is	greater	than	the	priority	of	the incoming	(or	input)	operator	from	stack	and	place	it	in	the	prefix	expression.	Repeat Step	4(a)	till	we	get	the	operator	in	the	stack	which	has	a	greater	priority	than	the incoming	operator. (b)	Otherwise	push	the	operator	being	read. (c)	If	we	read	‘(’	as	input	symbol	then	pop	all	the	operators	until	we	get	‘)’	and	append the	popped	operator	to	the	prefix	expression. 1.	Finally	pop	the	reaming	contents	of	the	stack	and	append	them	to	the	prefix expression. 2.	Reverse	the	obtained	prefix	expression	and	print	it	as	a	result.

	}

}
