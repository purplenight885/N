package com.nightmare.app.data

data class LogStep(val title: String, val note: String)

data class Car(
    val name: String,
    val engine: String,
    val drive: String,
    val power: String,
    val mods: List<String>,
    val log: List<LogStep>
)

enum class PlaceType(val label: String) {
    MEET("Встречи"),
    SERVICE("Сервисы"),
    SHOP("Магазины"),
    WASH("Мойки"),
    SPOT("Площадки"),
    EVENT("Мероприятия")
}

/** x и y — положение на схематичной карте в долях от 0 до 1. */
data class Place(
    val name: String,
    val type: PlaceType,
    val info: String,
    val x: Float,
    val y: Float
)

data class Post(
    val author: String,
    val car: String,
    val text: String,
    val likes: Int
)

data class Member(
    val name: String,
    val car: String,
    val interest: String
)

object SampleData {
    val cars = listOf(
        Car(
            name = "Nissan Silvia S15",
            engine = "SR20DET 2.0 turbo",
            drive = "RWD",
            power = "320 л.с.",
            mods = listOf(
                "Турбина GT2860",
                "Койловеры + стойки",
                "Самоблок LSD",
                "Выхлоп 3\" из нержавейки"
            ),
            log = listOf(
                LogStep("Покупка", "Взял стоковую S15 из Японии"),
                LogStep("Ремонт", "Подвеска, замена всех сальников"),
                LogStep("Модификации", "Турбо-кит и выхлоп"),
                LogStep("Настройка", "Прошивка на диностенде"),
                LogStep("Результат", "320 л.с., первая дрифт-сессия")
            )
        ),
        Car(
            name = "Toyota Chaser JZX100",
            engine = "1JZ-GTE 2.5 turbo",
            drive = "RWD",
            power = "280 л.с.",
            mods = listOf("Одиночный турбо-кит", "Обвес", "Диски 18\""),
            log = listOf(
                LogStep("Покупка", "Привезён из Владивостока"),
                LogStep("Ремонт", "Замена ремня ГРМ и помпы"),
                LogStep("Модификации", "Ставим одиночный турбо")
            )
        )
    )

    val places = listOf(
        Place("Ночной паркинг", PlaceType.MEET, "Встреча по пятницам, 22:00", 0.20f, 0.30f),
        Place("Drift Garage", PlaceType.SERVICE, "Подвеска, диагностика, настройка", 0.55f, 0.22f),
        Place("JDM Parts", PlaceType.SHOP, "Запчасти и расходники из Японии", 0.78f, 0.38f),
        Place("Turbo Wash", PlaceType.WASH, "Детейлинг и мойка до 03:00", 0.38f, 0.60f),
        Place("Трек «Кольцо»", PlaceType.SPOT, "Площадка для дрифта и тайм-аттака", 0.82f, 0.72f),
        Place("Night Fest", PlaceType.EVENT, "Автовыставка на выходных", 0.15f, 0.78f)
    )

    val posts = listOf(
        Post("drift_kz", "Silvia S15", "Первая ночная сессия после настройки. Звук — огонь.", 128),
        Post("jzx_boy", "Chaser JZX100", "Поставили одиночный турбо, завтра на диностенд.", 87),
        Post("classic_ru", "Волга ГАЗ-24", "Реставрация: кузов готов, дальше мотор.", 64),
        Post("street_crew", "Meet #12", "Встреча в пятницу, паркинг у набережной. Все свои.", 203)
    )

    val members = listOf(
        Member("Алишер", "Silvia S15", "Дрифт"),
        Member("Марат", "Chaser JZX100", "JDM"),
        Member("Диас", "Mark II JZX90", "Свапы"),
        Member("Влад", "Волга ГАЗ-24", "Классика"),
        Member("Камила", "Skyline R34", "Редкие машины")
    )
}
