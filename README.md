https://andersondocarmo.wordpress.com/2018/06/28/agendando-tarefas-com-spring-boot/

# Schedule

This project is an example using the Quartz Scheduler with Spring Boot.

    @EnableScheduling is used to enable support for scheduling tasks and @Scheduled annotation.
    @Scheduled is used in the method to perform the scheduling.

**<h3>Properties for @Scheduled:</h3>**
**cron** - A cron-like expression, extending the usual UN*X definition to include triggers on the second as well as minute, hour, day of month, month and day of week.<br />
**long fixedDelay** - Execute the annotated method with a fixed period in milliseconds between the end of the last invocation and the start of the next.<br />
**String fixedDelayString** - Execute the annotated method with a fixed period in milliseconds between the end of the last invocation and the start of the next.<br />
**long	fixedRate** - Execute the annotated method with a fixed period in milliseconds between invocations.<br />
**String fixedRateString** - Execute the annotated method with a fixed period in milliseconds between invocations.<br />
**long	initialDelay** - Number of milliseconds to delay before the first execution of a fixedRate() or fixedDelay() task.<br />
**String initialDelayString** - Number of milliseconds to delay before the first execution of a fixedRate() or fixedDelay() task.<br />
**String zone** - A time zone for which the cron expression will be resolved.<br />

**<h3>Cron expression:</h3>**

    <second> <minute> <hour> <day-of-month> <month> <day-of-week> <year>(optional)

**\* (all)** – it is used to specify that event should happen for every time unit. For example, “*” in the <minute> field – means “for every minute”<br />
**? (any)** – it is utilized in the <day-of-month> and <day-of -week> fields to denote the arbitrary value – neglect the field value. For example, if we want to fire a script at “5th of every month” irrespective of what the day of the week falls on that date, then we specify a “?” in the <day-of-week> field<br />
**– (range)** – it is used to determine the value range. For example, “10-11” in <hour> field means “10th and 11th hours”
, (values) – it is used to specify multiple values. For example, “MON, WED, FRI” in <day-of-week> field means on the days “Monday, Wednesday, and Friday”<br />
**/ (increments)** – it is used to specify the incremental values. For example, a “5/15” in the <minute> field, means at “5, 20, 35 and 50 minutes of an hour”<br />
**L (last)** – it has different meanings when used in various fields. For example, if it’s applied in the <day-of-month> field, then it means last day of the month, i.e. “31st for January” and so on as per the calendar month. It can be used with an offset value, like “L-3“, which denotes the “third to last day of the calendar month”. In the <day-of-week>, it specifies the “last day of a week”. It can also be used with another value in <day-of-week>, like “6L“, which denotes the “last Friday”<br />
**W (weekday)** – it is used to specify the weekday (Monday to Friday) nearest to a given day of the month. For example, if we specify “10W” in the <day-of-month> field, then it means the “weekday near to 10th of that month”. So if “10th” is a Saturday, then the job will be triggered on “9th”, and if “10th” is a Sunday, then it will trigger on “11th”. If you specify “1W” in the <day-of-month> and if “1st” is Saturday, then the job will be triggered on “3rd” which is Monday, and it will not jump back to the previous month<br />
**#** – it is used to specify the “N-th” occurrence of a weekday of the month, for example, “3rd Friday of the month” can be indicated as “6#3“<br />

**<h3>Example patterns:</h3>**

"0 0 * * * *" = the top of every hour of every day.<br />
"*/10 * * * * *" = every ten seconds.<br />
"0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.<br />
"0 0 6,19 * * *" = 6:00 AM and 7:00 PM every day.<br />
"0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30, 10:00 and 10:30 every day.<br />
"0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays<br />
"0 0 0 25 12 ?" = every Christmas Day at midnight
