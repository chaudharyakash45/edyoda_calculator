2=
 Display all the Salesperson whose all orders worth is more than Rs. 2000.

Select odate, snum, max(amt)
from orders
where amt > 2000
group by odate, snum
order by odate,snum;

3=
Count the number of Salesperson belonging to Newyork.

SELECT distinct COUNT(sname),comm,city from salespeople where city='newyork';

4=
Find all salespeople  located in london and paris
Select sname, cname
 from cust, salespeople
 where
       salespeople.city = 'London','paris';
      



1=
Count the number of Salesperson whose name begin with ‘a’/’A’.

 select *from salespeople where count(sname like 'a');



5=
Display the number of orders taken by each Salesperson and their date of orders.

ns:- SELECT amt,odate from orders;
