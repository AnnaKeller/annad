Feature: Тестируем страницу авторизации
  As an employee of the company
  I want to login my employee profile using my credentials
  In order to collaborate with my colleagues

  Scenario: Успешная авторизация
    Given Я нахожусь на домашней странице
    Then Я нажимаю ссылку signIn
    When Ввожу логин 'annaqa122@gmail.com'
    And Ввожу пароль 'password'
    And нажимаю отправить
    Then Я ожидаю увидеть 'Анна Drevnyak' link
    Then Нажимаю logout