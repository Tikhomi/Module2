package com.msaggik.thirdlessonanalysisofthepoem;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PortIncome> incomes = new ArrayList<>();
        incomes.add(new PortIncome(1, "Аренда площадей порта", 170000));

        List<ShipService> services = new ArrayList<>();
        services.add(new ShipService(2, "Обслуживание морских судов", 125, 3500));

        // Рассчтет выручки
        PortCalculator calculator = new PortCalculator(incomes, services);
        int totalRevenue = calculator.calculateTotalRevenue();

        // Вывод результата
        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText("Выручка порта за месяц: " + totalRevenue + " монет");
    }
}
