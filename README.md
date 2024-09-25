# Java Time

In the context of ISO 8601 date-time formatting, T separates the date and time, Z indicates that the time is in UTC.

- **`T`**: This character serves as a delimiter between the date and time components. For example, in the string "2024-10-10T01:
10:10", T separates the date part (2024-10-10) from the time part (01:10:10).

- **`Z`**: This character denotes that the time is in Coordinated Universal Time (UTC). When you see a date-time string like "
2024-10-10T01:10:10Z", the Z at the end signifies that the time is specified in UTC, meaning there is no offset from
UTC. If a date-time string has an offset (e.g., +02:00).

<br/><br/><br/><br/>

# Database

The global time zone (@@global.time_zone) reflects the time zone set for the entire server, while the session time zone (@@session.time_zone) shows the time zone for the current session. 

```sql
SELECT @@global.time_zone, @@session.time_zone;
```

<br/><br/><br/><br/>

The following commands are used to set the time zone temporarily at the global and session levels:

```sql
# UTC base 
SET GLOBAL time_zone = '+00:00';
SET time_zone = '+00:00';

# System timezone base
SET GLOBAL time_zone = 'SYSTEM';
SET time_zone = 'SYSTEM';

# Asia/Seoul timezone base 
SET GLOBAL time_zone = 'Asia/Seoul';
SET time_zone = 'Asia/Seoul';
```

<br/><br/><br/><br/>

To make the time zone change permanent, you need to modify the MySQL configuration my.cnf file. 

```shell
[mysqld]
default-time-zone = 'Asia/Seoul'
```
