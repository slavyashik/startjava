-- Выведите всю таблицу
\echo 'Вывод всей таблицы';
SELECT *
  FROM jaegers
 ORDER BY model_name;

-- Отобразите только не уничтоженных роботов
\echo 'Вывод не уничтоженных роботов';
SELECT *
  FROM jaegers
  WHERE status <> 'Destroyed'
 ORDER BY model_name;

-- Отобразите роботов нескольких серий: Mark-1 и Mark-4
\echo 'Вывод роботов серии Mark-1 и Mark-4';
SELECT *
  FROM jaegers 
  WHERE mark IN ('Mark-1', 'Mark-4') 
 ORDER BY model_name;

-- Отобразите всех роботов, кроме Mark-1 и Mark-4 (отсортируйте таблицу по убыванию по столбцу mark)
\echo 'Вывод всех роботов, кроме Mark-1 и Mark-4, отсортированных по убыванию по столбцу mark';
SELECT *
  FROM jaegers
  WHERE mark NOT IN ('Mark-1', 'Mark-4')
 ORDER BY mark DESC, model_name;

-- Отобразите информацию о самом старом роботе
\echo 'Вывод информации о самом старом роботе';
SELECT *
  FROM jaegers
 ORDER BY launch
 ASC LIMIT 1;

-- Отобразите роботов, которые уничтожили больше всех kaiju, отобразив только данные столбцов model_name, mark, launch, kaiju_kill
\echo 'Вывод роботов, уничтоживших больше всех kaiju';
SELECT model_name, mark, launch, kaiju_kills
  FROM jaegers
 ORDER BY kaiju_kills DESC;

-- Отобразите средний вес роботов, округлив его до трех знаков после запятой
\echo 'Вывод среднего веса роботов';
SELECT ROUND(AVG(weight), 3) AS avg_weight
  FROM jaegers;

-- Увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены, а затем отобразите таблицу
\echo 'Увеличение на единицу количества уничтоженных kaiju у не уничтоженных роботов';
UPDATE jaegers
  SET kaiju_kills = kaiju_kills + 1
  WHERE status <> 'Destroyed';

SELECT *
  FROM jaegers
 ORDER BY model_name;

-- Удалите уничтоженных роботов, а затем отобразите оставшихся
\echo 'Удаление уничтоженных роботов и вывод оставшихся';
DELETE
  FROM jaegers
 WHERE status = 'Destroyed';

SELECT * 
  FROM jaegers
 ORDER BY model_name;