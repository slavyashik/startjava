\echo 'Вывод всей таблицы';
SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo 'Вывод не уничтоженных роботов';
SELECT *
  FROM jaegers
 WHERE status <> 'Destroyed'
 ORDER BY model_name;

\echo 'Вывод роботов серии Mark-1 и Mark-4';
SELECT *
  FROM jaegers 
 WHERE mark IN ('Mark-1', 'Mark-4')
 ORDER BY model_name;

\echo 'Вывод всех роботов, кроме Mark-1 и Mark-4, отсортированных по убыванию по столбцу mark';
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4')
 ORDER BY mark DESC, model_name;

\echo 'Вывод информации о самом старом роботе';
SELECT *
  FROM jaegers
 ORDER BY launch LIMIT 1;

\echo 'Вывод роботов, уничтоживших больше всех kaiju';
SELECT model_name, mark, launch, kaiju_kill
  FROM jaegers
 ORDER BY kaiju_kill DESC LIMIT 3;

\echo 'Вывод среднего веса роботов';
SELECT ROUND(AVG(weight), 3) AS average_weight
  FROM jaegers;

\echo 'Увеличение на единицу количества уничтоженных kaiju у не уничтоженных роботов';
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status <> 'Destroyed';

SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo 'Удаление уничтоженных роботов и вывод оставшихся';
DELETE FROM jaegers
 WHERE status = 'Destroyed';

SELECT * 
  FROM jaegers
 ORDER BY model_name;