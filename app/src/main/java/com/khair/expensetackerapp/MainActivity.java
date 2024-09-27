package com.khair.expensetackerapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initialize the PieChart
        PieChart pieChart = findViewById(R.id.pieChart);

        // Create a list of PieEntries (label, value)
        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(90f, "Expense"));
        entries.add(new PieEntry(70f, "Income "));





        PieDataSet dataSet = new PieDataSet(entries, "Pie Chart Example");
        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.RED);    // First slice will be red
        colors.add(Color.GREEN);  // Second slice will be green
        dataSet.setColors(colors);
        // Set colors for the PieChart slices
        //dataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        // Customize the slice selection (Optional)
        dataSet.setSliceSpace(3f);      // Space between slices
        dataSet.setSelectionShift(5f);  // Shift size when a slice is selected

        // Create PieData with the PieDataSet
        PieData data = new PieData(dataSet);
        data.setValueTextSize(12f);    // Size of value text
        data.setValueTextColor(Color.WHITE);  // Color of value text

        // Set data to the PieChart
        pieChart.setData(data);

        // Customize the PieChart appearance
        pieChart.setUsePercentValues(true);  // Display values as percentages
        pieChart.getDescription().setEnabled(false);  // Disable chart description
         // Add text to the center of the chart
        pieChart.setCenterTextSize(18f);      // Center text size
        pieChart.setHoleRadius(50f);          // Radius of the hole in the middle
        pieChart.setTransparentCircleRadius(55f);  // Transparent circle radius

        // Animate the chart
        pieChart.animateY(1000);

        // Disable legend if you don't need it
        pieChart.getLegend().setEnabled(false);

        // Refresh the chart
        pieChart.invalidate();

    }
   ///=====================================================


  ///==================================================
}