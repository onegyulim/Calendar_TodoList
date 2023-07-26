import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import java.util.Calendar

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val calendarView = findViewById<MaterialCalendarView>(R.id.calendarView)
        calendarView.setOnDateChangedListener { widget, date, selected ->
            // 선택한 날짜 처리
            // 예시로 선택한 날짜를 로그로 출력합니다.
            val selectedDate: Calendar = date.calendar
            val year = selectedDate.get(Calendar.YEAR)
            val month = selectedDate.get(Calendar.MONTH) + 1 // 월은 0부터 시작하므로 +1을 해줍니다.
            val day = selectedDate.get(Calendar.DAY_OF_MONTH)
            val selectedDateString = "$year-$month-$day"
            Log.d("CalendarActivity", "Selected Date: $selectedDateString")
        }

        // 추가적인 설정 및 기능을 구현하려면 해당하는 메서드를 사용하여 설정하거나 리스너를 추가합니다.
    }
}
