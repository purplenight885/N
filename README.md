# NIGHTMARE

Мобильное приложение для автомобильных проектов: гараж, сообщество и карта автомобильной жизни города.
Сделано по презентации «Team Nightmare» (Kotlin + Jetpack Compose).

## Разделы (нижнее меню)

| Раздел | Что внутри |
|---|---|
| HOME | Лента и рекомендации, быстрые переходы |
| GARAGE | Профиль авто (двигатель, привод, мощность, модификации, фото), Project Log, добавление авто и этапов |
| MAP | Night Map: встречи, сервисы, магазины, мойки, площадки, мероприятия, фильтры |
| COMMUNITY | Люди и проекты, подписки |
| PROFILE | Профиль и информация о приложении |

Палитра: BLACK / PURPLE / RED / WHITE.

> Данные демонстрационные, хранятся только в памяти (после перезапуска сбрасываются). Карта схематичная, без Google Maps.

## Запуск в Android Studio

1. File → Open → выбрать папку проекта.
2. Дождаться Gradle Sync (нужен JDK 17 — он идёт в составе Android Studio).
3. Run ▶ на эмуляторе или телефоне (minSdk 26 / Android 8.0).

## Сборка APK через GitHub Actions

1. Создайте репозиторий на GitHub и загрузите проект:
   ```bash
   git init
   git add .
   git commit -m "Initial commit"
   git branch -M main
   git remote add origin https://github.com/<user>/<repo>.git
   git push -u origin main
   ```
2. Во вкладке **Actions** запустится workflow **Build APK** (или запустите вручную: Run workflow).
3. После завершения откройте запуск → раздел **Artifacts** → скачайте `Nightmare-debug-apk`.
4. Внутри архива лежит `app-debug.apk` — установите его на телефон (разрешите установку из неизвестных источников).

Файл workflow: `.github/workflows/build-apk.yml`.
