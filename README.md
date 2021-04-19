Информация о приложении

Приложение состоит из 5 микросервисов: EmailNotification, PushNotification, SmsNotification, Registry, Gateway.
Registry является службой обнаружения сервисов, реализован с помощью Spring Eureka. Gateway представляет собой единую точку для обращения к сервисам EmailNotification, PushNotification, SmsNotification; реализован при помощи Spring Cloud Gateway. Три остальных сервиса используются для отправки сообщений тем или иным каналом: смс, пуш или по почте.

Эндпоинты

1. http://localhost:8761 - Eureka
2. http://localhost:8150 - Gateway
3. http://localhost:8141/email-notification/send - EmailNotification
4. http://localhost:8142/push-notification/send - PushNotification
5. http://localhost:8140/sms-notification/send - SmsNotification

Как это запустить

1. Перейти в каталог с программой и вызвать mvn package в терминале
2. Ввести docker compose build
3. Затема docker compose up
4. Дождаться загрузки контейнеров и можно работать

Небольшое описание сервисов

1. SmsNotification - используя POST-запрос, пошлем на /sms-notification/send запрос с телом в формате JSON.

Поля JSON: to - кому послать, from - от кого, text - текст сообщения.

Пример запроса: curl -X POST "http://localhost:8150/sms-notification/send" -d "{\"to\":\"Nikita\", \"from\":\"Bogdan\", \"text\":\"Hello\"}" -H "Content-type:application/json;charset=utf-8"

В случае успеха в логи будет выведено что кому от кого отправлено.

2. PushNotification - используя POST-запрос, пошлем на /push-notification/send запрос с телом в формате JSON.

Поля JSON: deviceId - номер устройства, subject - тема, text - текст сообщение, link - ссылка для перехода.

Пример запроса: curl -X POST "http://localhost:8150/push-notification/send" -d "{\"deviceId\":\"917208367\", \"subject\":\"Sale\", \"text\":\"Check out new prices\", \"link\":\"example.com\"}" -H "Content-type:application/json;charset=utf-8"

В случае успеха в логи будет выведено: что за пуш был отправлен и на какое устройство.

3. EmailNotification - используя POST-запрос, пошлем на /email-notification/send запрос с телом в формате JSON.

Поля JSON: to - кому послать,  from - от кого, subject - тема, headers - заголовки письма, text - текст письма.

Пример запроса: curl -X POST "http://localhost:8150/email-notification/send" -d "{\"to\":\"Nikita\", \"from\":\"Bogdan\", \"text\":\"Hello\", \"subject\":\"First message\", \"headers\": \"none\"}" -H "Content-type:application/json;charset=utf-8"

В случае успеха будет выведено в логи: кому от кого пришло письмо, каковы текст, тема и заголовки.
