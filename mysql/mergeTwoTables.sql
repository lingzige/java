题目：leetcode mysql 第175题，组合两个表



表1: Person

+-------------+---------+
| 列名         | 类型     |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
PersonId 是上表主键
表2: Address

+-------------+---------+
| 列名         | 类型    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
AddressId 是上表主键
 

编写一个 SQL 查询，满足条件：无论 person 是否有地址信息，都需要基于上述两表提供 person 的以下信息：

 

FirstName, LastName, City, State

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/combine-two-tables
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。



因为不管有没有地址信息都要查询出来人的信息，所以就不能使用默认的 inner join, inner join 是查询两个表都匹配的内容，
left join 则是会将左边表中的所有内容都匹配，而不管右边的表是否存在
select FirstName, LastName, City, State from Person as p left join Address as a on p.PersonId=a.PersonId;