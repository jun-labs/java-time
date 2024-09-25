package project.io.app.test.unittest

import org.junit.jupiter.api.assertAll
import java.time.Clock
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.time.ZoneId
import java.time.ZoneOffset.UTC
import java.time.ZonedDateTime
import java.time.temporal.ChronoField
import java.time.temporal.ChronoUnit
import kotlin.test.Test
import kotlin.test.assertNotNull

class DateTimeUnitTest {

    @Test
    fun whenCreateLocalDateTimeThenShouldBeNotNull() {
        assertAll(
            { assertNotNull(LocalDateTime.now()) },
            { assertNotNull(LocalDateTime.from(ZonedDateTime.now())) },
            { assertNotNull(ZonedDateTime.now().toLocalDateTime()) },
            { assertNotNull(LocalDateTime.of(2024, 10, 10, 1, 10, 10)) },
            { assertNotNull(LocalDateTime.of(2024, 10, 10, 1, 10, 10, 0)) },
            { assertNotNull(LocalDateTime.parse("2024-10-10T:01:10:10")) },
            { assertNotNull(LocalDateTime.parse("2024-10-10T01:10:10.123456789")) },
            { assertNotNull(LocalDate.of(2024, 10, 10).atTime(1, 10, 10)) },
            { assertNotNull(ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toLocalDateTime()) },
            { assertNotNull(LocalDateTime.ofEpochSecond(1_700_000_000L, 0, UTC)) },
            { assertNotNull(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault())) },

            { assertNotNull(LocalDateTime.now().withHour(10).withMinute(30)) },
            { assertNotNull(LocalDateTime.now().with(ChronoField.YEAR, 2024)) },
            { assertNotNull(LocalDateTime.now().withDayOfMonth(15)) },
            { assertNotNull(LocalDateTime.now().withMonth(8)) },
            { assertNotNull(LocalDateTime.now().withSecond(0).withNano(0)) },
            { assertNotNull(LocalDateTime.now().with(ChronoField.DAY_OF_WEEK, 5)) },
            { assertNotNull(LocalDateTime.now().withDayOfYear(300)) },
            { assertNotNull(LocalDateTime.of(2024, 1, 1, 0, 0).withHour(23).withMinute(59)) },
            { assertNotNull(LocalDateTime.of(2024, 10, 10, 1, 10, 10).withNano(0)) },

            { assertNotNull(LocalDateTime.now().plusDays(5).plusHours(3)) },
            { assertNotNull(LocalDateTime.of(2024, 10, 10, 1, 10, 10).plusDays(1)) },
            { assertNotNull(LocalDateTime.now().plus(5, ChronoUnit.HOURS)) },
            { assertNotNull(LocalDateTime.of(2024, 10, 10, 1, 10).plus(1, ChronoUnit.YEARS)) },
            { assertNotNull(LocalDateTime.now().plus(100, ChronoUnit.DAYS)) },
            { assertNotNull(LocalDateTime.now().plusWeeks(2).minusMinutes(30)) },

            { assertNotNull(LocalDateTime.now().minusWeeks(2).minusMinutes(15)) },
            { assertNotNull(LocalDateTime.of(2024, 10, 10, 1, 10, 10).minusHours(2)) },
            { assertNotNull(LocalDateTime.now().minus(2, ChronoUnit.MONTHS)) },
            { assertNotNull(LocalDateTime.now().minus(1000, ChronoUnit.SECONDS)) },

            { assertNotNull(LocalDate.now().atStartOfDay()) },
            { assertNotNull(LocalDateTime.of(2024, 10, 31, 23, 59, 59)) },
            { assertNotNull(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES)) },
            { assertNotNull(LocalDateTime.now(Clock.systemUTC())) },
            { assertNotNull(LocalDateTime.of(2024, Month.OCTOBER, 10, 1, 10)) },
            { assertNotNull(LocalDateTime.ofInstant(Instant.ofEpochSecond(1_000_000_000L), UTC)) }
        )
    }
}
