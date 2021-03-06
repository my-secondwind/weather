Сервис запрашивает данные по прогнозу погоды на ближайшие 7 дней от API Яндекс.Погоды, анализирует их и вычисляет статистику по облачности за полученные дни.

Получить данные по запросу GET /cloudiness.

Пример ответ:
```json
{
    "id": 2,
    "startDate": "2021-02-15T00:00:00.000+00:00",
    "endDate": "2021-02-21T00:00:00.000+00:00",
    "clearDay": 2,
    "slightlyCloudyDay": 1,
    "cloudyDay": 1,
    "overcastDay": 3
}
```

Что можно улучшить в сервисе:
- Отсутствие авторизации и аутентификации.
- Указание констант URL, хедера и значения хедера в теле класса. Можно перенести в проперти.
- Подсчет количества дней по типам облачности реализован нерационально (обхода листа 4 раза, см. computeCloudinessInfo). Можно придумать более эффективный адгоритм.
- Отсутствуют тесты.
